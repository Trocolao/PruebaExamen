package figuras;

public class Circunferencia {
	private double radio;
	private String color;

	public Circunferencia(double radio) {
		this.setRad(radio);
	}

	public void imprimir() {
		color = "rojo";
		System.out.println("Diametro: " + (2 * getRad()));
		System.out.println("Color: " + color);
		double area1 = 2 * 3.1416 * getRad() * getRad();
		double area = area1;
		System.out.println(area);
	}

	public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
		double radio1 = this.getRad();
		double radio2 = otro.getRad();
		if (considerarDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}

	double getRad() {
		return radio;
	}

	void setRad(double rad) {
		this.radio = rad;
	}
}