import java.util.Scanner;

public class problemA6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, aux, aux2, z = 1, p = 1, q= 2, r = 3, s = 4;

		System.out.print("introduzca cuantos numeros quiere : ");
		n = reader.nextInt();

		System.out.print("Introduzca esos números  : ");
		int lista[] = new int[n];

		for (int x = 0; x < n; x++) {
			lista[x] = reader.nextInt();
		}

		for (int k = 0; k < lista.length - 4; k++) {

			aux = lista[k] * lista[k + 1] * lista[k + 2] * lista[k + 3];
			aux2 = lista[k + 1] * lista[k + 2] * lista[k + 3] * lista[k + 4];

			if (aux2 > aux) {
				z = aux2;
				p = lista[k + 1];
				q = lista[k + 2];
				r = lista[k + 3];
				s = lista[k + 4];

			} else {
				z = aux;
			}

		}
		System.out.println("La multiplicacion máxima es igual a :" + z);
		System.out.println("Los números son :{" + p + "," + q + "," + r + "," + s + "}");
	}

}

