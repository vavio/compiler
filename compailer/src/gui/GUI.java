package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

import engine.Engine;
import error.Error;
public class GUI extends JFrame {
	Engine engine;
	private File file;
	private boolean changed;
	
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem menuItem;
	JCheckBoxMenuItem showParseTree;
	
	JToolBar toolBar;
	JButton btnNew;
	JButton btnOpen;
	JButton btnSave;
	JButton btnClose;
	JButton btnCompile;
	JButton btnShowParseTree;
	JLabel lblLineNumber;
	JButton btnClearOutput;
	
	JTextArea txtSourceCode;
	JList<Error> errorList;
	DefaultListModel errorListModel;
	
	public GUI(Engine engine) throws Exception {
		super("RoboL IDE - Untitled");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		changed = false;
		this.engine = engine;
		//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		
		// --------------------------------------------------------------
		
		menuBar = new JMenuBar();
		
		menu = new JMenu("Датотека");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);
		
		menuItem = new JMenuItem("Нова", UIManager.getIcon("Tree.leafIcon"));
		menuItem.setMnemonic(KeyEvent.VK_N);
		menu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				createNew();
			}
		});		
		
		menu.addSeparator();
		menuItem = new JMenuItem("Отвори", UIManager.getIcon("FileView.directoryIcon"));
		menuItem.setMnemonic(KeyEvent.VK_O);
		menu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				open();
			}
		});
		
		menuItem = new JMenuItem("Сними", UIManager.getIcon("FileView.floppyDriveIcon"));
		menuItem.setMnemonic(KeyEvent.VK_S);
		menu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
		
		menuItem = new JMenuItem("Сними како", UIManager.getIcon("FileView.hardDriveIcon"));
		menuItem.setMnemonic(KeyEvent.VK_S);
		menu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveAs();
			}
		});
		
		menuItem = new JMenuItem("Затвори", UIManager.getIcon("InternalFrame.closeIcon"));
		menuItem.setMnemonic(KeyEvent.VK_Z);
		menu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		
		menu.addSeparator();
		menuItem = new JMenuItem("Излез");
		menuItem.setMnemonic(KeyEvent.VK_I);
		menu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				exit();
			}
		});
		
		menu = new JMenu("Компајлер");
		menu.setMnemonic(KeyEvent.VK_C);
		menuBar.add(menu);
		
		menuItem = new JMenuItem("Компајлирај", UIManager.getIcon("FileView.computerIcon"));
		menuItem.setMnemonic(KeyEvent.VK_F11);
		menu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compile();
			}
		});
		
		menuItem = new JMenuItem("Исчисти излез", UIManager.getIcon("FileChooser.detailsViewIcon"));
		menuItem.setMnemonic(KeyEvent.VK_I);
		menu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compile();
			}
		});
		
		menu.addSeparator();
		showParseTree = new JCheckBoxMenuItem("Прикажи парсирачко дрво");
		showParseTree.setMnemonic(KeyEvent.VK_F12);
		menu.add(showParseTree);
		
		
		
		
		
		menu = new JMenu("За нас");
		menuBar.add(menu);
		
		menuItem = new JMenuItem("Развивачи");
		menu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				aboutUs();
			}
		});
		
		menuItem = new JMenuItem("Верзија");
		menu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				version();
			}
		});
		
		setJMenuBar(menuBar);
		
		// --------------------------------------------------------------
		
		toolBar = new JToolBar();
		toolBar.setFloatable(false);
		
		btnNew = new JButton(UIManager.getIcon("Tree.leafIcon"));
		btnNew.setMaximumSize(new Dimension(30,30));
		btnOpen = new JButton(UIManager.getIcon("FileView.directoryIcon"));
		btnOpen.setMaximumSize(new Dimension(30,30));
		btnSave = new JButton(UIManager.getIcon("FileView.floppyDriveIcon"));
		btnSave.setMaximumSize(new Dimension(30,30));
		btnClose = new JButton(UIManager.getIcon("InternalFrame.closeIcon"));
		btnClose.setMaximumSize(new Dimension(30,30));
		btnCompile = new JButton(UIManager.getIcon("FileView.computerIcon"));
		btnCompile.setMaximumSize(new Dimension(30,30));
		btnClearOutput = new JButton(UIManager.getIcon("FileChooser.detailsViewIcon"));
		btnClearOutput.setMaximumSize(new Dimension(30,30));
		
		lblLineNumber = new JLabel(" Линија број: ");
		
		toolBar.add(btnNew);
		toolBar.add(btnOpen);
		toolBar.add(btnSave);
		//toolBar.add(btnClose);
		toolBar.add(btnClearOutput);
		toolBar.add(btnCompile);
		toolBar.add(lblLineNumber);
		
		add(toolBar, BorderLayout.PAGE_START);
		
		// --------------------------------------------------------------
		
		txtSourceCode = new JTextArea();
		txtSourceCode.setMargin(new Insets(2, 5, 2, 2));
		Font font = new Font("Arial ", Font.LAYOUT_LEFT_TO_RIGHT, 13);
		txtSourceCode.setFont(font);
		JScrollPane scroll = new JScrollPane (txtSourceCode, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(scroll, BorderLayout.CENTER);
		
		txtSourceCode.addCaretListener(new CaretListener() {
			@Override
			public void caretUpdate(CaretEvent arg0) {
				try {
					int offset = txtSourceCode.getCaretPosition();
			        int line = txtSourceCode.getLineOfOffset(offset);
			        lblLineNumber.setText(String.format(" Линија број: %d", line));
				}
				catch (Exception ex) {
					
				}
			}
		});
		
		// --------------------------------------------------------------
		errorListModel = new DefaultListModel<Error>();
		errorList = new JList<>(errorListModel);
		//errorList.setPreferredSize(new Dimension(200,100));
		scroll =  new JScrollPane (errorList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(scroll, BorderLayout.SOUTH);
		
		errorList.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					Error error = errorList.getSelectedValue();
					int offset;
					try {
						offset = txtSourceCode.getLineStartOffset(error.getLine());
//						Highlighter highlighter = txtSourceCode.getHighlighter();
//						highlighter.removeAllHighlights();
//						highlighter.addHighlight(offset + error.getStartIndex(), offset + error.getStopIndex(), DefaultHighlighter.DefaultPainter);
						txtSourceCode.requestFocus();
						txtSourceCode.select(offset + error.getStartIndex(), offset + error.getStopIndex());
					} catch (Exception e1) {
					}					
				}
			}
		});

		// --------------------------------------------------------------
		createActions();
		
		this.pack();
		this.setSize(new Dimension(800, 600));
		this.setResizable(true);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//this.setUndecorated(true);
		this.setVisible(true);
	}
	
	private void createActions() {
		btnNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				createNew();
			}
		});
		
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
		
		btnOpen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				open();
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		
		btnCompile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				compile();
			}
		});
		
		btnClearOutput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearOutput();
			}
		});
		
		txtSourceCode.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				change();
			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				change();
			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				change();
			}
		});
	}
	
	private void createNew() {
		if (changed == true) {
			int reply = JOptionPane.showConfirmDialog(null, "Дали сакате да ги зачувате промените?", "Зачувај?",  JOptionPane.YES_NO_OPTION);
			if (reply == JOptionPane.YES_OPTION) {
				save();
			}
			else {
				changed = false;
			}
		}
		
		if (changed == false) {
			file = null;
			changed = false;
			txtSourceCode.setText("Околина (10, 10)\n\nЅидови\nпочеток\nкрај\n\nЖетони\nпочеток\nкрај\n\nРобот С (1, 1)\n\nПроцедура()\nпочеток\nкрај");
			clearOutput();
			setTitle("RoboL IDE - Untitled");
		}
		
	}
	
	private void open() {
		if (changed) {
			int reply = JOptionPane.showConfirmDialog(null, "Дали сакате да ги зачувате промените?", "Сними?",  JOptionPane.YES_NO_CANCEL_OPTION);
			if (reply == JOptionPane.YES_OPTION) {
				save();
			}
			else if (reply == JOptionPane.CANCEL_OPTION) {
				return;
			}
		}
	
		JFileChooser fc = new JFileChooser();
		fc.setFileFilter(new FileNameExtensionFilter("RoboL files (*.robol)", "robol"));
		if (file != null) {
			fc.setCurrentDirectory(file.getParentFile());
		}
		int reply = fc.showOpenDialog(this);
		
		if (reply == JFileChooser.APPROVE_OPTION) {
			 file = fc.getSelectedFile();
			 StringBuilder builder = new StringBuilder();
			 try {
				 BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
				 int c = 0;
			     while ((c = in.read()) != -1) {
			    	 builder.append((char) c);
			     }
			     in.close();
			     txtSourceCode.setText(builder.toString());
				 changed = false;
				 clearOutput();
				 setTitle(String.format("RoboL IDE - %s", file.getName()));
			 }
			 catch (Exception ex) {
				 JOptionPane.showMessageDialog(this, String.format("Грешка при читање на документот:\n%s", ex.toString()), "Грешка", JOptionPane.ERROR_MESSAGE);
			 }
		}
		
	}
	
	
	private void save() {
		if (file !=  null) {
			saveAproved();
		}
		else {
			JFileChooser fc = new JFileChooser();
			fc.setFileFilter(new FileNameExtensionFilter("RoboL files (*.robol)", "robol"));
			int reply = fc.showSaveDialog(this);
			if (reply == JFileChooser.APPROVE_OPTION) {
				 file = fc.getSelectedFile();
				 saveAproved();
			}
		}
	}
	
	private void saveAs() {
		JFileChooser fc = new JFileChooser();
		fc.setFileFilter(new FileNameExtensionFilter("RoboL files (*.robol)", "robol"));
		int reply = fc.showSaveDialog(this);
		if (reply == JFileChooser.APPROVE_OPTION) {
			 file = fc.getSelectedFile();
			 saveAproved();
		}
	}
	
	private void saveAproved() {
		try	{
			PrintWriter out = new PrintWriter(file, "UTF-8");
			out.write(txtSourceCode.getText());
			out.flush();
			out.close();
			changed = false;
			setTitle(String.format("RoboL IDE - %s", file.getName()));
		}
		catch (Exception ex) {
			JOptionPane.showMessageDialog(this, String.format("Грешка при зачувување на документот:\n%s", ex.toString()), "Грешка", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void close() {
		// dali e snimeno
		if (changed) {
			int reply = JOptionPane.showConfirmDialog(null, "Дали сакате да ги зачувате промените?", "Сними?",  JOptionPane.YES_NO_CANCEL_OPTION);
			if (reply == JOptionPane.YES_OPTION) {
				save();
				if (changed) {
					return;
				}
			}
			else if  (reply == JOptionPane.CANCEL_OPTION) {
				return;
			}
		}
		txtSourceCode.setText("");
		file = null;
		changed = false;
		clearOutput();
		setTitle("RoboL IDE - Untitled");
	}
	
	private void exit() {
		System.exit(0);
		Runtime.getRuntime().exit(0);
	}
	
	private void compile() {
		if (changed || file == null) {
			int reply = JOptionPane.showConfirmDialog(null, "Документот има промени. Дали сакате да ги зачувате промените?", "Сними?",  JOptionPane.YES_NO_OPTION);
			if (reply == JOptionPane.YES_OPTION) {
				save();
				if (changed) {
					return;
				}
			}
			else {
				return;
			}
		}
		
		try {
			engine.setShowParseTree(showParseTree.isSelected());
			engine.setFile(file);
			engine.compile();
			clearOutput();
			if (engine.getErrorContainer().getErrors().size() == 0) {
				errorListModel.addElement(new String("Компајлирањето е успешно."));
			}
			else {
				for (Error error : engine.getErrorContainer().getErrors()) {
					errorListModel.addElement(error);
				}
			}
		}
		catch (Exception ex) {
			JOptionPane.showMessageDialog(this, String.format("Грешка при зачувување на Римал кодот:\n%s", ex.toString()), "Грешка", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void change() {
		changed = true;
		if (file != null) {
			setTitle(String.format("RoboL IDE - *%s", file.getName()));
		}
		else {
			setTitle("RoboL IDE - *Untitled");
		}
	}
	
	private void clearOutput() {
		errorListModel.clear();
	}
	
	private void aboutUs() {
		JOptionPane.showMessageDialog(this, "Развиено од: \nВладица Јовановски \nВалентин Амбароски \nДраган Серафимов \n\nФИНКИ © 2015 год", "Развивачи", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void version() {
		JOptionPane.showMessageDialog(this, "RoboL IDE - верзија 1.0 \n\nФИНКИ © 2015 год", "Верзија", JOptionPane.INFORMATION_MESSAGE);
	}
}
