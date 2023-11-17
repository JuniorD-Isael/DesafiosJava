// 02. both_ends
// Dada uma string s, retorne uma string feita com os dois primeiros
// e os dois últimos caracteres da string original.
// Exemplo: 'spring' retorna 'spng'. Entretanto, se o tamanho da string
// for menor que 2, retorne uma string vazia.

public class BothEnds {

    public static String bothEnds(String s) {
        // +++ SUA SOLUÇÃO +++
        return null; // Retorna null temporariamente, você precisará implementar essa lógica
    }

    // Função de teste
    public static void test(BothEndsInterface f, String in, String expected) {
        String out = f.bothEnds(in);

        if (out.equals(expected)) {
            System.out.println("✅ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out);
        } else {
            System.out.println("❌ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out + " e o correto é " + expected);
        }
    }

    public static void main(String[] args) {
        // Testes
        test(BothEnds::bothEnds, "spring", "spng");
        test(BothEnds::bothEnds, "Hello", "Helo");
        test(BothEnds::bothEnds, "a", "");
        test(BothEnds::bothEnds, "xyz", "xyyz");
    }
}

interface BothEndsInterface {
    String bothEnds(String s);
}
