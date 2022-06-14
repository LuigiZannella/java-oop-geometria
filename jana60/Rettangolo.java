package jana60;

public class Rettangolo {
	
	int altezza;
	int base;

	int areaRettangolo () {
		int area = altezza * base;
		return area;
	}

	int perimetroRettangolo () {
		int perimetro = (altezza+base) * 2;
		return perimetro;
	}
	
	void restStampa () {
		System.out.println("L'area di questo rettangolo è di:" + areaRettangolo() + " Il perimetro è di " + perimetroRettangolo());
	}

}
