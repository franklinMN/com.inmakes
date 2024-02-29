package Module05;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class Notepad extends JFrame{

    private JTextArea textArea;
    private JFileChooser fileChooser;
    private File currentFile;

    Notepad(){

        this.setTitle("Notepad");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        // creating text area and stuffing it in scrollpane
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        textArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(textArea);
        mainPanel.add(jScrollPane, BorderLayout.CENTER);

        // creating the menubar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem open = new JMenuItem("open");
        JMenuItem save = new JMenuItem("save");
        JMenuItem saveAs = new JMenuItem("save as");
        fileMenu.add(open);
        fileMenu.add(save);
        fileMenu.add(saveAs);
        menuBar.add(fileMenu);

        fileChooser = new JFileChooser();

        open.addActionListener( e -> {
            int resultValue = fileChooser.showOpenDialog(Notepad.this);
            if( resultValue == JFileChooser.APPROVE_OPTION ) {
                File file = fileChooser.getSelectedFile();
                currentFile = fileChooser.getSelectedFile();
                openFile(file);
            }
        } );

        saveAs.addActionListener( e -> saveAs() );
        save.addActionListener( e -> saveToFile(currentFile) );
        
        this.setJMenuBar(menuBar);
        this.setContentPane(mainPanel);

        this.setVisible(true);


    }

    public void saveToFile( File file ){
        
        if( file != null ) {

            try{

                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(textArea.getText());
                writer.close();

            }catch( IOException e ){
                e.printStackTrace();
            }
        }else {
            saveAs();
        }
    }

    public void saveAs(){

        int resultValue = fileChooser.showSaveDialog(Notepad.this);

        if( resultValue == JFileChooser.APPROVE_OPTION ){

            File newFile = fileChooser.getSelectedFile();

            if( newFile.exists() ){
                int option = JOptionPane.showConfirmDialog(this, "File already exist do you want to rewrite it ? ", "Confirm overwrite ?", JOptionPane.YES_NO_OPTION);
                
                if( option == JOptionPane.YES_OPTION ) {
                    currentFile = newFile;
                    saveToFile(currentFile);
                }
            }else {
                currentFile = newFile;
                saveToFile(currentFile);
            }
        }
    }

    public void openFile( File file ){

        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            textArea.setText("");
            
            String line;
            while( (line = reader.readLine()) != null ){
                textArea.append(line);
                textArea.append("\n");
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater( new Runnable(){
            @Override
            public void run(){
                new Notepad();
            }
        } );
    }
}
