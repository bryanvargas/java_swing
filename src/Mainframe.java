import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class Mainframe extends JFrame implements Serializable{

    private JTextField text_area;
    private JButton boton;

    public Mainframe(){
        super("hello World");
        setLayout(new BorderLayout());

        text_area = new JTextField();
        boton = new JButton("Click Me");

        add(text_area, BorderLayout.CENTER);
        add(boton, BorderLayout.SOUTH);


        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
