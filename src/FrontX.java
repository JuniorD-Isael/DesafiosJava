// 09. front_x
// Dada uma lista de strings, retorne a lista com as strings
// ordenadas, porém agrupe todas as strings que começam com 'x' primeiro.
// Exemplo: ['mix', 'banana' ,'xyz', 'apple', 'xanadu', 'aardvark']
// Irá retornar: ['xanadu', 'xyz', 'aardvark', 'apple', 'banana' ,'mix']
// Dica: Isso pode ser resolvido criando 2 listas e ordenando cada uma
// antes de combiná-las.

import java.util.List;

public class FrontX {

    public static List<String> frontX(List<String> words) {
        // +++ SUA SOLUÇÃO +++
        return null; // Retorna null temporariamente, você precisará implementar essa lógica
    }

    // Função de teste
    public static void test(FrontXInterface f, List<String> in, List<String> expected) {
        List<String> out = f.frontX(in);

        if (out.equals(expected)) {
            System.out.println("✅ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out);
        } else {
            System.out.println("❌ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out + " e o correto é " + expected);
        }
    }

    public static void main(String[] args) {
        // Testes
        List<String> input1 = List.of("bbb", "ccc", "axx", "xzz", "xaa");
        List<String> input2 = List.of("ccc", "bbb", "aaa", "xcc", "xaa");
        List<String> input3 = List.of("mix", "xyz", "apple", "xanadu", "aardvark");

        List<String> expectedOutput1 = List.of("xaa", "xzz", "axx", "bbb", "ccc");
        List<String> expectedOutput2 = List.of("xaa", "xcc", "aaa", "bbb", "ccc");
        List<String> expectedOutput3 = List.of("xanadu", "xyz", "aardvark", "apple", "mix");

        test(FrontX::frontX, input1, expectedOutput1);
        test(FrontX::frontX, input2, expectedOutput2);
        test(FrontX::frontX, input3, expectedOutput3);
    }
}

interface FrontXInterface {
    List<String> frontX(List<String> words);
}
