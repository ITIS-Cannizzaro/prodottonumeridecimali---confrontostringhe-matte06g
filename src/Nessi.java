import java.util.Scanner;
import java.lang.Math;
public class Nessi
{
	static Scanner in = new Scanner(System.in);
	static double[]array=new double[6];
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = in.nextInt();
			switch(scelta)
			{
				case 1:
					prodottonumeridecimali(array);
				break;
				case 2:
					
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		System.out.println("1 - Es n. 1");
		System.out.println("2 - Es n. 2");
	}
	static double[]prodottonumeridecimali(double[]a)
	{
		double[]b = new double[a.length/2];
		riempiarray(a);
		int k = -1;
		for(int i = 1; i < a.length;i+=2)
		{
			k++;
			b[k]=a[i]*a[i-1];
		}
		for(int j = 0; j < b.length; j++)
		{
			System.out.println("L'elemento alla posizione " + (j+1) + " è: " + (b[j]));
		}
		return b;
	}
	static double[]riempiarray(double[]x)
	{
		System.out.println("Inserire valori decimali:");
		for(int i = 0;i < x.length;i++)
		{
			System.out.println("Valore alla posizione " + (i+1) + ": " );
			x[i]=in.nextDouble();
		}
		return x;
	}
}
