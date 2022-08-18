import javax.swing.*;

public class Person {

	double peso;
	double altura;
	double IMC;

	public double solicita_datos() {
		peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en (kg)"));
		System.out.println(peso);

		altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en (m2)"));
		System.out.println(altura);

		return (peso + altura);
	}

	public double calculaIMC() {

		IMC = peso / (altura * altura);
		IMC = Math.round(IMC * 100) / 100d;

		if (IMC < 16) {
			System.out.println("Desnutrición");
		} else if (IMC <= 19) {
			System.out.println("Desnutricion leve");
		} else if (IMC <= 26) {
			System.out.println("Peso Normal");
		} else if (IMC <= 30) {
			System.out.println("Estas en sobrepeso");
		}

		return (IMC);
	}

	public double imprime() {

		System.out.println("Su Indice de Masa Corporal es: " + IMC);
		return (IMC);
	}

}
