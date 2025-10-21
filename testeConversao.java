public class testeConversao {
    public static void main(String[] args) {
        double litros = 2;
        double m3 = 1;
        double galao = 5;

        System.out.println("--- Teste de Conversões ---");
        System.out.println(litros + " litro(s) = " +
            ConversaoUnidades.litrosParaCentimetrosCubicos(litros) + " cm³");

        System.out.println(m3 + " m³ = " +
            ConversaoUnidades.metrosCubicosParaLitros(m3) + " litros");

        System.out.println(m3 + " m³ = " +
            ConversaoUnidades.metrosCubicosParaPesCubicos(m3) + " pés³");

        System.out.println(galao + " galões = " +
            ConversaoUnidades.galaoParaPolegadasCubicas(galao) + " pol³");

        System.out.println(galao + " galões = " +
            ConversaoUnidades.galaoParaLitros(galao) + " litros");
    }
}
