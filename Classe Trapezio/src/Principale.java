import java.io.*;
public class Principale {
	public static void main(String[] args) {
	
	String valore;
	int l1=0,l2=0,l3=0,l4=0,l5=0;
	InputStreamReader input = new InputStreamReader(System.in);
	BufferedReader tastiera = new BufferedReader(input);
	
	try {
		System.out.println("Inserisci la misura del primo lato: ");
		valore=tastiera.readLine();	
		l1=Integer.valueOf(valore).intValue();
		System.out.println("Inserisci la misura del secondo lato: ");
		valore=tastiera.readLine();	
		l2=Integer.valueOf(valore).intValue();
		System.out.println("Inserisci la misura del terzo lato: ");
		valore=tastiera.readLine();
		l3=Integer.valueOf(valore).intValue();
		System.out.println("Inserisci la misura del quarto lato: ");
		valore=tastiera.readLine();
		l4=Integer.valueOf(valore).intValue();
		System.out.println("Inserisci la misura dell'altezza: ");
		valore=tastiera.readLine();
		l5=Integer.valueOf(valore).intValue();
	}catch(IOException e) {
		System.out.println("Errore");
		return;
	}
	datiTrapezio trapezio1 = new datiTrapezio(l1,l2,l3,l4,l5); 
	System.out.println("Il perimetro vale: " + trapezio1.Cperimetro(l1, l2, l3, l4));
	System.out.println("L'area vale: " + trapezio1.Carea(l1, l2, l3, l4,l5));
	}
}
