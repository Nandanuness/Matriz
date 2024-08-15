# Relatório de Exibição de Matriz em Método Recursivo

A função "exibirMatriz" utiliza 2 parâmetros de acompanhamento da posição atual na matriz (linha, coluna), e recebe a entrada do número de linhas e colunas que o usuário inserir;
Os parâmetros inseridos podem ser acessados através de "matriz.lenght" para linhas e "matriz[0].length" para colunas;

__CONDIÇÃO BASE__: "linha >= matriz.length" verifica se a posição atual da linha atingiu ou passou o total de linhas da matriz inserido pelo usuário. Quando essa condição for verdadeiro significa que todos os elementos da matriz já foram exibidos, parando a recursão através do comando return;

A função faz a exibição dos elementos de uma matriz de forma recursiva avançando linhas e colunas, e funciona da seguinte forma passo a passo: 

1: exibe o elemento da matriz na posição atual "matriz[linha - i][coluna - j]".

2: a coluna avança para o próximo elemento "coluna++;".

3: se a coluna atingir o número de colunas inserido pelo usuário ele é resetado para 0 (coluna 0), e a linha avança para a próxima.  "if (coluna >= matriz[0].length) { coluna = 0; linha++;" 

4: a função chama a si mesma com índices atualizados, utilizando então a recursividade. A chamada recursiva se dá na linha 29 da classe Matriz "exibirMatriz(matriz, linha, coluna);"

5: a recursão continua até que a condição base seja alcançada. "if (linha >= matriz.length) { return; }"

Utilizei no código a geração de números aletórios de 0 a 9 para preenchimento dos elementos da matriz, conforme pesquisa no site https://www.w3schools.com/java/java_math.as.
