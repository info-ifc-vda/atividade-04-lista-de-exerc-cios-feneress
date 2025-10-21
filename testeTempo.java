public class testeTempo {
    public static void main(String[] args) {
        Tempo t1 = new Tempo(1, 0, 0);
        Tempo t2 = new Tempo(2, 30, 0);

        t1.exibirInfo();
        t2.exibirInfo();

        System.out.println("Diferença em segundos: " + t1.diferencaEmSegundos(t2));

        t1.setHora(10);
        t1.exibirInfo();
    }
}
