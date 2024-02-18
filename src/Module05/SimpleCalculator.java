package Module05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator implements ActionListener{

    JFrame frame;
    JPanel panelFrame, panelTop, panelBottom;
    JTextField textField, miniTextField;
    JButton[] numberButton = new JButton[10]; // numbers 0 to 9
    JButton[] functioButtons = new JButton[14];
    JButton percentButton, clrEntryButton, clrButton, deleteButton;
    JButton fractiButton, sqrButton, sqrtButton;
    JButton divButton, mulButton, subButton, addButton;
    JButton negateButton, dotButton, eqlButton;

    public static final int WIDTH = 350;
    public static final int HEIGHT = 600;
    public static final int MARGIN  = 10;
    // public static final String numberButtonString[] = {
    //     "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    // };

    SimpleCalculator(){

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // textField creation
        // .........................................................................................
        miniTextField = new JTextField();
        miniTextField.setBounds(MARGIN, MARGIN, WIDTH-MARGIN*2, 50);
        miniTextField.setBackground(Color.BLUE);

        textField = new JTextField();
        textField.setBounds(MARGIN, 50 + MARGIN, WIDTH-MARGIN*2, 75);
        textField.setBackground(Color.RED);

        // functionButton creation
        // .........................................................................................
        percentButton = new JButton("%"); //1
        clrEntryButton = new JButton("CE"); //2
        clrButton = new JButton("C"); //3
        deleteButton = new JButton("del"); //4
        fractiButton = new JButton("1/x"); //5
        sqrButton = new JButton("x\u00B2"); //6
        sqrtButton = new JButton("\u221Ax"); //7
        divButton = new JButton("\u00F7"); //8
        mulButton = new JButton("X"); //9
        subButton = new JButton("-"); //10
        addButton = new JButton("+"); //11
        negateButton = new JButton("\u00B1"); //12
        dotButton = new JButton("."); //13
        eqlButton = new JButton("="); //14

        functioButtons[0] = percentButton;
        functioButtons[1] = clrEntryButton;
        functioButtons[2] = clrButton;
        functioButtons[3] = deleteButton;
        functioButtons[4] = fractiButton;
        functioButtons[5] = sqrButton;
        functioButtons[6] = sqrtButton;
        functioButtons[7] = divButton;
        functioButtons[8] = mulButton;
        functioButtons[9] = subButton;
        functioButtons[10] = addButton;
        functioButtons[11] = negateButton;
        functioButtons[12] = dotButton;
        functioButtons[13] = eqlButton;

        for(int i=0 ; i<14 ; i++ ){
            functioButtons[i].addActionListener(this);
        }


        // numberButton creation
        // .........................................................................................
        for(int i=0 ; i<10 ; i++){
            numberButton[i] = new JButton(String.valueOf(i));
            numberButton[i].addActionListener(this);
        }


        // Panel creation
        // .........................................................................................
        panelFrame = new JPanel();
        panelFrame.setLayout(null);
        panelFrame.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        panelTop = new JPanel();
        panelTop.setLayout(null);
        panelTop.setBounds(0, 0, WIDTH, 145);
        panelTop.setBackground(Color.YELLOW);

        panelBottom = new JPanel();
        panelBottom.setLayout(new GridLayout(6, 4)); 
        panelBottom.setBounds(0, 146, WIDTH, HEIGHT-145);
        panelBottom.setBackground(Color.ORANGE);

        // panel adds
        // .........................................................................................
        panelTop.add(miniTextField);
        panelTop.add(textField);


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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
