package jana60;

import java.util.Scanner;

public class MainBonus {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Rettangolo A = new Rettangolo();
		
		int areaMaggiore = 0;
		
		for (int i = 0; i < 5; i++) 
		{
			
			System.out.println("Inserisci L'altezza del rettangolo");
			A.altezza = scan.nextInt();
			System.out.println("Inserisci La base del rettangolo");
			A.base = scan.nextInt();
			if (A.areaRettangolo() > areaMaggiore) {
				areaMaggiore = A.areaRettangolo();
			}
			
		}
		
		System.out.println("L'area maggiore è " + areaMaggiore);
		        
        scan.close();
	}

}