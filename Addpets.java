import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.*;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Addpets extends JFrame {

	JFrame addpetframe;
	private JTextField petnamefield;
	
	private JTextField petagefield;
	private JTextField petgenderfield;
	private JTextField petbreedfield;
	private JTextField colortextfield;
	private JTextField birthdaytextfield;
	private JLabel Logo;
	private JLabel InpuDataLabel;
	private JLabel colorLAbel;
	private JLabel breedLabel;
	private JLabel genderLabel;
	private JLabel AgeLabel;
	private JLabel bdayLabel;
	private JLabel nameLabel;
	private JButton inputButton;
	private JButton ClearButton;
	private JPanel panel;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addpets window = new Addpets();
					window.addpetframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Addpets() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addpetframe = new JFrame();
		addpetframe.setBounds(100, 100, 625, 699);
		addpetframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addpetframe.getContentPane().setBackground(new Color(240, 240, 240));
		addpetframe.getContentPane().setLayout(null);
		
		Font FieldsFont = null;
        try {
        	FieldsFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Regular.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(FieldsFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
		
		birthdaytextfield = new JTextField();
		birthdaytextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		birthdaytextfield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		birthdaytextfield.setColumns(10);
		birthdaytextfield.setBackground(new Color(232, 237, 236));
		birthdaytextfield.setBounds(104, 282, 400, 38);
		addpetframe.getContentPane().add(birthdaytextfield);

		petnamefield = new JTextField();
		petnamefield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		petnamefield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		petnamefield.setBackground(new Color(232, 237, 236));
		petnamefield.setBounds(104, 220, 400, 38);
		addpetframe.getContentPane().add(petnamefield);
		petnamefield.setColumns(10);
		petnamefield.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent e) {
				if (petnamefield.getText().equals("Pet Name")) {
					petnamefield.setText("");
				}

			}

			@Override
			public void focusLost(FocusEvent e) {
				if (petnamefield.getText().equals("")) {
					petnamefield.setText("Pet Name");
				}
			}
		});

		petagefield = new JTextField();
		petagefield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		petagefield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		petagefield.setBackground(new Color(232, 237, 236));
		petagefield.setBounds(104, 344, 400, 38);
		addpetframe.getContentPane().add(petagefield);
		petagefield.setColumns(10);
		petagefield.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent e) {
				if (petagefield.getText().equals("Pet Age")) {
					petagefield.setText("");
				}

			}

			@Override
			public void focusLost(FocusEvent e) {
				if (petagefield.getText().equals("")) {
					petagefield.setText("Pet Age");
				}
			}
		});

		petgenderfield = new JTextField();
		petgenderfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		petgenderfield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		petgenderfield.setBackground(new Color(232, 237, 236));
		petgenderfield.setBounds(104, 409, 400, 38);
		addpetframe.getContentPane().add(petgenderfield);
		petgenderfield.setColumns(10);
		petgenderfield.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent e) {
				if (petgenderfield.getText().equals("Pet Gender")) {
					petgenderfield.setText("");
				}

			}

			@Override
			public void focusLost(FocusEvent e) {
				if (petgenderfield.getText().equals("")) {
					petgenderfield.setText("Pet Gender");
				}
			}
		});

		petbreedfield = new JTextField();
		petbreedfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		petbreedfield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		petbreedfield.setBackground(new Color(232, 237, 236));
		petbreedfield.setBounds(104, 471, 400, 38);
		addpetframe.getContentPane().add(petbreedfield);
		petbreedfield.setColumns(10);
		petbreedfield.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent e) {
				if (petbreedfield.getText().equals("Pet Breed")) {
					petbreedfield.setText("");
				}

			}

			@Override
			public void focusLost(FocusEvent e) {
				if (petbreedfield.getText().equals("")) {
					petbreedfield.setText("Pet Breed");
				}
			}
		});

		colortextfield = new JTextField();
		colortextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		colortextfield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		colortextfield.setBackground(new Color(232, 237, 236));
		colortextfield.setBounds(104, 531, 400, 38);
		addpetframe.getContentPane().add(colortextfield);
		colortextfield.setColumns(10);
		colortextfield.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent e) {
				if (colortextfield.getText().equals("Pet Color")) {
					colortextfield.setText("");
				}

			}

			@Override
			public void focusLost(FocusEvent e) {
				if (colortextfield.getText().equals("")) {
					colortextfield.setText("Pet Color");
				}
			}
		});
		
		
		 Font HeaderFont = null;
         try {
        	 HeaderFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\PatuaOne-Regular.ttf"));
             GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
             ge.registerFont(HeaderFont);
         } catch (FontFormatException | IOException e) {
             e.printStackTrace();
         }
		
		 Font LabelsFont = null;
         try {
        	 LabelsFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Medium.ttf"));
             GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
             ge.registerFont(LabelsFont);
         } catch (FontFormatException | IOException e) {
             e.printStackTrace();
         }
		
		colorLAbel = new JLabel("Color:");
		colorLAbel.setForeground(new Color(19, 0, 90));
		colorLAbel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		colorLAbel.setBounds(104, 509, 127, 21);
		addpetframe.getContentPane().add(colorLAbel);
		
		breedLabel = new JLabel("Breed:");
		breedLabel.setForeground(new Color(19, 0, 90));
		breedLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		breedLabel.setBounds(104, 452, 127, 21);
		addpetframe.getContentPane().add(breedLabel);
		
		genderLabel = new JLabel("Gender:");
		genderLabel.setForeground(new Color(19, 0, 90));
		genderLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		genderLabel.setBounds(104, 387, 127, 21);
		addpetframe.getContentPane().add(genderLabel);
		
		AgeLabel = new JLabel("Age:");
		AgeLabel.setForeground(new Color(19, 0, 90));
		AgeLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		AgeLabel.setBounds(104, 319, 127, 21);
		addpetframe.getContentPane().add(AgeLabel);
		
		bdayLabel = new JLabel("Birthday:");
		bdayLabel.setForeground(new Color(19, 0, 90));
		bdayLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		bdayLabel.setBounds(104, 262, 127, 21);
		addpetframe.getContentPane().add(bdayLabel);
		
		nameLabel = new JLabel("Name:");
		nameLabel.setForeground(new Color(19, 0, 90));
		nameLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		nameLabel.setBounds(104, 200, 127, 21);
		addpetframe.getContentPane().add(nameLabel);
		
		Font buttonFont = null;
        try {
        	buttonFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Bold.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(buttonFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
		
		inputButton = new JButton("Input all");
		inputButton.setFont((buttonFont.deriveFont(Font.BOLD, 14)));
		inputButton.setBackground(new Color(19, 0, 90));
		inputButton.setForeground(new Color(255, 255, 255));
		inputButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = petnamefield.getText();
				String bday= birthdaytextfield.getText();
				String age = petagefield.getText();
				String gender = petgenderfield.getText();
				String breed = petbreedfield.getText();
				String color = colortextfield.getText();
				PetProfile petwindow = new PetProfile();
				petwindow.nameDisplay.setText(name);
				petwindow.bdayDisplay.setText(bday);
				petwindow.ageDisplay.setText(age);
				petwindow.genderDisplay.setText(gender);
				petwindow.breedDisplay.setText(breed);
				petwindow.colorDisplay.setText(color);
				petwindow.petProfileFrame.setVisible(true);
				addpetframe.dispose();		
				
			}
		});
		inputButton.setBounds(309, 594, 195, 40);
		addpetframe.getContentPane().add(inputButton);
		
		ClearButton = new JButton("Clear Data");
		ClearButton.setFont((buttonFont.deriveFont(Font.BOLD, 14)));
		ClearButton.setForeground(new Color(19, 0, 90));
		ClearButton.setBackground(new Color(246, 186, 111));
		ClearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clearFields();
				
			}
		});
		ClearButton.setBounds(104, 594, 195, 40);
		addpetframe.getContentPane().add(ClearButton);
		
		panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(19, 0, 90)));
		panel.setBackground(new Color(109, 169, 228));
		panel.setBounds(0, 0, 609, 118);
		addpetframe.getContentPane().add(panel);
		panel.setLayout(null);
		
		Logo = new JLabel("");
		Logo.setBounds(20, 11, 181, 97);
		panel.add(Logo);
		Logo.setIcon(new ImageIcon(Addpets.class.getResource("/images/pawFileLogo.png")));
		
		
		InpuDataLabel = new JLabel("Input Your Pet's Data");
		InpuDataLabel.setBounds(308, 40, 246, 38);
		panel.add(InpuDataLabel);
		InpuDataLabel.setForeground(new Color(19, 0, 90));
		InpuDataLabel.setFont((HeaderFont.deriveFont(Font.PLAIN, 25)));

		
		
	}
	
	        private void clearFields() {
	        	petnamefield.setText("");
	        	birthdaytextfield.setText("");
	        	petagefield.setText("");
	        	petgenderfield.setText("");
	        	petbreedfield.setText("");
	        	colortextfield.setText("");
	    }
}

