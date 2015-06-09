using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Rimal_Emulator_and_Debugger
{
    class ActivationRecord
    {
        public String Name { get; set; }
        public int ReturnAddress { get; set; }
        public Dictionary<String, String> Variables { get; set; }
        public List<String> Arguments { get; set; }
        public int totalReadArguments;
        private List<String> orderedVariables;

        public ActivationRecord()
        {
            ReturnAddress = -1;
            Variables = new Dictionary<string, string>();
            orderedVariables = new List<string>();
            Arguments = new List<string>();
            totalReadArguments = 0;
        }

        public void AddArgument(String value)
        {
            Arguments.Add(value);
        }

        public void AddVariable(String name)
        {
            if (!Variables.ContainsKey(name))
            {
                Variables.Add(name, "-1");
                orderedVariables.Add(name);

                if (totalReadArguments < Arguments.Count)
                {
                    SetVariableValue(name, Arguments[totalReadArguments]);
                    totalReadArguments++;
                }
            }
            else
            {
                throw new Exception("Веќе има таква променлива.");
            }
        }

        public void SetVariableValue(String name, String value)
        {
            if (Variables.ContainsKey(name))
            {
                Variables[name] = value;
            }
            else
            {
                throw new Exception(String.Format("Променливата \"{0}\" не постои.", name));
            }

        }

        public String GetVariableValue(String name)
        {
            if (Variables.ContainsKey(name))
            {
                return Variables[name];
            }

            throw new Exception(String.Format("Променливата \"{0}\" не постои.", name));
        }

        public Boolean ContainsVariable(String name)
        {
            return Variables.ContainsKey(name);
        }

        public override string ToString()
        {
            StringBuilder builder = new StringBuilder();
            builder.Append(Name);
            builder.Append(":\r\n");
            builder.Append("return address: ");
            builder.Append(ReturnAddress);
            builder.Append("\r\n");
            foreach (String var in orderedVariables)
            {
                builder.Append("--");
                builder.Append(var);
                builder.Append(": ");
                builder.Append(Variables[var]);
                builder.Append("\r\n");

            }
            builder.Append("- - - - - - - - - - - - - -\r\n");
            return builder.ToString();
        }
    }
}
