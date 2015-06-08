using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Rimal_Emulator_and_Debugger
{
    public partial class Form1 : Form
    {
        Engine engine = new Engine();
        Boolean stoped;

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            cmbSpeed.SelectedIndex = 0;
            picEnviorment.Focus();
            stoped = true;
        }

        private void Clear()
        {
            lstCode.ClearSelected();
            txtActivationRecords.Text = "";
            lstStack.Items.Clear();
            txtRegC.Text = "";
            txtRegTC.Text = "";
            txtRegD.Text = "";
            txtRegF.Text = "";
            txtRegN.Text = "";
        }

        private void Open()
        {
            OpenFileDialog openFileDialog1 = new OpenFileDialog();
            openFileDialog1.Filter = "Rimal files (.rimal)|*.rimal";
            System.IO.StreamReader file = null;

            if (openFileDialog1.ShowDialog() == System.Windows.Forms.DialogResult.OK)
            {
                Clear();
                engine = new Engine();
                try
                {
                    file = new System.IO.StreamReader(openFileDialog1.FileName);
                    String line = "";
                    int lineNumber = 0;

                    while ((line = file.ReadLine()) != null)
                    {
                        line = line.Trim().ToLower();
                        if (String.IsNullOrEmpty(line))
                        {
                            continue;
                        }
                        engine.Instructions.Add(line);
                        lineNumber++;
                    }

                    engine.ScanProgram();
                    lstCode.DataSource = engine.Instructions;
                    lstCode.Update();
                    picEnviorment.Image = engine.DrawImage();
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.ToString(), "Грешка", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
                finally
                {
                    if (file != null)
                    {
                        file.Close();
                    }
                }

            }
        }

        private void Start()
        {
            try
            {
                if (stoped)
                {
                    Clear();
                    stoped = !stoped;
                    engine.ScanProgram();
                    engine.Start();
                    lstCode.DataSource = engine.Instructions;
                    //lstStack.DataSource = engine.Stack;
                }
                timer1.Start();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString(), "Грешка", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void Stop()
        {
            timer1.Stop();
            engine.Reset();
            stoped = true;
            lbllStatus.Text = "Стопирано";
        }

        private void Pause()
        {
            timer1.Stop();
            lbllStatus.Text = "Паузирано";
        }

        private void Reset()
        {
            timer1.Stop();
            Clear();
            engine.Reset();
            stoped = true;
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            if (engine.hasNextInstruction())
            {
                try
                {
                    engine.Execute();
                    lstCode.SelectedIndex = engine.InstructionPointer - 1;
                    lblLinijaText.Text = String.Format("Линија: {0}", engine.InstructionPointer);
                    txtActivationRecords.Text = engine.AllActivationRecordsToString();
                    lstStack.Items.Clear();
                    lstStack.Items.AddRange(engine.Stack.ToArray());

                    txtRegN.Text = engine.RegN.ToString();
                    txtRegC.Text = engine.RegC.ToString();
                    txtRegD.Text = engine.RegD.ToString();
                    txtRegF.Text = engine.RegFlag.ToString();
                    txtRegTC.Text = engine.RegTC.ToString();

                    picEnviorment.Image = engine.DrawImage();
                    lbllStatus.Text = "Извршува ...";
                }
                catch (Exception ex)
                {
                    timer1.Stop();
                    Stop();
                    lbllStatus.Text = "Заврши со грешка";
                    MessageBox.Show(ex.ToString(), "Грешка", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
            else
            {
                timer1.Stop();
                Stop();
                lbllStatus.Text = "Заврши";
            }
            
        }

        private void toolStripButton4_Click(object sender, EventArgs e)
        {
            Reset();
        }

        private void toolStripButton1_Click(object sender, EventArgs e)
        {
            Start();
        }

        private void toolStripButton2_Click(object sender, EventArgs e)
        {
            Pause();
        }

        private void toolStripButton3_Click(object sender, EventArgs e)
        {
            Stop();
        }

        private void cmbSpeed_Click(object sender, EventArgs e)
        {

        }

        private void cmbSpeed_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (cmbSpeed.SelectedIndex == 0)
            {
                timer1.Interval = 2000;
            }
            else if (cmbSpeed.SelectedIndex == 1)
            {
                timer1.Interval = 700;
            }
            else
            {
                timer1.Interval = 200;
            }
        }

        private void стартToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Start();
        }

        private void паузаToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Pause();
        }

        private void стопToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Stop();
        }

        private void ресетирајToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Reset();
        }

        private void openToolStripButton_Click(object sender, EventArgs e)
        {
            Open();
        }

        private void отвориToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Open();
        }

        private void излезToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void развивачиToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Владица Јовановски\n\rВалентин Амбароски\n\rДраган Серафимов \n\r\n\rФИНКИ © 2015 год.", "Развивачи", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        private void верзијаToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Rimal Emulator & Debugger - верзија 1.0 \n\r\n\rФИНКИ © 2015 год.", "Развивачи", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        private void menuStrip1_ItemClicked(object sender, ToolStripItemClickedEventArgs e)
        {

        }

        private void зумиранПогледToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (picEnviorment.SizeMode == PictureBoxSizeMode.Zoom)
            {
                picEnviorment.SizeMode = PictureBoxSizeMode.Normal;
            }
            else
            {
                picEnviorment.SizeMode = PictureBoxSizeMode.Zoom;
            }
        }
    }
}
