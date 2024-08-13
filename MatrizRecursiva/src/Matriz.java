public class Matriz {
    public static int[][] criarMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {          // percorre as linhas - i
            for (int j = 0; j < colunas; j++) {     // percorre as colunas - j
                matriz[i][j] = (int) (Math.random() * 10); // preenche com valores aleatórios de 0 a 9
//                matriz[i][j] = 1;  // preenche todas as posições da matriz com o número 1

            }
        }
        return matriz;
    }

    public static void exibirMatriz(int[][] matriz, int linha, int coluna) {
        if (linha >= matriz.length) { //se a linha atual for maior ou igual ao número de linhas da matriz, termina a recursividade
            return;
        }

        System.out.print(matriz[linha][coluna] + " "); // exibe elemento atual da matriz

        coluna++; // pula para próxima coluna
        if (coluna >= matriz[0].length) {
            coluna = 0;
            linha++; // pula para a próxima linha
            System.out.println(); // quebra de linha para separar as linhas da matriz
        }

        exibirMatriz(matriz, linha, coluna); // chama recursivamente, repetindo para a proxima posição da matriz
    }
}