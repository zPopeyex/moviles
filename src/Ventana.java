import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {
    private JLabel resulta;

    // Constructor
    public Ventana() {
        setTitle("Calculadora - Steven Garzón");
        setSize(400, 500); // Tamaño ventana

        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        // Panel contenedor
        JPanel contenedor = new JPanel();
        contenedor.setLayout(new GridLayout(2, 1));

        // Buttons
        JButton E = new JButton("E");
        JButton CE = new JButton("CE");
        JButton C = new JButton("C");
        JButton clear = new JButton("*");
        JButton seven = new JButton("7");
        JButton eig = new JButton("8");
        JButton nin = new JButton("9");
        JButton divide = new JButton("/");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton rest = new JButton("-");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton tree = new JButton("3");
        JButton sum = new JButton("+");
        JButton dat = new JButton(".");
        JButton zero = new JButton("0");
        JButton ss = new JButton("");
        ss.setEnabled(false);
        JButton equal = new JButton("=");

        E.addActionListener(this);
        CE.addActionListener(this);
        C.addActionListener(this);
        clear.addActionListener(this);
        seven.addActionListener(this);
        eig.addActionListener(this);
        nin.addActionListener(this);
        divide.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        rest.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        tree.addActionListener(this);
        sum.addActionListener(this);
        dat.addActionListener(this);
        zero.addActionListener(this);
        ss.addActionListener(this);
        equal.addActionListener(this);

        // Panel superior (Texto)
        JPanel Psuperior = new JPanel();
        Psuperior.setBackground(Color.WHITE);
        resulta = new JLabel("0");
        Psuperior.add(resulta);
        // this.getContentPane().add(Psuperior);// Añadimos el panel al JFrame

        // Panel Inferior (Botones)
        JPanel Inferior = new JPanel();
        Inferior.setLayout(new GridLayout(5, 4));
        Inferior.setBackground(Color.DARK_GRAY);
        // this.getContentPane().add(Inferior);// Añadimos el panel al JFrame

        Inferior.add(E);
        Inferior.add(CE);
        Inferior.add(C);
        Inferior.add(clear);
        Inferior.add(seven);
        Inferior.add(eig);
        Inferior.add(nin);
        Inferior.add(divide);
        Inferior.add(four);
        Inferior.add(five);
        Inferior.add(six);
        Inferior.add(rest);
        Inferior.add(one);
        Inferior.add(two);
        Inferior.add(tree);
        Inferior.add(sum);
        Inferior.add(dat);
        Inferior.add(zero);
        Inferior.add(ss);
        Inferior.add(equal);

        setContentPane(contenedor);
        contenedor.add(Psuperior);
        contenedor.add(Inferior);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (isNumeric(command) || command.equals("*") || command.equals("/") || command.equals("-") || command.equals("+")) {
            if (resulta.getText().length() == 1 && resulta.getText().equals("0")) {
                resulta.setText(command);
            } else {
                resulta.setText(resulta.getText() + command);
            }
        } else {
            switch (e.getActionCommand()) {
                case "E":
                    if (resulta.getText().length() > 1) {
                        StringBuilder sb = new StringBuilder(resulta.getText());
                        sb.deleteCharAt(resulta.getText().length() - 1);
                        resulta.setText(sb.toString());
                    } else if (resulta.getText().length() == 1) {
                        resulta.setText("0");
                    }

                    break;
                case "CE":
                case "C":
                    resulta.setText("0");
                    break;
                case "=":
                    ScriptEngineManager manager = new ScriptEngineManager();
                    ScriptEngine se = manager.getEngineByName("JavaScript");

                    try {
                        Object result = se.eval(resulta.getText());
                        resulta.setText(result.toString());
                    } catch (ScriptException error) {
                        error.printStackTrace();
                        resulta.setText("ERROR...");
                    }
                    break;
            }
        }
    }

    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}

// Formas de mover la ventana
// setLocationRelativeTo(null); Centrar en la pantalla
// setBounds(X, Y, ANCHO, LARGO);
// setSize(ancho, largo); Tamaño ventana
// this.getContentPane().setBackground(Color.white); Color de ventana