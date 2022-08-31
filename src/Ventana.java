import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {
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
		JButton clear = new JButton("<");
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
		JButton ss = new JButton(",");
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
		Psuperior.setBackground(Color.lightGray);
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

	int[] temp = new int[5];

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case "E":
				System.out.println(e.getActionCommand());
				break;
			case "CE":
				System.out.println(e.getActionCommand());
				break;
			case "C":
				System.out.println(e.getActionCommand());
				break;
			case "<":
				System.out.println(e.getActionCommand());
				break;
			case "clear":
				System.out.println(e.getActionCommand());
				break;
			case "/":
				System.out.println(e.getActionCommand());
				break;
			case "-":
				System.out.println(e.getActionCommand());
				break;
			case "+":
				System.out.println(e.getActionCommand());
				int res = 0;

				for (int j = 0; j < temp.length; j++) {
					if (temp.length != 0) {
						for (int i = 0; i < temp.length; i++) {
							res += temp[i];
						}
					} else {
						System.out.println("No puedo sumar, me falta un numero");
					}
				}

				System.out.println(res);
				break;
			case "=":
				System.out.println(e.getActionCommand());
				break;
			case "1":
				System.out.println(e.getActionCommand());
				temp[0] = 1;
				for (int i = 0; i < temp.length; i++) {
					System.out.println("Arreglo tiene [" + temp[i] + "]");
				}
				break;
			case "2":
				System.out.println(e.getActionCommand());
				temp[1] = 2;

				for (int i = 0; i < temp.length; i++) {
					System.out.println("Arreglo tiene [" + temp[i] + "]");
				}

				break;
		}

	}

}

// Formas de mover la ventana
// setLocationRelativeTo(null); Centrar en la pantalla
// setBounds(X, Y, ANCHO, LARGO);
// setSize(ancho, largo); Tamaño ventana
// this.getContentPane().setBackground(Color.white); Color de ventana