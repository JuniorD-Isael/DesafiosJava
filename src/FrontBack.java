// 07. front_back
// Considere dividir uma string em duas metades.
// Caso o comprimento seja par, a metade da frente e de trás tem o mesmo tamanho.
// Caso o comprimento seja ímpar, o caractere extra fica na metade da frente.
// Exemplo: 'abcde', a metade da frente é 'abc' e a de trás é 'de'.
// Finalmente, dadas duas strings a e b, retorne uma string na forma:
// a-frente + b-frente + a-trás + b-trás

public class FrontBack {

    public static String frontBack(String a, String b) {
        // +++ SUA SOLUÇÃO +++
        return null; // Retorna null temporariamente, você precisará implementar essa lógica
    }

    // Função de teste
    public static void test(FrontBackInterface f, String[] in, String expected) {
        String out = f.frontBack(in[0], in[1]);

        if (out.equals(expected)) {
            System.out.println("✅ " + f.getClass().getSimpleName() + "(" + in[0] + ", " + in[1] + ") retornou " + out);
        } else {
            System.out.println("❌ " + f.getClass().getSimpleName() + "(" + in[0] + ", " + in[1] + ") retornou " + out + " e o correto é " + expected);
        }
    }

    public static void main(String[] args) {
        // Testes
        String[][] inputs = {
            {"abcd", "xy"},
            {"abcde", "xyz"},
            {"Kitten", "Donut"}
        };

        String[] expectedOutputs = {
            "abxcdy",
            "abcxydez",
            "KitDontenut"
        };

        for (int i = 0; i < inputs.length; i++) {
            test(FrontBack::frontBack, inputs[i], expectedOutputs[i]);
        }
    }
}

interface FrontBackInterface {
    String frontBack(String a, String b);
}
