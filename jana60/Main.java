package jana60;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Rettangolo A = new Rettangolo();
		
		System.out.println("Inserisci L'altezza del rettangolo");
		A.altezza = scan.nextInt();
		
		System.out.println("Inserisci La base del rettangolo");
		A.base = scan.nextInt();
		
        A.restStampa();
        
        scan.close();
	}

}
