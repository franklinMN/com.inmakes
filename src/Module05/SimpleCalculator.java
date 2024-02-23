package Module05;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SimpleCalculator implements ActionListener{

    JFrame frame;
    JPanel panelFrame, panelTop, panelBottom;
    JTextField textField, miniTextField;
    JButton[] numberButton = new JButton[10]; // numbers 0 to 9
    JButton[] functionButtons = new JButton[14];
    JButton percentButton, clrEntryButton, clrButton, deleteButton;
    JButton fractionButton, sqrButton, sqrtButton;
    JButton divButton, mulButton, subButton, addButton;
    JButton negateButton, dotButton, eqlButton;

    public static final int WIDTH = 350;
    public static final int HEIGHT = 600;
    public static final int MARGIN  = 10;
    public static final int BASE_FONT_SIZE = 20;

    
    

    public static double num1 = 0, num2 = 0;
    public static String operator = "";

    SimpleCalculator(){

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font basefont = new Font("Segoe UI", Font.PLAIN, BASE_FONT_SIZE);
        Font textFieldFont = new Font("Segoe UI", Font.PLAIN, BASE_FONT_SIZE + 20);
        
        Color buttonBackgroundColor = new Color(240, 240, 240);
        Color buttonBorderColor = new Color(180, 180, 180);
        Insets buttonInsets = new Insets(10, 10, 10, 10);

        // textField creation
        // .........................................................................................
        miniTextField = new JTextField();
        miniTextField.setBounds(MARGIN, MARGIN, WIDTH-MARGIN*2, 50);
        // miniTextField.setBackground(Color.BLUE);
        miniTextField.setFont(basefont);
        miniTextField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        miniTextField.setEditable(false);
        miniTextField.setVisible(false);

        textField = new JTextField();
        textField.setBounds(MARGIN, 50 + MARGIN, WIDTH-MARGIN*2, 75);
        // textField.setBackground(Color.RED);
        textField.setFont(textFieldFont);
        textField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        textField.setEditable(false);

        // functionButton creation
        // .........................................................................................
        percentButton = new JButton("%"); //1
        clrEntryButton = new JButton("CE"); //2
        clrButton = new JButton("C"); //3
        deleteButton = new JButton("del"); //4
        fractionButton = new JButton("1/x"); //5
        sqrButton = new JButton("x\u00B2"); //6
        sqrtButton = new JButton("\u221Ax"); //7
        divButton = new JButton("\u00F7"); //8
        mulButton = new JButton("X"); //9
        subButton = new JButton("-"); //10
        addButton = new JButton("+"); //11
        negateButton = new JButton("\u00B1"); //12
        dotButton = new JButton("."); //13
        eqlButton = new JButton("="); //14

        functionButtons[0] = percentButton;
        functionButtons[1] = clrEntryButton;
        functionButtons[2] = clrButton;
        functionButtons[3] = deleteButton;
        functionButtons[4] = fractionButton;
        functionButtons[5] = sqrButton;
        functionButtons[6] = sqrtButton;
        functionButtons[7] = divButton;
        functionButtons[8] = mulButton;
        functionButtons[9] = subButton;
        functionButtons[10] = addButton;
        functionButtons[11] = negateButton;
        functionButtons[12] = dotButton;
        functionButtons[13] = eqlButton;

        for(int i=0 ; i<14 ; i++ ){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(basefont);
            functionButtons[i].setBackground(buttonBackgroundColor);
            functionButtons[i].setBorder(BorderFactory.createLineBorder(buttonBorderColor));
            functionButtons[i].setMargin(buttonInsets);
        }


        // numberButton creation
        // .........................................................................................
        for(int i=0 ; i<10 ; i++){
            numberButton[i] = new JButton(String.valueOf(i));
            numberButton[i].addActionListener(this);
            numberButton[i].setFont(basefont);
            numberButton[i].setBackground(buttonBackgroundColor);
            numberButton[i].setBorder(BorderFactory.createLineBorder(buttonBorderColor));
            numberButton[i].setMargin(buttonInsets);
        }


        // Panel creation
        // .........................................................................................
        panelFrame = new JPanel();
        panelFrame.setLayout(null);
        panelFrame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panelFrame.setFont(basefont);

        panelTop = new JPanel();
        panelTop.setLayout(null);
        panelTop.setBounds(0, 0, WIDTH, 145);
        // panelTop.setBackground(Color.YELLOW);
        panelTop.setBackground(new Color(220, 220, 220));
        panelTop.setFont(basefont);

        panelBottom = new JPanel();
        panelBottom.setLayout(new GridLayout(6, 4, 5, 5));
        panelBottom.setBorder(new EmptyBorder(10, 10, 10, 10));
        panelBottom.setBounds(0, 145, WIDTH, HEIGHT-145);
        // panelBottom.setBackground(Color.ORANGE);
        panelBottom.setBackground(new Color(220, 220, 220));
        panelBottom.setFont(basefont);

        // panel adds
        // .........................................................................................
        panelTop.add(miniTextField);
        panelTop.add(textField);

        panelBottom.add(percentButton);
        panelBottom.add(clrEntryButton);
        panelBottom.add(clrButton);
        panelBottom.add(deleteButton);
        panelBottom.add(fractionButton);
        panelBottom.add(sqrButton);
        panelBottom.add(sqrtButton);
        panelBottom.add(divButton);
        panelBottom.add(numberButton[7]);
        panelBottom.add(numberButton[8]);
        panelBottom.add(numberButton[9]);
        panelBottom.add(mulButton);
        panelBottom.add(numberButton[4]);
        panelBottom.add(numberButton[5]);
        panelBottom.add(numberButton[6]);
        panelBottom.add(subButton);
        panelBottom.add(numberButton[1]);
        panelBottom.add(numberButton[2]);
        panelBottom.add(numberButton[3]);
        panelBottom.add(addButton);
        panelBottom.add(negateButton);
        panelBottom.add(numberButton[0]);
        panelBottom.add(dotButton);
        panelBottom.add(eqlButton);
        

        panelFrame.add(panelTop);
        panelFrame.add(panelBottom);

        //frame adds
        // .........................................................................................

        frame.getContentPane().add(panelFrame);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        
        SimpleCalculator calculator = new SimpleCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        Object source = e.getSource();

        // Working with Numbers from 0 to 9 action
        if( source == numberButton[0] && textField.getText().equals("")  ){
            textField.setText("0");
            return;
        }
        if(  source == numberButton[0] && textField.getText().equals("0") ){
            return;
        }
        if(  textField.getText().equals("0") ){

            for( int i=1 ; i<10 ; i++){

                if( source ==  numberButton[i] ){
                    textField.setText(((AbstractButton) e.getSource()).getText());
                    return;
                }
            }
        }

        for( int i=0 ; i<10 ; i++ ){

            if( source ==  numberButton[i] ){
                textField.setText(textField.getText() + i);
                return;
            }
        }

        // functional operations

        if (source == addButton || source == subButton || source == mulButton || source == divButton) {
            if (!textField.getText().isEmpty()) {
                num1 += Double.parseDouble(textField.getText());
                operator = ((JButton) source).getText();
                textField.setText("0");
            }
            return;
        }
    
        if (source == eqlButton) {
            if (!textField.getText().isEmpty()) {
                num2 = Double.parseDouble(textField.getText());
                double result = 0;
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }
                textField.setText(String.valueOf(result));
            }
            return;
        }

         // Dot Button
    if (source == dotButton) {
        if (!textField.getText().contains(".")) {
            textField.setText(textField.getText() + ".");
        }
        return;
    }

    // Negate Button
    if (source == negateButton) {
        if (!textField.getText().isEmpty() && !textField.getText().equals("0")) {
            double temp = Double.parseDouble(textField.getText());
            temp *= -1;
            String result;
            if (temp < 0) {
                result = "-" + Math.abs(temp); // Include the minus sign manually
            } else {
                result = String.valueOf(temp);
            }
            textField.setText(result);
        }
    }

    // Square Button
    if (source == sqrButton) {
        if (!textField.getText().isEmpty()) {
            double value = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(value * value));
        }
        return;
    }

    // Square Root Button
    if (source == sqrtButton) {
        if (!textField.getText().isEmpty()) {
            double value = Double.parseDouble(textField.getText());
            if (value >= 0) {
                textField.setText(String.valueOf(Math.sqrt(value)));
            } else {
                // Handle error for negative input
                textField.setText("Error");
            }
        }
        return;
    }

    // Fraction Button
    if (source == fractionButton) {
        if (!textField.getText().isEmpty()) {
            double value = Double.parseDouble(textField.getText());
            if (value != 0) {
                textField.setText(String.valueOf(1 / value));
            } else {
                // Handle error for division by zero
                textField.setText("Error");
            }
        }
        return;
    }


        // cleaners - c, ce, del

        if( source == clrButton ){
            textField.setText("0");
            num1 = 0;
            operator = "";
            return;
        }

        if(source == clrEntryButton){
            textField.setText("0");
            return;
        }

        if( source == deleteButton ){

            String currentText = textField.getText();

            if( currentText.isEmpty() ) {
                textField.setText("0");
                
            } else if (currentText.equals("0") ){
                textField.setText("0");
                
            } else if( !currentText.isEmpty()) {
                textField.setText(
                    currentText.substring(0, currentText.length() - 1)
                );
                
            }
            return;
        }
    }
}
