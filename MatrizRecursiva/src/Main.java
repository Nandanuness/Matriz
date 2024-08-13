import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linhas, colunas;

        System.out.println("Digite o número de linhas da matriz: ");
        linhas = scanner.nextInt();

        System.out.println("Digite o número de colunas da matriz: ");
        colunas = scanner.nextInt();

        int[][] matriz = Matriz.criarMatriz(linhas, colunas);

        System.out.println("Matriz criada:");
        Matriz.exibirMatriz(matriz, 0, 0);

        scanner.close();
    }
}
