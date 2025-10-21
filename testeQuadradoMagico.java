public class testeQuadradoMagico {
    public static void main(String[] args) {
        int[][] matriz1 = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        int[][] matriz2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz 1 é quadrado mágico? " +
            QuadradoMagico.ehQuadradoMagico(matriz1));

        System.out.println("Matriz 2 é quadrado mágico? " +
            QuadradoMagico.ehQuadradoMagico(matriz2));
    }
}
