// 04. mix_up
// Dadas as strings a e b, retorne uma string com a e b separados
// por um espaço '<a> <b>', além disso, troque os 2 primeiros caracteres
// das duas strings.
// Exemplo:
//    'mix', 'pod' -> 'pox mid'
//    'dog, 'dinner' -> 'dig donner'
// Assuma que a e b têm tamanho 2 ou maior.

public class MixUp {

    public static String mixUp(String a, String b) {
        // +++ SUA SOLUÇÃO +++
        return null; // Retorna null temporariamente, você precisará implementar essa lógica
    }

    // Função de teste
    public static void test(MixUpInterface f, String[] in, String expected) {
        String out = f.mixUp(in[0], in[1]);

        if (out.equals(expected)) {
            System.out.println("✅ " + f.getClass().getSimpleName() + "(" + in[0] + ", " + in[1] + ") retornou " + out);
        } else {
            System.out.println("❌ " + f.getClass().getSimpleName() + "(" + in[0] + ", " + in[1] + ") retornou " + out + " e o correto é " + expected);
        }
    }

    public static void main(String[] args) {
        // Testes
        String[][] inputs = {
            {"mix", "pod"},
            {"dog", "dinner"},
            {"gnash", "sport"},
            {"pezzy", "firm"}
        };

        String[] expectedOutputs = {
            "pox mid",
            "dig donner",
            "spash gnort",
            "fizzy perm"
        };

        for (int i = 0; i < inputs.length; i++) {
            test(MixUp::mixUp, inputs[i], expectedOutputs[i]);
        }
    }
}

interface MixUpInterface {
    String mixUp(String a, String b);
}
