// 05. verbing
// Dada uma string, se seu tamanho for pelo menos 3,
// adicione 'ing' no seu fim, a menos que a string
// já termine com 'ing', nesse caso adicione 'ly'.
// Se o tamanho da string for menor que 3, não altere nada.
// Retorne o resultado da string.

public class Verbing {

    public static String verbing(String s) {
        // +++ SUA SOLUÇÃO +++
        return null; // Retorna null temporariamente, você precisará implementar essa lógica
    }

    // Função de teste
    public static void test(VerbingInterface f, String in, String expected) {
        String out = f.verbing(in);

        if (out.equals(expected)) {
            System.out.println("✅ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out);
        } else {
            System.out.println("❌ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out + " e o correto é " + expected);
        }
    }

    public static void main(String[] args) {
        // Testes
        test(Verbing::verbing, "hail", "hailing");
        test(Verbing::verbing, "swiming", "swimingly");
        test(Verbing::verbing, "do", "do");
    }
}

interface VerbingInterface {
    String verbing(String s);
}

