// 02. both_ends
// Dada uma string s, retorne uma string feita com os dois primeiros
// e os dois últimos caracteres da string original.
// Exemplo: 'spring' retorna 'spng'. Entretanto, se o tamanho da string
// for menor que 2, retorne uma string vazia.

public class BothEnds {

    public static String bothEnds(String s) {
        // +++ SUA SOLUÇÃO +++
        StringBuilder bothEndText = new StringBuilder();
        try {
            bothEndText.append(s.substring(0, 2));
            bothEndText.append(s.substring(s.length()-2, s.length()));
        } catch (IndexOutOfBoundsException e) {}
        return bothEndText.toString();
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
