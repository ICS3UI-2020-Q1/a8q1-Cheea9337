import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables 
  JPanel mainPanel;

  JTextField nameText; 

  JLabel outputArea;

  JButton helloButton;

  Font biggerText;
  
  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    // initialize the main JPanel
    mainPanel = new JPanel();
    // disable any layout helpers
    mainPanel.setLayout(null);

    // initialize the input text field
    nameText = new JTextField();

    // set the location and size
    nameText.setBounds(200, 100, 400, 40);

    // initialize the text area
    outputArea = new JLabel();

    // set the size and location of the text area
    outputArea.setBounds(200, 240, 400, 40);

    // create a bigger Font
    biggerText = new Font("arial", Font.PLAIN, 20);

    // set the font on the area I want to use it
    outputArea.setFont(biggerText);
    nameText.setFont(biggerText);

    // initialize the button
    helloButton = new JButton("Say Hello");

    // add an action listener to the button
    helloButton.addActionListener(this);

    // set the action command on the button
    helloButton.setActionCommand("say hello");

    // set the size and location of the button
    helloButton.setBounds(350, 320, 200, 40);

    // add button to the panel
    mainPanel.add(helloButton);

    // add text fields to the panel
    mainPanel.add(nameText);

    // add to main panel
    mainPanel.add(outputArea);

    // add the panel to the frame
    frame.add(mainPanel);
 
    
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    if(command.equals("say hello")){
      // get the text from the text box
      String nameInfo = nameText.getText();
      // out the hello and name to the user
      outputArea.setText("Hello " + nameInfo);

    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
