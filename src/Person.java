import javax.swing.*;

public class Person {

	double peso;
	double altura;
	double IMC;

	public double solicita_datos() {
		peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en (kg)"));
		System.out.println("Su peso es: " + peso);

		altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en (m2)"));
		System.out.println("Su altura es: " + altura);

		return (peso + altura);
	}

	public double calculaIMC() {

		IMC = peso / (altura * altura);
		IMC = Math.round(IMC * 100) / 100d;

		if (IMC < 16) {
			System.out.println("Se encuentra en estado de desnutrición");
		} else if (IMC <= 19) {
			System.out.println("Se encuentra en estado de desnutricion leve");
		} else if (IMC <= 26) {
			System.out.println("Se encuentra en estado de peso Normal");
		} else if (IMC <= 30) {
			System.out.println("Se encuentra en estado de sobrepeso");
		} else if (IMC <= 40) {
			System.out.println("Se encuentra en estado de Obesidad tipo I");
		}

		return (IMC);
	}

	public double imprime() {

		System.out.println("Su Indice de Masa Corporal es: " + IMC);
		return (IMC);
	}

}
