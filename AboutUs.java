import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class AboutUs {

    public static void main(String[] args) {
        JFrame frmAboutUs = new JFrame("Scroll Multiple Images Example");
        frmAboutUs.setTitle("About Us");
        frmAboutUs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmAboutUs.setSize(1250, 600);

        // Create a panel to hold the images
        JPanel panel = new JPanel();
        panel.setBackground(new Color(19, 0, 90));
        panel.setLayout(null);

        // Load and add the first image
        ImageIcon image1 = loadImage("/images/AddOwnersInfo.png");

        // Load and add the second image
        ImageIcon image2 = loadImage("/images/RegImmunizationButton.png");

        // Load and add the third image
        ImageIcon image3 = loadImage("/images/pawFileLogo.png");
        JLabel label3 = new JLabel(new ImageIcon(AboutUs.class.getResource("/images/pawFileLogo.png")));
        label3.setBounds(10, 1300, 1180, 452);
        panel.add(label3);
        
        JPanel ProfilePane = new JPanel();
        ProfilePane.setBackground(new Color(173, 228, 219));
        ProfilePane.setBounds(0, 600, 1236, 458);
        panel.add(ProfilePane);
        ProfilePane.setLayout(null);
        
        JPanel DescriptionPane = new JPanel();
        DescriptionPane.setBackground(new Color(246, 186, 111));
        DescriptionPane.setBounds(0, 1055, 1236, 390);
        panel.add(DescriptionPane);
        DescriptionPane.setLayout(null);
        
        JLabel DescriptionLabel = new JLabel("");
        DescriptionLabel.setIcon(new ImageIcon(AboutUs.class.getResource("/images/CoderKidzDescription.png")));
        DescriptionLabel.setBounds(201, 45, 827, 293);
        DescriptionPane.add(DescriptionLabel);
        
        JPanel AdamiPanel = new JPanel();
        AdamiPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(19, 0, 90)));
        AdamiPanel.setBounds(77, 55, 308, 341);
        ProfilePane.add(AdamiPanel);
        AdamiPanel.setLayout(null);
        
        Font NameLabelsInAccountFont = null;
        try {
        	NameLabelsInAccountFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\PatuaOne-Regular.ttf"));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
        
        
        
        Font PositionLabelsInAccountFont = null;
        try {
              PositionLabelsInAccountFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Bold.ttf"));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
        JLabel NameLabelAdami = new JLabel("Matthew V. Adami");
        NameLabelAdami.setForeground(new Color(30, 30, 30));
        NameLabelAdami.setFont( NameLabelsInAccountFont.deriveFont(Font.PLAIN, 32));
        NameLabelAdami.setBounds(23, 243, 274, 27);
        AdamiPanel.add(NameLabelAdami);
        
        JLabel PositionLabel1 = new JLabel("Main Programmer");
        PositionLabel1.setForeground(new Color(19, 0, 90));
        PositionLabel1.setFont(PositionLabelsInAccountFont.deriveFont(Font.PLAIN, 18));
        PositionLabel1.setBounds(80, 270, 143, 27);
        AdamiPanel.add(PositionLabel1);
        
        JLabel AdamiPicture = new JLabel("");
        AdamiPicture.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
        AdamiPicture.setIcon(new ImageIcon(AboutUs.class.getResource("/images/AdamiPicture.png")));
        AdamiPicture.setBounds(47, 11, 216, 216);
        AdamiPanel.add(AdamiPicture);
        
        ImageIcon adamiImage = new ImageIcon(AboutUs.class.getResource("/images/AdamiPicture.png"));
        Image resizedAdamiImage = adamiImage.getImage().getScaledInstance(216, 216, Image.SCALE_SMOOTH);
        ImageIcon resizedAdamiIcon = new ImageIcon(resizedAdamiImage);
        AdamiPicture.setIcon(resizedAdamiIcon);
        
        JPanel AngelesPanel = new JPanel();
        AngelesPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(19, 0, 90)));
        AngelesPanel.setBounds(453, 55, 308, 341);
        ProfilePane.add(AngelesPanel);
        AngelesPanel.setLayout(null);
        
        JLabel PositionLabel2 = new JLabel("Group Leader");
        PositionLabel2.setForeground(new Color(19, 0, 90));
        PositionLabel2.setBounds(101, 268, 116, 27);
        AngelesPanel.add(PositionLabel2);
        PositionLabel2.setFont(PositionLabelsInAccountFont.deriveFont(Font.PLAIN, 18));
        
        JLabel AngelesPicture = new JLabel("");
        AngelesPicture.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
        AngelesPicture.setIcon(new ImageIcon(AboutUs.class.getResource("/images/ANGELES12.jpg")));
        AngelesPicture.setBounds(48, 9, 216, 216);
        AngelesPanel.add(AngelesPicture);
        
        ImageIcon angelesImage = new ImageIcon(AboutUs.class.getResource("/images/ANGELES12.jpg"));
        Image resizedAngelesImage = angelesImage.getImage().getScaledInstance(216, 216, Image.SCALE_SMOOTH);
        ImageIcon resizedAngelesIcon = new ImageIcon(resizedAngelesImage);
        AngelesPicture.setIcon(resizedAngelesIcon);
        
        JLabel NameLabelAngeles = new JLabel("Johanes P. Angeles");
        NameLabelAngeles.setBounds(23, 236, 261, 41);
        AngelesPanel.add(NameLabelAngeles);
        NameLabelAngeles.setForeground(new Color(30, 30, 30));
        NameLabelAngeles.setFont( NameLabelsInAccountFont.deriveFont(Font.PLAIN, 32));
        
        JPanel EraPanel = new JPanel();
        EraPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(19, 0, 90)));
        EraPanel.setBounds(833, 55, 308, 341);
        ProfilePane.add(EraPanel);
        EraPanel.setLayout(null);
        
        JLabel NameLabelEra = new JLabel("Allaiza D. Era");
        NameLabelEra.setForeground(new Color(30, 30, 30));
        NameLabelEra.setFont( NameLabelsInAccountFont.deriveFont(Font.PLAIN, 32));
        NameLabelEra.setBounds(66, 244, 192, 27);
        EraPanel.add(NameLabelEra);
        
        JLabel PositionLabel3 = new JLabel("System Designer");
        PositionLabel3.setForeground(new Color(19, 0, 90));
        PositionLabel3.setFont(PositionLabelsInAccountFont.deriveFont(Font.PLAIN, 18));
        PositionLabel3.setBounds(90, 268, 140, 27);
        EraPanel.add(PositionLabel3);
        
       

        JLabel AllaizaPicture = new JLabel("");
        AllaizaPicture.setIcon(new ImageIcon(AboutUs.class.getResource("/images/EraPicture (2).png")));
        AllaizaPicture.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
        AllaizaPicture.setBounds(46, 11, 216, 216);
        EraPanel.add(AllaizaPicture);
        
        ImageIcon EraImage = new ImageIcon(AboutUs.class.getResource("/images/EraPicture (2).png"));
        Image resizedEraImage = EraImage.getImage().getScaledInstance(216, 216, Image.SCALE_SMOOTH);
        ImageIcon resizedEraIcon = new ImageIcon(resizedEraImage);
        AllaizaPicture.setIcon(resizedEraIcon);

        // Create a scroll pane and add the panel to it
        panel.setPreferredSize(new Dimension(1200, 2000));
        JScrollPane scrollPane = new JScrollPane(panel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(246, 186, 111)));
        panel_1.setBackground(new Color(109, 169, 228));
        panel_1.setBounds(0, 0, 1215, 119);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel Logo = new JLabel("");
        Logo.setIcon(new ImageIcon(AboutUs.class.getResource("/images/pawFileLogo.png")));
        Logo.setBounds(10, 21, 171, 71);
        panel_1.add(Logo);
        
        Font LabelsInAccountFont = null;
        try {
        	LabelsInAccountFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Medium.ttf"));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
        JLabel AboutUsLabel1 = new JLabel("Composed of three computer studies ");
        AboutUsLabel1.setFont(LabelsInAccountFont.deriveFont(Font.PLAIN, 18));
        AboutUsLabel1.setForeground(new Color(255, 255, 255));
        AboutUsLabel1.setBounds(474, 452, 325, 27);
        panel.add(AboutUsLabel1);
        
        JLabel AboutUsLabel = new JLabel("students, we are the CODERKIDZ.");
        AboutUsLabel.setFont(LabelsInAccountFont.deriveFont(Font.PLAIN, 18));
        AboutUsLabel.setForeground(new Color(255, 255, 255));
        AboutUsLabel.setBounds(484, 478, 283, 27);
        panel.add(AboutUsLabel);
        
        JLabel coderKidzLogo = new JLabel("");
        coderKidzLogo.setIcon(new ImageIcon(AboutUs.class.getResource("/images/CoderKidzLogo.png")));
        coderKidzLogo.setBounds(227, 200, 737, 227);
        panel.add(coderKidzLogo);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        
        scrollPane.getVerticalScrollBar().setUI(new CustomScrollbarUI());

        // Add the scroll pane to the frame's content pane
        frmAboutUs.getContentPane().add(scrollPane);

        frmAboutUs.setVisible(true);
    }

    private static ImageIcon loadImage(String imagePath) {
        try (InputStream inputStream = AboutUs.class.getResourceAsStream(imagePath)) {
            if (inputStream != null) {
                Image image = ImageIO.read(inputStream);
                return new ImageIcon(image);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static class CustomScrollbarUI extends BasicScrollBarUI {
        @Override
        protected void configureScrollBarColors() {
            // Configure scrollbar colors here
            thumbColor = new Color(246, 186, 111); // Color of the thumb
            trackColor = new Color(240, 240, 240); // Color of the track
            setThumbHighlightColor(Color.YELLOW);
        }

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return createZeroButton();
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return createZeroButton();
        }

        private JButton createZeroButton() {
            JButton button = new JButton();
            button.setPreferredSize(new Dimension(0, 0));
            button.setMinimumSize(new Dimension(0, 0));
            button.setMaximumSize(new Dimension(0, 0));
            return button;
        }
    }

	public static void setThumbHighlightColor(Color yellow) {
		// TODO Auto-generated method stub
		
	}
}
