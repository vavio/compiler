using System;
using System.Collections;
using System.Collections.Generic;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Rimal_Emulator_and_Debugger
{
    class Engine
    {
        public enum Cell 
        {
            Empty,
            Wall, 
            Coin
        };

        public List<String> Instructions { get; set; }
        public int InstructionPointer { get; set; }
        public Dictionary<string, int> Labels { get; set; }
        public List<Wall> walls;

        public Stack Stack { get; set; }
        public List<ActivationRecord> ActivationRecords { get; set; }
        public Cell[][] Enviorment { get; set; }

        public int RegN {get; set;}  //acumulator
        public char RegD { get; set; } //nasoka
        public short RegC { get; set; } //zeton ili zid
        public int RegFlag { get; set; } //flag registar
        public int RegTC { get; set; } //kolku zetoni ima zemeno

        public int X { get; set; }
        public int Y { get; set; }
        public const int proportion = 50;

        public void Reset()
        {
            //Labels.Clear();
            Stack.Clear();
            ActivationRecords.Clear();
        }

        public Engine()
        {
            Stack = new Stack();
            Instructions = new List<string>();
            ActivationRecords = new List<ActivationRecord>();
            Labels = new Dictionary<string, int>();
            walls = new List<Wall>();
            RegD = 'с';
        }

        public void CreateEnviorment(int x, int y)
        {
            Enviorment = new Cell[x*2 + 2][];
            for (int i = 0; i < x * 2 + 2; i++)
            {
                Enviorment[i] = new Cell[y * 2 + 2];
            }

            for (int i = 0; i < x * 2 + 2; i++)
            {
                Enviorment[i][0] = Cell.Wall;
                Enviorment[i][y*2+1] = Cell.Wall;
            }

            for (int i = 0; i < y * 2 + 2; i++)
            {
                Enviorment[x][i] = Cell.Wall;
                Enviorment[x*2 + 1][i] = Cell.Wall;
            }
        }

        public void AddCoin(int x, int y)
        {
            x = ConvertToInternalPosition(x);
            y = ConvertToInternalPosition(y);

            if (Enviorment[x][y] == Cell.Empty)
            {
                Enviorment[x][y] = Cell.Coin;
            }
            else
            {
                throw new Exception("На позицијата веќе постои друг жетон или ѕид.");
            }
        }

        public void AddWall(string pravec, int ulica, int od, int doo)
        {
            Wall wall = new Wall();
            wall.Pravec = pravec;
            wall.Ulica = ulica;
            wall.Od = od;
            wall.Doo = doo;
            walls.Add(wall);

            ulica = ConvertToInternalPosition(ulica);
            od = ConvertToInternalPosition(od);
            doo = ConvertToInternalPosition(doo);

            if (pravec == "из")
            {
                for (int i=od; i<doo; i++)
                {
                    Enviorment[i][ulica+1] = Cell.Wall;
                }
            }
            else if(pravec == "сј")
            {
                for (int i=od; i<doo; i++)
                {
                    Enviorment[ulica+1][i] = Cell.Wall;
                }
            }   
            else
            {
                throw new Exception("Невалиден правец за ѕид.");
            }

           
        }

        public void AddLabel(string name, int position)
        {
            if (!Labels.ContainsKey(name))
            {
                Labels.Add(name, position);
            }
            else
            {
                throw new Exception("Лабелата веќе постои.");
            }
        }


        public Image DrawImage()
        {
            int xSize = Enviorment.Length / 2;
            int ySize = Enviorment[0].Length / 2;

            Image image = new Bitmap(xSize * proportion, ySize * proportion);
            Graphics graph = Graphics.FromImage(image);
            graph.InterpolationMode = InterpolationMode.HighQualityBilinear; //mozda ke treba da se smeni

            int y = proportion;
            for (int i = 0; i < ySize; i++)
            {
                graph.DrawLine(new Pen(Color.Black), 0, y, xSize * proportion + proportion, y);
                y += proportion;
            }

            int x = proportion;
            for (int i = 0; i < xSize; i++)
            {
                graph.DrawLine(new Pen(Color.Black), x, 0, x, ySize * proportion + proportion);
                x += proportion;
            }

            for (int j = 0; j < Enviorment[0].Length; j++) // y pozicija
            {
                for (int i = 0; i < Enviorment.Length; i++) //x pozicija
                {
                    Cell cell = Enviorment[i][j];
                    if (cell == Cell.Coin)
                    {
                        int externalX = ConvertToExternalPosition(i);
                        int externalY = ConvertToExternalPosition(j);
                        graph.FillEllipse(new SolidBrush(Color.Gold), externalX * proportion - 15, image.Size.Height - externalY * proportion - 15 , 30, 30);
                        //MessageBox.Show(externalX + " " + externalY);
                    }
                }
            }


            DrawRobot(graph, image);
            DrawWalls(graph, image);
            graph.DrawRectangle(new Pen(Color.Green, 4), 2, 2, image.Size.Width-4, image.Size.Height-4);
            return image;
        }

        private void DrawWalls(Graphics graph, Image image)
        {
            Pen pen = new Pen(Color.Black, 3);
            Brush brush = new HatchBrush(HatchStyle.LargeConfetti, Color.Gray);
            foreach (Wall w in walls)
            {
                if (w.Pravec == "из")
                {
                    //MessageBox.Show(w.Ulica + ": " + w.Od + " " + w.Doo);
                    //int x = ConvertToInternalPosition(w.Ulica) * proportion + proportion / 2;
                    int y = image.Size.Height - w.Ulica * proportion - proportion / 2;
                    int x1 = w.Od * proportion - proportion / 2;
                    int x2 = w.Doo * proportion + proportion / 2;
                    //graph.DrawLine(pen, x1, y, x2, y);
                    graph.FillRectangle(brush, x1-2, y-2, x2 - x1 + 5, 4);
                }
                else
                {
                    int x = w.Ulica * proportion + proportion / 2;
                    int y1 = image.Size.Height - w.Od * proportion + proportion / 2;
                    int y2 = image.Size.Height - w.Doo * proportion - proportion / 2;
                    //graph.DrawLine(pen, x, y1, x, y2);
                    graph.FillRectangle(brush, x - 2, y2 - 2, 4, y1 - y2 + 4);
                }
            }
        }

        private void DrawRobot(Graphics graph, Image image)
        {
            Pen pen = new Pen(Color.Black, 6);
            Brush brush = new SolidBrush(Color.Black);
            int x = X * proportion;
            int y = image.Size.Height - Y * proportion;

            if (RegD == 'з')
            {
                graph.DrawLine(pen, x, y, x + 25, y - 25);
                graph.DrawLine(pen, x, y, x + 25, y + 25);
            }
            else if (RegD == 'ј')
            {
                graph.DrawLine(pen, x, y, x - 25, y - 25);
                graph.DrawLine(pen, x, y, x + 25, y - 25);
            }
            else if (RegD == 'и')
            {
                graph.DrawLine(pen, x, y, x - 25, y - 25);
                graph.DrawLine(pen, x, y, x - 25, y + 25);
                
            }
            else if (RegD == 'с')
            {
                graph.DrawLine(pen, x, y, x - 25, y + 25);
                graph.DrawLine(pen, x, y, x + 25, y + 25);
            }
            else
            {
                throw new Exception("Невалиден правец за роботот.");
            }
            graph.FillRectangle(brush, x-2, y-2, 5, 5);
        }


        public void ScanProgram()
        {
            Labels = new Dictionary<string, int>();
            try
            {
                int lineNumber = 0;
                foreach (String s in Instructions)
                {
                    String[] args = s.Trim().ToLower().Split(' ');

                    if (args[0] == "envs")
                    {
                        CreateEnviorment(Convert.ToInt32(args[1]), Convert.ToInt32(args[2]));
                    }
                    else if (args[0] == "wallp")
                    {
                        AddWall(args[1], Convert.ToInt32(args[2]), Convert.ToInt32(args[3]), Convert.ToInt32(args[4]));
                    }
                    else if (args[0] == "coinp")
                    {
                        AddCoin(Convert.ToInt32(args[1]), Convert.ToInt32(args[2]));
                    }
                    else if (args[0] == "robotp")
                    {
                        X = Convert.ToInt32(args[1]);
                        Y = Convert.ToInt32(args[2]);
                    }
                    else if (args[0].Contains(':'))
                    {
                        AddLabel(args[0].Replace(":", ""), lineNumber);
                    }
                    else if (args[0] == "move")
                    {
                        if (args[1] == "regd")
                        {
                            RegD = Convert.ToChar(args[2]);
                        }
                        
                    }
                    lineNumber++;
                }
            }
            catch (Exception ex)
            {
                throw ex;
            }
            //MessageBox.Show(EnviormentToString());
        }


        public void Go()
        {
            try
            {
                int internalX = ConvertToInternalPosition(X);
                int internalY = ConvertToInternalPosition(Y);

                if (RegD == 'з')
                {
                    internalX--;
                    X--;
                    //checkForWall(internalX, internalY);
                }
                else if (RegD == 'ј')
                {
                    internalY--;
                    Y--;
                    //checkForWall(internalX, internalY);
                }
                else if (RegD == 'и')
                {
                    internalX++;
                    X++;
                    //checkForWall(internalX, internalY);
                }
                else if (RegD == 'с')
                {
                    internalY++;
                    Y++;
                    //checkForWall(internalX, internalY);
                }
                else
                {
                    throw new Exception("Невалиден правец за роботот.");
                }

             
               checkForWall(internalX, internalY);
               updateWallAndCoinRegister();
            }
            catch (Exception ex)
            {
                throw ex;
            }
        }

        public void checkForWall(int x, int y)
        {
            try
            {
                if (Enviorment[x][y] == Cell.Wall)
                {
                    // Cause index out of bounds exception
                }
            }
            catch (Exception ex)
            {
                throw new Exception("Робот излезе надвор од околината.");
            }


            if (Enviorment[x][y] == Cell.Wall)
            {
                throw new Exception("Роботот удри во ѕид");
            }
            
        }

        public void updateWallAndCoinRegister()
        {
            short coin = 0;
            if (Enviorment[ConvertToInternalPosition(X)][ConvertToInternalPosition(Y)] == Cell.Coin)
            {
                coin = 1;
            }
      
            short wall = 0;
            int internalX = ConvertToInternalPosition(X);
            int internalY = ConvertToInternalPosition(Y);
            if (RegD == 'з')
            {
                internalX--;
            }
            else if (RegD == 'ј')
            {
                internalY--;
            }
            else if (RegD == 'и')
            {
                internalX++;
            }
            else if (RegD == 'с')
            {
                internalY++;
            }
            else
            {
                throw new Exception("Невалиден правец за роботот.");
            }

            
            if (Enviorment[internalX][internalY] == Cell.Wall)
            {
                wall = 10;
            }
            RegC = (short)(wall + coin);
        }

        public void turnLeft()
        {
            if (RegD == 'з')
            {
                RegD = 'ј';
            }
            else if (RegD == 'ј')
            {
                RegD = 'и';
            }
            else if (RegD == 'и')
            {
                RegD = 'с';
            }
            else if (RegD == 'с')
            {
                RegD = 'з';
            }
            else 
            {
                throw new Exception("Невалиден правец за роботот.");
            }
        }

        public void turnRight()
        {
            if (RegD == 'з')
            {
                RegD = 'с';
            }
            else if (RegD == 'с')
            {
                RegD = 'и';
            }
            else if (RegD == 'и')
            {
                RegD = 'ј';
            }
            else if (RegD == 'ј')
            {
                RegD = 'з';
            }
            else
            {
                throw new Exception("Невалиден правец за роботот.");
            }
        }


        public void Start()
        {
            ActivationRecord newAR = new ActivationRecord();
            newAR.Name = "main";
            newAR.ReturnAddress = -1;
            InstructionPointer = Labels["main"];
            ActivationRecords.Add(newAR);
            //Execute();
        }

        public bool hasNextInstruction()
        {
            if (ActivationRecords.Count == 0)
            {
                return false;
            }
            return InstructionPointer <= Instructions.Count - 1;
        }

        public void Execute()
        {
            String instruction = Instructions[InstructionPointer].Trim().ToLower();
            String[] args = instruction.Split(' ');

            if (ActivationRecords.Count == 0)
            {
                return;
            }
            else if (ActivationRecords.Count > 50)
            {
                throw new Exception("Настана активациски overflow.");
            }
            else if (instruction.Contains(':'))
            {
            }
            else if (args[0] == "ret")
            {
                InstructionPointer = getCurrentActivationRecord().ReturnAddress;
                ActivationRecords.RemoveAt(ActivationRecords.Count - 1);
            }
            else if (args[0] == "inc")
            {
                RegN++;
                if (RegN > 9999999)
                {
                    throw new Exception("Настана overflow во regN. Максимална дозволена големина на податоци од тип бро е 9999999.");
                }

            }
            else if (args[0] == "push")
            {
                Stack.Push(RegN);
            }
            else if (args[0] == "pop")
            {
                RegN = Convert.ToInt32(Stack.Pop());
            }
            else if (args[0] == "move")
            {
                ActivationRecord currentAR = getCurrentActivationRecord();
                if (args[1] == "regn")
                {
                    if (currentAR.ContainsVariable(args[2]))
                    {
                        RegN = Convert.ToInt32(currentAR.GetVariableValue(args[2]));
                    }
                    else
                    {
                        RegN = Convert.ToInt32(args[2]);
                    }
                }
                else
                {
                    if (args[2] == "regn")
                    {
                        currentAR.SetVariableValue(args[1], RegN.ToString());
                    }
                    else if (currentAR.ContainsVariable(args[2]))
                    {
                        currentAR.SetVariableValue(args[1], currentAR.GetVariableValue(args[2]));
                    }
                    else
                    {
                        currentAR.SetVariableValue(args[1], args[2]);
                    }

                }

            }
            else if (args[0] == "cmp")
            {
                ActivationRecord currentAR = getCurrentActivationRecord();

                if (args[1] == "regn")
                {
                    if (currentAR.ContainsVariable(args[2]))
                    {
                        RegFlag = RegN.CompareTo(Convert.ToInt32(currentAR.GetVariableValue(args[2])));
                    }
                    else
                    {
                        RegFlag = RegN.CompareTo(Convert.ToInt32(args[2]));
                    }
                }
                else if (args[1] == "regd")
                {
                    if (currentAR.ContainsVariable(args[2]))
                    {
                        RegFlag = RegD.CompareTo(currentAR.GetVariableValue(args[2]));
                    }
                    else
                    {
                        RegFlag = RegD.CompareTo(Convert.ToChar(args[2]));
                    }
                }
                else if (args[1] == "regc")
                {
                    if (args[2] == "$w")
                    {
                        if (RegC >= 10)
                        {
                            RegFlag = 0;
                        }
                        else
                        {
                            RegFlag = 1;
                        }

                    }
                    else if (args[2] == "$c")
                    {
                        if (RegC % 10 == 1)
                        {
                            RegFlag = 0;
                        }
                        else
                        {
                            RegFlag = 1;
                        }
                    }
                    else
                    {
                        throw new Exception("Невалидна наредба");
                    }
                }
                else
                {
                    throw new Exception("Невалидна наредба");
                }
            }
            else if (args[0] == "add")
            {
                ActivationRecord currentAR = getCurrentActivationRecord();

                if (currentAR.ContainsVariable(args[2]))
                {
                    RegN += Convert.ToInt32(currentAR.GetVariableValue(args[2]));
                }
                else
                {
                    RegN += Convert.ToInt32(args[2]);
                }
            }
            else if (args[0] == "mul")
            {
                ActivationRecord currentAR = getCurrentActivationRecord();

                if (currentAR.ContainsVariable(args[2]))
                {
                    RegN *= Convert.ToInt32(currentAR.GetVariableValue(args[2]));
                }
                else
                {
                    RegN *= Convert.ToInt32(args[2]);
                }
            }
            else if (args[0] == "sub")
            {
                ActivationRecord currentAR = getCurrentActivationRecord();

                if (currentAR.ContainsVariable(args[2]))
                {
                    RegN -= Convert.ToInt32(currentAR.GetVariableValue(args[2]));
                }
                else
                {
                    RegN -= Convert.ToInt32(args[2]);
                }
            }
            else if (args[0] == "div")
            {
                ActivationRecord currentAR = getCurrentActivationRecord();

                if (currentAR.ContainsVariable(args[2]))
                {
                    RegN /= Convert.ToInt32(currentAR.GetVariableValue(args[2]));
                }
                else
                {
                    RegN /= Convert.ToInt32(args[2]);
                }
            }
            else if (args[0] == "go")
            {
                Go();
            }
            else if (args[0] == "rr")
            {
                turnRight();
            }
            else if (args[0] == "rl")
            {
                turnLeft();
            }
            else if (args[0] == "tk")
            {
                if (Enviorment[ConvertToInternalPosition(X)][ConvertToInternalPosition(Y)] == Cell.Coin)
                {
                    Enviorment[ConvertToInternalPosition(X)][ConvertToInternalPosition(Y)] = Cell.Empty;
                    RegTC++;
                }
                else
                {
                    throw new Exception("Нема жетон на оваа позиција.");
                }
            }
            else if (args[0] == "lv")
            {
                if (Enviorment[ConvertToInternalPosition(X)][ConvertToInternalPosition(Y)] == Cell.Coin)
                {
                    throw new Exception("Неможе да се остави жетон на оваа позиција бидејќи веќе има еден.");
                }
                else if (RegTC == 0)
                {
                    throw new Exception("Неможе да се остави жетон бидејќи немате жетони на располагање.");
                }
                else
                {
                    RegTC--;
                    Enviorment[ConvertToInternalPosition(X)][ConvertToInternalPosition(Y)] = Cell.Coin;
                }
            }
            else if (args[0] == "jie")
            {
                int line = Labels[args[1]];
                if (RegFlag == 0)
                {
                    InstructionPointer = line;
                }
            }
            else if (args[0] == "jne")
            {
                int line = Labels[args[1]];
                if (RegFlag != 0)
                {
                    InstructionPointer = line;
                }
            }
            else if (args[0] == "jl")
            {
                int line = Labels[args[1]];
                if (RegFlag == -1)
                {
                    InstructionPointer = line;
                }
            }
            else if (args[0] == "jle")
            {
                int line = Labels[args[1]];
                if (RegFlag <= 0)
                {
                    InstructionPointer = line;
                }
            }
            else if (args[0] == "jm")
            {
                int line = Labels[args[1]];
                if (RegFlag == 1)
                {
                    InstructionPointer = line;
                }
            }
            else if (args[0] == "jme")
            {
                int line = Labels[args[1]];
                if (RegFlag >= 0)
                {
                    InstructionPointer = line;
                }
            }
            else if (args[0] == "jmp")
            {
                int line = Labels[args[1]];
                InstructionPointer = line;
            }
            else if (args[0] == "data")
            {
                ActivationRecord currentAR = getCurrentActivationRecord();
                currentAR.AddVariable(args[1]);
            }
            else if (args[0] == "call")
            {
                ActivationRecord currentAR = getCurrentActivationRecord();
                ActivationRecord newAR = new ActivationRecord();
                newAR.Name = args[1];
                newAR.ReturnAddress = InstructionPointer + 1;
                ActivationRecords.Add(newAR);

                for (int i = 2; i < args.Length; i++)
                {
                    if (currentAR.ContainsVariable(args[i]))
                    {
                        newAR.AddArgument(currentAR.GetVariableValue(args[i]));

                    }
                    else
                    {
                        newAR.AddArgument(args[i]);
                    }
                }

                InstructionPointer = Labels[args[1]];
            }
            else if (args[0] == "data")
            {
                ActivationRecord currAR = getCurrentActivationRecord();
                currAR.AddVariable(args[0]);
            }
            else
            {
                throw new Exception("Непозната инструкција.");
            }

            
            updateWallAndCoinRegister();
            InstructionPointer++;
        }

        public ActivationRecord getCurrentActivationRecord()
        {
            return ActivationRecords[ActivationRecords.Count - 1];
        }

        public int ConvertToInternalPosition(int x)
        {
            return (x-1) * 2 + 1;
        }

        public int ConvertToExternalPosition(int x)
        {
            return (x-1) / 2 + 1;
        }

        public String EnviormentToString()
        {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < Enviorment[0].Length; j++) // y pozicija
            {
                for (int i = 0; i < Enviorment.Length; i++) //x pozicija
                {
                    Cell cell = Enviorment[i][j];
                    if (cell == Cell.Coin)
                    {
                        builder.Append("0");
                    }
                    else if (cell == Cell.Empty)
                    {
                        builder.Append("1");
                    }
                    else
                    {
                        builder.Append("7");
                    }
                }
                builder.Append("\r\n");
            }
            return builder.ToString();
        }

        public String AllActivationRecordsToString()
        {
            StringBuilder builder = new StringBuilder();
            foreach (ActivationRecord ar in ActivationRecords)
            {
                builder.Append(ar.ToString());
                builder.Append("\n");
            }
            return builder.ToString();
        }
    }
}
