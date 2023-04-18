import java.util.ArrayList;
import java.util.Scanner;

public class M73_Ex6_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nomNum = 0;
		int numsUsuari = 0;
		int sumaPares = 0;
		int sumaImpares = 0;
		
		ArrayList <Integer> xifres = new ArrayList <Integer>();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quants números vols introduir: ");
		nomNum = entrada.nextInt();
		
		for(int i = 0; i < nomNum; i++) {
			System.out.println("Introdueix una xifra: ");
			numsUsuari = entrada.nextInt();
			xifres.add(numsUsuari);
		}
		for(int z = 0; z < nomNum; z++)	
			if(xifres.get(z) % 2 == 0 ) {
				sumaPares += xifres.get(z);		
			}else if (xifres.get(z) % 2 != 0 ) {
				sumaImpares += xifres.get(z);
			}
		System.out.println("La suma de los pares:  " + sumaPares);	
		System.out.println("La suma de los impares: " + sumaImpares);
	}

}
