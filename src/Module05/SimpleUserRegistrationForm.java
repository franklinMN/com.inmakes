package Module05;

import java.awt.*;
import java.awt.event.*;

public class SimpleUserRegistrationForm extends Frame {

    Label lblFirstName, lblLastName, lblDOB, lblGender, lblPlace, lblContact;
    TextField txtFirstName, txtLastName, txtDOB, txtPlace, txtContact;
    CheckboxGroup genderGroup;
    Checkbox chkMale, chkFemale;
    Button btnSubmit;

    public SimpleUserRegistrationForm() {
        // Frame setup
        setTitle("User Registration Form");
        setSize(400, 300);
        setLayout(null); // Absolute layout

        // Labels
        lblFirstName = new Label("First Name:");
        lblFirstName.setBounds(50, 50, 80, 20);
        add(lblFirstName);

        lblLastName = new Label("Last Name:");
        lblLastName.setBounds(50, 80, 80, 20);
        add(lblLastName);

        lblDOB = new Label("Date of Birth:");
        lblDOB.setBounds(50, 110, 80, 20);
        add(lblDOB);

        lblGender = new Label("Gender:");
        lblGender.setBounds(50, 140, 80, 20);
        add(lblGender);

        lblPlace = new Label("Place:");
        lblPlace.setBounds(50, 170, 80, 20);
        add(lblPlace);

        lblContact = new Label("Contact Number:");
        lblContact.setBounds(50, 200, 100, 20);
        add(lblContact);

        // Text fields
        txtFirstName = new TextField();
        txtFirstName.setBounds(150, 50, 150, 20);
        add(txtFirstName);

        txtLastName = new TextField();
        txtLastName.setBounds(150, 80, 150, 20);
        add(txtLastName);

        txtDOB = new TextField();
        txtDOB.setBounds(150, 110, 150, 20);
        add(txtDOB);

        txtPlace = new TextField();
        txtPlace.setBounds(150, 170, 150, 20);
        add(txtPlace);

        txtContact = new TextField();
        txtContact.setBounds(150, 200, 150, 20);
        add(txtContact);

        // Gender radio buttons
        genderGroup = new CheckboxGroup();
        chkMale = new Checkbox("Male", genderGroup, false);
        chkMale.setBounds(150, 140, 50, 20);
        add(chkMale);

        chkFemale = new Checkbox("Female", genderGroup, false);
        chkFemale.setBounds(220, 140, 60, 20);
        add(chkFemale);

        // Submit button
        btnSubmit = new Button("Submit");
        btnSubmit.setBounds(150, 240, 80, 30);
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action to perform when Submit button is clicked
                // For simplicity, just printing the entered values
                System.out.println("First Name: " + txtFirstName.getText());
                System.out.println("Last Name: " + txtLastName.getText());
                System.out.println("Date of Birth: " + txtDOB.getText());
                System.out.println("Gender: " + (chkMale.getState() ? "Male" : "Female"));
                System.out.println("Place: " + txtPlace.getText());
                System.out.println("Contact Number: " + txtContact.getText());
            }
        });
        add(btnSubmit);

        // Window closing listener
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Close the window
            }
        });
    }

    public static void main( String[] args ) {

        SimpleUserRegistrationForm form = new SimpleUserRegistrationForm();
        form.setVisible(true);
        
    }
    
}
