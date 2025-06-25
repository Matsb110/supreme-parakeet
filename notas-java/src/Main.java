import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota1, nota2, nota3;
        double promedio;

        nota1 = leerNota(sc, 1);
        nota2 = leerNota(sc, 2);
        nota3 = leerNota(sc, 3);

        promedio = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("El promedio es: " + promedio);
    }

    public static int leerNota(Scanner sc, int numero) {
        int nota;
        do {
            System.out.print("Ingrese nota " + numero + " (0-20): ");
            nota = sc.nextInt();
        } while (nota < 0 || nota > 20);
        return nota;
    }
}
