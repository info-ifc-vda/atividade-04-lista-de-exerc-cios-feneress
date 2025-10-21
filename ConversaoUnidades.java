public class ConversaoUnidades {
    public static double litrosParaCentimetrosCubicos(double litros) {
        return litros * 1000;
    }

    public static double centimetrosCubicosParaLitros(double cm3) {
        return cm3 / 1000;
    }

    public static double metrosCubicosParaLitros(double m3) {
        return m3 * 1000;
    }

    public static double litrosParaMetrosCubicos(double litros) {
        return litros / 1000;
    }

    public static double metrosCubicosParaPesCubicos(double m3) {
        return m3 * 35.32;
    }

    public static double pesCubicosParaMetrosCubicos(double pes) {
        return pes / 35.32;
    }

    public static double galaoParaPolegadasCubicas(double galao) {
        return galao * 231;
    }

    public static double polegadasCubicasParaGalao(double polegadas) {
        return polegadas / 231;
    }

    public static double galaoParaLitros(double galao) {
        return galao * 3.785;
    }

    public static double litrosParaGalao(double litros) {
        return litros / 3.785;
    }

    
}
