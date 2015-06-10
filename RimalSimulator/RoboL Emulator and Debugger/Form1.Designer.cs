namespace Rimal_Emulator_and_Debugger
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.statusStrip1 = new System.Windows.Forms.StatusStrip();
            this.lbllStatus = new System.Windows.Forms.ToolStripStatusLabel();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.датотекаToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.отвориToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripMenuItem1 = new System.Windows.Forms.ToolStripSeparator();
            this.излезToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.емулаторToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.стартToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.паузаToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.стопToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.ресетирајToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.заНасToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.развивачиToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.верзијаToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStrip1 = new System.Windows.Forms.ToolStrip();
            this.openToolStripButton = new System.Windows.Forms.ToolStripButton();
            this.toolStripSeparator = new System.Windows.Forms.ToolStripSeparator();
            this.toolStripButton1 = new System.Windows.Forms.ToolStripButton();
            this.toolStripButton2 = new System.Windows.Forms.ToolStripButton();
            this.toolStripButton3 = new System.Windows.Forms.ToolStripButton();
            this.toolStripButton4 = new System.Windows.Forms.ToolStripButton();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.toolStripLabel1 = new System.Windows.Forms.ToolStripLabel();
            this.cmbSpeed = new System.Windows.Forms.ToolStripComboBox();
            this.toolStripSeparator2 = new System.Windows.Forms.ToolStripSeparator();
            this.lblLinijaText = new System.Windows.Forms.ToolStripLabel();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel();
            this.txtActivationRecords = new System.Windows.Forms.TextBox();
            this.lstStack = new System.Windows.Forms.ListBox();
            this.panel1 = new System.Windows.Forms.Panel();
            this.lstCode = new System.Windows.Forms.ListBox();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.label5 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.txtRegN = new System.Windows.Forms.TextBox();
            this.txtRegC = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.txtRegD = new System.Windows.Forms.TextBox();
            this.txtRegF = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.txtRegTC = new System.Windows.Forms.TextBox();
            this.picEnviorment = new System.Windows.Forms.PictureBox();
            this.toolStripMenuItem2 = new System.Windows.Forms.ToolStripSeparator();
            this.зумиранПогледToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.statusStrip1.SuspendLayout();
            this.menuStrip1.SuspendLayout();
            this.toolStrip1.SuspendLayout();
            this.tableLayoutPanel1.SuspendLayout();
            this.panel1.SuspendLayout();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picEnviorment)).BeginInit();
            this.SuspendLayout();
            // 
            // statusStrip1
            // 
            this.statusStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.lbllStatus});
            this.statusStrip1.Location = new System.Drawing.Point(0, 558);
            this.statusStrip1.Name = "statusStrip1";
            this.statusStrip1.Padding = new System.Windows.Forms.Padding(1, 0, 16, 0);
            this.statusStrip1.Size = new System.Drawing.Size(871, 22);
            this.statusStrip1.TabIndex = 0;
            this.statusStrip1.Text = "statusStrip1";
            // 
            // lbllStatus
            // 
            this.lbllStatus.Name = "lbllStatus";
            this.lbllStatus.Size = new System.Drawing.Size(68, 17);
            this.lbllStatus.Text = "Стопирано";
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.датотекаToolStripMenuItem,
            this.емулаторToolStripMenuItem,
            this.заНасToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Padding = new System.Windows.Forms.Padding(7, 2, 0, 2);
            this.menuStrip1.Size = new System.Drawing.Size(871, 24);
            this.menuStrip1.TabIndex = 1;
            this.menuStrip1.Text = "menuStrip1";
            this.menuStrip1.ItemClicked += new System.Windows.Forms.ToolStripItemClickedEventHandler(this.menuStrip1_ItemClicked);
            // 
            // датотекаToolStripMenuItem
            // 
            this.датотекаToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.отвориToolStripMenuItem,
            this.toolStripMenuItem1,
            this.излезToolStripMenuItem});
            this.датотекаToolStripMenuItem.Name = "датотекаToolStripMenuItem";
            this.датотекаToolStripMenuItem.Size = new System.Drawing.Size(68, 20);
            this.датотекаToolStripMenuItem.Text = "&Датотека";
            // 
            // отвориToolStripMenuItem
            // 
            this.отвориToolStripMenuItem.Name = "отвориToolStripMenuItem";
            this.отвориToolStripMenuItem.Size = new System.Drawing.Size(152, 22);
            this.отвориToolStripMenuItem.Text = "&Отвори";
            this.отвориToolStripMenuItem.Click += new System.EventHandler(this.отвориToolStripMenuItem_Click);
            // 
            // toolStripMenuItem1
            // 
            this.toolStripMenuItem1.Name = "toolStripMenuItem1";
            this.toolStripMenuItem1.Size = new System.Drawing.Size(149, 6);
            // 
            // излезToolStripMenuItem
            // 
            this.излезToolStripMenuItem.Name = "излезToolStripMenuItem";
            this.излезToolStripMenuItem.Size = new System.Drawing.Size(152, 22);
            this.излезToolStripMenuItem.Text = "&Излез";
            this.излезToolStripMenuItem.Click += new System.EventHandler(this.излезToolStripMenuItem_Click);
            // 
            // емулаторToolStripMenuItem
            // 
            this.емулаторToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.стартToolStripMenuItem,
            this.паузаToolStripMenuItem,
            this.стопToolStripMenuItem,
            this.ресетирајToolStripMenuItem,
            this.toolStripMenuItem2,
            this.зумиранПогледToolStripMenuItem});
            this.емулаторToolStripMenuItem.Name = "емулаторToolStripMenuItem";
            this.емулаторToolStripMenuItem.Size = new System.Drawing.Size(72, 20);
            this.емулаторToolStripMenuItem.Text = "&Емулатор";
            // 
            // стартToolStripMenuItem
            // 
            this.стартToolStripMenuItem.Name = "стартToolStripMenuItem";
            this.стартToolStripMenuItem.Size = new System.Drawing.Size(127, 22);
            this.стартToolStripMenuItem.Text = "&Старт";
            this.стартToolStripMenuItem.Click += new System.EventHandler(this.стартToolStripMenuItem_Click);
            // 
            // паузаToolStripMenuItem
            // 
            this.паузаToolStripMenuItem.Name = "паузаToolStripMenuItem";
            this.паузаToolStripMenuItem.Size = new System.Drawing.Size(127, 22);
            this.паузаToolStripMenuItem.Text = "&Пауза";
            this.паузаToolStripMenuItem.Click += new System.EventHandler(this.паузаToolStripMenuItem_Click);
            // 
            // стопToolStripMenuItem
            // 
            this.стопToolStripMenuItem.Name = "стопToolStripMenuItem";
            this.стопToolStripMenuItem.Size = new System.Drawing.Size(127, 22);
            this.стопToolStripMenuItem.Text = "Ст&оп";
            this.стопToolStripMenuItem.Click += new System.EventHandler(this.стопToolStripMenuItem_Click);
            // 
            // ресетирајToolStripMenuItem
            // 
            this.ресетирајToolStripMenuItem.Name = "ресетирајToolStripMenuItem";
            this.ресетирајToolStripMenuItem.Size = new System.Drawing.Size(127, 22);
            this.ресетирајToolStripMenuItem.Text = "&Ресетирај";
            this.ресетирајToolStripMenuItem.Click += new System.EventHandler(this.ресетирајToolStripMenuItem_Click);
            // 
            // заНасToolStripMenuItem
            // 
            this.заНасToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.развивачиToolStripMenuItem,
            this.верзијаToolStripMenuItem});
            this.заНасToolStripMenuItem.Name = "заНасToolStripMenuItem";
            this.заНасToolStripMenuItem.Size = new System.Drawing.Size(54, 20);
            this.заНасToolStripMenuItem.Text = "&За нас";
            // 
            // развивачиToolStripMenuItem
            // 
            this.развивачиToolStripMenuItem.Name = "развивачиToolStripMenuItem";
            this.развивачиToolStripMenuItem.Size = new System.Drawing.Size(131, 22);
            this.развивачиToolStripMenuItem.Text = "&Развивачи";
            this.развивачиToolStripMenuItem.Click += new System.EventHandler(this.развивачиToolStripMenuItem_Click);
            // 
            // верзијаToolStripMenuItem
            // 
            this.верзијаToolStripMenuItem.Name = "верзијаToolStripMenuItem";
            this.верзијаToolStripMenuItem.Size = new System.Drawing.Size(131, 22);
            this.верзијаToolStripMenuItem.Text = "&Верзија";
            this.верзијаToolStripMenuItem.Click += new System.EventHandler(this.верзијаToolStripMenuItem_Click);
            // 
            // toolStrip1
            // 
            this.toolStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.openToolStripButton,
            this.toolStripSeparator,
            this.toolStripButton1,
            this.toolStripButton2,
            this.toolStripButton3,
            this.toolStripButton4,
            this.toolStripSeparator1,
            this.toolStripLabel1,
            this.cmbSpeed,
            this.toolStripSeparator2,
            this.lblLinijaText});
            this.toolStrip1.Location = new System.Drawing.Point(0, 24);
            this.toolStrip1.Name = "toolStrip1";
            this.toolStrip1.Size = new System.Drawing.Size(871, 25);
            this.toolStrip1.TabIndex = 2;
            this.toolStrip1.Text = "toolStrip1";
            // 
            // openToolStripButton
            // 
            this.openToolStripButton.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.openToolStripButton.Image = ((System.Drawing.Image)(resources.GetObject("openToolStripButton.Image")));
            this.openToolStripButton.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.openToolStripButton.Name = "openToolStripButton";
            this.openToolStripButton.Size = new System.Drawing.Size(23, 22);
            this.openToolStripButton.Text = "&Oтвори датотека";
            this.openToolStripButton.Click += new System.EventHandler(this.openToolStripButton_Click);
            // 
            // toolStripSeparator
            // 
            this.toolStripSeparator.Name = "toolStripSeparator";
            this.toolStripSeparator.Size = new System.Drawing.Size(6, 25);
            // 
            // toolStripButton1
            // 
            this.toolStripButton1.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.toolStripButton1.Image = global::Rimal_Emulator_and_Debugger.Properties.Resources.Start_icon;
            this.toolStripButton1.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.toolStripButton1.Name = "toolStripButton1";
            this.toolStripButton1.Size = new System.Drawing.Size(23, 22);
            this.toolStripButton1.Text = "Старт";
            this.toolStripButton1.Click += new System.EventHandler(this.toolStripButton1_Click);
            // 
            // toolStripButton2
            // 
            this.toolStripButton2.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.toolStripButton2.Image = global::Rimal_Emulator_and_Debugger.Properties.Resources.Pause_icon;
            this.toolStripButton2.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.toolStripButton2.Name = "toolStripButton2";
            this.toolStripButton2.Size = new System.Drawing.Size(23, 22);
            this.toolStripButton2.Text = "Пауза";
            this.toolStripButton2.Click += new System.EventHandler(this.toolStripButton2_Click);
            // 
            // toolStripButton3
            // 
            this.toolStripButton3.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.toolStripButton3.Image = global::Rimal_Emulator_and_Debugger.Properties.Resources.Stop_red_icon;
            this.toolStripButton3.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.toolStripButton3.Name = "toolStripButton3";
            this.toolStripButton3.Size = new System.Drawing.Size(23, 22);
            this.toolStripButton3.Text = "Стоп";
            this.toolStripButton3.Click += new System.EventHandler(this.toolStripButton3_Click);
            // 
            // toolStripButton4
            // 
            this.toolStripButton4.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.toolStripButton4.Image = global::Rimal_Emulator_and_Debugger.Properties.Resources.Refresh_icon;
            this.toolStripButton4.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.toolStripButton4.Name = "toolStripButton4";
            this.toolStripButton4.Size = new System.Drawing.Size(23, 22);
            this.toolStripButton4.Text = "Ресетирај";
            this.toolStripButton4.Click += new System.EventHandler(this.toolStripButton4_Click);
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(6, 25);
            // 
            // toolStripLabel1
            // 
            this.toolStripLabel1.Name = "toolStripLabel1";
            this.toolStripLabel1.Size = new System.Drawing.Size(46, 22);
            this.toolStripLabel1.Text = "Брзина";
            // 
            // cmbSpeed
            // 
            this.cmbSpeed.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cmbSpeed.Items.AddRange(new object[] {
            "Споро",
            "Нормално",
            "Брзо"});
            this.cmbSpeed.Name = "cmbSpeed";
            this.cmbSpeed.Size = new System.Drawing.Size(121, 25);
            this.cmbSpeed.SelectedIndexChanged += new System.EventHandler(this.cmbSpeed_SelectedIndexChanged);
            this.cmbSpeed.Click += new System.EventHandler(this.cmbSpeed_Click);
            // 
            // toolStripSeparator2
            // 
            this.toolStripSeparator2.Name = "toolStripSeparator2";
            this.toolStripSeparator2.Size = new System.Drawing.Size(6, 25);
            // 
            // lblLinijaText
            // 
            this.lblLinijaText.Name = "lblLinijaText";
            this.lblLinijaText.Size = new System.Drawing.Size(51, 22);
            this.lblLinijaText.Text = "Линија: ";
            // 
            // timer1
            // 
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // tableLayoutPanel1
            // 
            this.tableLayoutPanel1.CellBorderStyle = System.Windows.Forms.TableLayoutPanelCellBorderStyle.Outset;
            this.tableLayoutPanel1.ColumnCount = 1;
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle());
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Absolute, 23F));
            this.tableLayoutPanel1.Controls.Add(this.txtActivationRecords, 0, 0);
            this.tableLayoutPanel1.Controls.Add(this.lstStack, 0, 1);
            this.tableLayoutPanel1.Dock = System.Windows.Forms.DockStyle.Right;
            this.tableLayoutPanel1.Location = new System.Drawing.Point(623, 49);
            this.tableLayoutPanel1.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.tableLayoutPanel1.Name = "tableLayoutPanel1";
            this.tableLayoutPanel1.RowCount = 2;
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 50F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 50F));
            this.tableLayoutPanel1.Size = new System.Drawing.Size(248, 509);
            this.tableLayoutPanel1.TabIndex = 4;
            // 
            // txtActivationRecords
            // 
            this.txtActivationRecords.BackColor = System.Drawing.SystemColors.Control;
            this.txtActivationRecords.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.txtActivationRecords.Dock = System.Windows.Forms.DockStyle.Fill;
            this.txtActivationRecords.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtActivationRecords.Location = new System.Drawing.Point(5, 6);
            this.txtActivationRecords.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.txtActivationRecords.Multiline = true;
            this.txtActivationRecords.Name = "txtActivationRecords";
            this.txtActivationRecords.ReadOnly = true;
            this.txtActivationRecords.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.txtActivationRecords.Size = new System.Drawing.Size(238, 243);
            this.txtActivationRecords.TabIndex = 20;
            // 
            // lstStack
            // 
            this.lstStack.BackColor = System.Drawing.SystemColors.Control;
            this.lstStack.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.lstStack.Dock = System.Windows.Forms.DockStyle.Fill;
            this.lstStack.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lstStack.FormattingEnabled = true;
            this.lstStack.ItemHeight = 16;
            this.lstStack.Location = new System.Drawing.Point(5, 259);
            this.lstStack.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.lstStack.Name = "lstStack";
            this.lstStack.Size = new System.Drawing.Size(238, 244);
            this.lstStack.TabIndex = 19;
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.lstCode);
            this.panel1.Controls.Add(this.groupBox1);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel1.Location = new System.Drawing.Point(0, 49);
            this.panel1.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(233, 509);
            this.panel1.TabIndex = 7;
            // 
            // lstCode
            // 
            this.lstCode.BackColor = System.Drawing.SystemColors.Control;
            this.lstCode.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.lstCode.Dock = System.Windows.Forms.DockStyle.Fill;
            this.lstCode.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lstCode.FormattingEnabled = true;
            this.lstCode.ItemHeight = 16;
            this.lstCode.Location = new System.Drawing.Point(0, 0);
            this.lstCode.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.lstCode.Name = "lstCode";
            this.lstCode.Size = new System.Drawing.Size(233, 306);
            this.lstCode.TabIndex = 9;
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.label5);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Controls.Add(this.txtRegN);
            this.groupBox1.Controls.Add(this.txtRegC);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.txtRegD);
            this.groupBox1.Controls.Add(this.txtRegF);
            this.groupBox1.Controls.Add(this.label4);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Controls.Add(this.txtRegTC);
            this.groupBox1.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.groupBox1.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox1.Location = new System.Drawing.Point(0, 306);
            this.groupBox1.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Padding = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.groupBox1.Size = new System.Drawing.Size(233, 203);
            this.groupBox1.TabIndex = 8;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Регистри";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(19, 27);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(34, 15);
            this.label5.TabIndex = 16;
            this.label5.Text = "regN";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(19, 97);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(34, 15);
            this.label1.TabIndex = 8;
            this.label1.Text = "regC";
            // 
            // txtRegN
            // 
            this.txtRegN.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtRegN.Location = new System.Drawing.Point(71, 23);
            this.txtRegN.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.txtRegN.Name = "txtRegN";
            this.txtRegN.Size = new System.Drawing.Size(133, 21);
            this.txtRegN.TabIndex = 17;
            this.txtRegN.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // txtRegC
            // 
            this.txtRegC.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtRegC.Location = new System.Drawing.Point(71, 94);
            this.txtRegC.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.txtRegC.Name = "txtRegC";
            this.txtRegC.Size = new System.Drawing.Size(133, 21);
            this.txtRegC.TabIndex = 9;
            this.txtRegC.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(19, 129);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(49, 15);
            this.label2.TabIndex = 10;
            this.label2.Text = "regFlag";
            // 
            // txtRegD
            // 
            this.txtRegD.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtRegD.Location = new System.Drawing.Point(71, 59);
            this.txtRegD.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.txtRegD.Name = "txtRegD";
            this.txtRegD.Size = new System.Drawing.Size(133, 21);
            this.txtRegD.TabIndex = 15;
            this.txtRegD.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // txtRegF
            // 
            this.txtRegF.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtRegF.Location = new System.Drawing.Point(71, 126);
            this.txtRegF.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.txtRegF.Name = "txtRegF";
            this.txtRegF.Size = new System.Drawing.Size(133, 21);
            this.txtRegF.TabIndex = 11;
            this.txtRegF.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(19, 63);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(34, 15);
            this.label4.TabIndex = 14;
            this.label4.Text = "regD";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(19, 164);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(41, 15);
            this.label3.TabIndex = 12;
            this.label3.Text = "regTC";
            // 
            // txtRegTC
            // 
            this.txtRegTC.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtRegTC.Location = new System.Drawing.Point(71, 160);
            this.txtRegTC.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.txtRegTC.Name = "txtRegTC";
            this.txtRegTC.Size = new System.Drawing.Size(133, 21);
            this.txtRegTC.TabIndex = 13;
            this.txtRegTC.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // picEnviorment
            // 
            this.picEnviorment.BackColor = System.Drawing.Color.White;
            this.picEnviorment.Dock = System.Windows.Forms.DockStyle.Fill;
            this.picEnviorment.Location = new System.Drawing.Point(233, 49);
            this.picEnviorment.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.picEnviorment.Name = "picEnviorment";
            this.picEnviorment.Size = new System.Drawing.Size(390, 509);
            this.picEnviorment.TabIndex = 8;
            this.picEnviorment.TabStop = false;
            // 
            // toolStripMenuItem2
            // 
            this.toolStripMenuItem2.Name = "toolStripMenuItem2";
            this.toolStripMenuItem2.Size = new System.Drawing.Size(161, 6);
            // 
            // зумиранПогледToolStripMenuItem
            // 
            this.зумиранПогледToolStripMenuItem.Name = "зумиранПогледToolStripMenuItem";
            this.зумиранПогледToolStripMenuItem.Size = new System.Drawing.Size(252, 22);
            this.зумиранПогледToolStripMenuItem.Text = "&Автоматска големина на поглед";
            this.зумиранПогледToolStripMenuItem.Click += new System.EventHandler(this.зумиранПогледToolStripMenuItem_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(871, 580);
            this.Controls.Add(this.picEnviorment);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.tableLayoutPanel1);
            this.Controls.Add(this.toolStrip1);
            this.Controls.Add(this.statusStrip1);
            this.Controls.Add(this.menuStrip1);
            this.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MainMenuStrip = this.menuStrip1;
            this.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Rimal - Емулатор и Дебагер";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.Form1_Load);
            this.statusStrip1.ResumeLayout(false);
            this.statusStrip1.PerformLayout();
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.toolStrip1.ResumeLayout(false);
            this.toolStrip1.PerformLayout();
            this.tableLayoutPanel1.ResumeLayout(false);
            this.tableLayoutPanel1.PerformLayout();
            this.panel1.ResumeLayout(false);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picEnviorment)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.StatusStrip statusStrip1;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem датотекаToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem отвориToolStripMenuItem;
        private System.Windows.Forms.ToolStripSeparator toolStripMenuItem1;
        private System.Windows.Forms.ToolStripMenuItem излезToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem емулаторToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem стартToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem паузаToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem стопToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem ресетирајToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem заНасToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem развивачиToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem верзијаToolStripMenuItem;
        private System.Windows.Forms.ToolStrip toolStrip1;
        private System.Windows.Forms.ToolStripButton openToolStripButton;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.ToolStripButton toolStripButton1;
        private System.Windows.Forms.ToolStripButton toolStripButton2;
        private System.Windows.Forms.ToolStripButton toolStripButton3;
        private System.Windows.Forms.ToolStripButton toolStripButton4;
        private System.Windows.Forms.ToolStripLabel toolStripLabel1;
        private System.Windows.Forms.ToolStripComboBox cmbSpeed;
        private System.Windows.Forms.Timer timer1;
        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.TextBox txtRegN;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox txtRegD;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtRegTC;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtRegF;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtRegC;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.ListBox lstStack;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator2;
        private System.Windows.Forms.ToolStripLabel lblLinijaText;
        private System.Windows.Forms.ToolStripStatusLabel lbllStatus;
        private System.Windows.Forms.TextBox txtActivationRecords;
        private System.Windows.Forms.ListBox lstCode;
        private System.Windows.Forms.ToolStripSeparator toolStripMenuItem2;
        private System.Windows.Forms.ToolStripMenuItem зумиранПогледToolStripMenuItem;
        private System.Windows.Forms.PictureBox picEnviorment;
    }
}

