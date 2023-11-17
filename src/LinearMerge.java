// 12. linear_merge
// Dada duas listas ordenadas em ordem crescente, crie e retorne uma lista
// com a combinação das duas listas, também em ordem crescente. Você pode
// modificar as listas recebidas.
// A sua solução deve rodar em tempo linear, ou seja, deve fazer uma
// única passagem em cada uma das listas.

import java.util.ArrayList;
import java.util.List;

public class LinearMerge {

    public static List<String> linearMerge(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).compareTo(list2.get(j)) < 0) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        return result;
    }

    // Função de teste
    public static void test(LinearMergeInterface f, List<String> in1, List<String> in2, List<String> expected) {
        List<String> out = f.linearMerge(in1, in2);

        if (out.equals(expected)) {
            System.out.println("✅ " + f.getClass().getSimpleName() + "(" + in1 + ", " + in2 + ") retornou " + out);
        } else {
            System.out.println("❌ " + f.getClass().getSimpleName() + "(" + in1 + ", " + in2 + ") retornou " + out + " e o correto é " + expected);
        }
    }

    public static void main(String[] args) {
        // Testes
        List<String> input1 = List.of("aa", "xx", "zz");
        List<String> input2 = List.of("bb", "cc");
        List<String> input3 = List.of("aa", "xx");
        List<String> input4 = List.of("bb", "cc", "zz");
        List<String> input5 = List.of("aa", "aa");
        List<String> input6 = List.of("aa", "bb", "bb");

        List<String> expectedOutput1 = List.of("aa", "bb", "cc", "xx", "zz");
        List<String> expectedOutput2 = List.of("aa", "bb", "cc", "xx", "zz");
        List<String> expectedOutput3 = List.of("aa", "aa", "aa", "bb", "bb");

        test(LinearMerge::linearMerge, input1, input2, expectedOutput1);
        test(LinearMerge::linearMerge, input3, input4, expectedOutput2);
        test(LinearMerge::linearMerge, input5, input6, expectedOutput3);
    }
}

interface LinearMergeInterface {
    List<String> linearMerge(List<String> list1, List<String> list2);
}
