import javax.swing.*;
import java.awt.*;

/**
 * Filename :   MessageGenerator
 * Author :     William Crutchfield
 * Date:        2/4/2019
 * Purpose: Generates a customized message based on the users input
 */
public class MessageGenerator extends JFrame {

    private JTextField nameTxt;
    private JTextField resultsTxt;
    private String name = "____";

    private String msg1 = "Hello" + name + "!";
    private String msg2 = "How are you" + name + "?";
    private String msg3 = name + " is a cool name!";
    private String msg4 = name + "is great at Java!";

    /**
     * Generates the GUI and Action Listeners
     */
    private MessageGenerator() {

        // JFrame Settings
        setTitle("Message Generator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(250, 250);
        setVisible(true);
        setResizable(false);

        // JPanel Settings
        JPanel main = new JPanel(new GridBagLayout());

        // GridBagConstraints Parameters
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5,5,5,5);
        c.fill = GridBagConstraints.HORIZONTAL;

        // Create Components
        JLabel nameLabel = new JLabel("Enter Name:");
        nameTxt = new JTextField ();

        JButton msg1Btn = new JButton(msg1);
        JButton msg2Btn = new JButton(msg2);
        JButton msg3Btn = new JButton(msg3);
        JButton msg4Btn = new JButton(msg4);

        resultsTxt = new JTextField ();
        resultsTxt.setEditable(false);

        // Add Components
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.gridheight = 1;
        main.add(nameLabel, c);

        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 2;
        c.gridheight = 1;
        main.add(nameTxt, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 4;
        c.gridheight = 1;
        main.add(msg1Btn, c);

        c.gridy = 2;
        main.add(msg2Btn, c);

        c.gridy = 3;
        main.add(msg3Btn, c);

        c.gridy = 4;
        main.add(msg4Btn, c);

        c.gridy = 5;
        main.add(resultsTxt, c);

        // Add to JFrame
        add(main);
        validate();

        // Action Listeners
        msg1Btn.addActionListener (e -> updateMsg1 ());
        msg2Btn.addActionListener (e -> updateMsg2 ());
        msg3Btn.addActionListener (e -> updateMsg3 ());
        msg4Btn.addActionListener (e -> updateMsg4 ());
    }

    /**
     * Updates the text found in Message 1
     */
    private void updateMsg1() {
        name = nameTxt.getText();
        msg1 = "Hello " + name + "!";
        resultsTxt.setText(msg1);
    }

    /**
     * Updates the text found in Message 2
     */
    private void updateMsg2() {
        name = nameTxt.getText();
        msg2 = "How are you " + name + "?";
        resultsTxt.setText(msg2);
    }

    /**
     * Updates the text found in Message 3
     */
    private void updateMsg3() {
        name = nameTxt.getText();
        msg3 = name + " is a cool name!";
        resultsTxt.setText(msg3);
    }

    /**
     * Updates the text found in Message 4
     */
    private void updateMsg4() {
        name = nameTxt.getText();
        msg4 = name + " is great at Java!";
        resultsTxt.setText(msg4);
    }

    /**
     * Main method, creates an instance of the MessageGenerator Class
     * @param args arguments do not effect the outcome of the program
     */
    public static void main(String[] args){
        new MessageGenerator();
    }
}
