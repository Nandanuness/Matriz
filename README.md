# Relatório de Exibição de Matriz em Método Recursivo

A função "exibirMatriz" utiliza 2 parâmetros para acompanhar a posição atual na matriz (linha, coluna), e recebe como entrada o número de linhas e colunas inseridas pelo usuário que pode ser acessada utilizando "matriz.lenght";

__CONDIÇÃO BASE__: "linha >= matriz.length" verifica se a posição atual da linha atingiu ou passou o total de linhas da matriz inserido pelo usuário. Quando essa condição for verdadeiro significa que todos os elementos da matriz já foram exibidos, parando a recursão através do comando return.

A função exibe a matriz de forma recursiva avançando linhas e colunas, através da última linha da função: "exibirMatriz(matriz, linha, coluna);" e funciona da seguinte forma: 1: exibe o elemento da matriz na posição atual "matriz[linha - i][coluna - j]" 2: a coluna avança para o próximo elemento 3: se a coluna atingir o número de colunas inserido pelo usuário ele é resetado para 0, e a linha avança para a próxima. 4: a função chama a si mesma com índices atualizados. 5: a recursão continua até que a condição base seja atingida A chamada recursiva se dá na linha 29 da classe Matriz: "exibirMatriz(matriz, linha, coluna);"

Utilizei no código a geração de números aletórios de 0 a 9 para preenchimento dos elementos da matriz, conforme pesquisa no site https://www.w3schools.com/java/java_math.as.
