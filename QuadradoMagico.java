public class QuadradoMagico {

    public static boolean ehQuadradoMagico(int[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            if (matriz[i].length != n) {
                return false;
            }
        }

        int somaEsperada = 0;
        for (int j = 0; j < n; j++) {
            somaEsperada += matriz[0][j];
        }

        for (int i = 0; i < n; i++) {
            int somaLinha = 0;
            for (int j = 0; j < n; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha != somaEsperada) return false;
        }

        for (int j = 0; j < n; j++) {
            int somaColuna = 0;
            for (int i = 0; i < n; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna != somaEsperada) return false;
        }

        int somaDiag1 = 0, somaDiag2 = 0;
        for (int i = 0; i < n; i++) {
            somaDiag1 += matriz[i][i];
            somaDiag2 += matriz[i][n - 1 - i];
        }

        if (somaDiag1 != somaEsperada || somaDiag2 != somaEsperada) {
            return false;
        }

        java.util.HashSet<Integer> elementos = new java.util.HashSet<>();
        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (!elementos.add(valor)) return false;
            }
        }

        return true;
    }
}
