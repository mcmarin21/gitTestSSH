import java.util.Scanner;

public class papa{
	public static void main(args[]){
		int cantPapa = 0;
		cantPapa = cantPapas();
		System.out.println("Una papa es color amarillo");
		System.out.println("Con " + cantPapas + " papas amarillas"):
	}

	public static int cantPapas(){
		int papas = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cuantas papas quieres?");
		papas = scanner.nextInt();
		return papas;
	}
}
