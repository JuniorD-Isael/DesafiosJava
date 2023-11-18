// 10. sort_last
// Dada uma lista de tuplas não vazias, retorne uma lista ordenada em ordem
// crescente com base no último elemento de cada tupla.
// Exemplo: [(1, 7), (1, 3), (3, 4, 5), (2, 2)]
// Irá retornar: [(2, 2), (1, 3), (3, 4, 5), (1, 7)]
// Dica: Use uma função key personalizada para extrair o último elemento de cada tupla.

import java.util.ArrayList;
import java.util.List;

public class SortLast {

    public static List<List<Integer>> sortLast(List<List<Integer>> tuples) {
        // +++ SUA SOLUÇÃO +++
        List<List<Integer>> copyTuples = new ArrayList<>(tuples);

        copyTuples.sort((a,b) -> {
            return Integer.compare(a.get(a.size()-1), b.get(b.size()-1));
        });

        return copyTuples;
    }

    // Função de teste
    public static void test(SortLastInterface f, List<List<Integer>> in, List<List<Integer>> expected) {
        List<List<Integer>> out = f.sortLast(in);

        if (out.equals(expected)) {
            System.out.println("✅ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out);
        } else {
            System.out.println("❌ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out + " e o correto é " + expected);
        }
    }

    public static void main(String[] args) {
        // Testes
        List<List<Integer>> input1 = List.of(List.of(1, 3), List.of(3, 2), List.of(2, 1));
        List<List<Integer>> input2 = List.of(List.of(2, 3), List.of(1, 2), List.of(3, 1));
        List<List<Integer>> input3 = List.of(List.of(1, 7), List.of(1, 3), List.of(3, 4, 5), List.of(2, 2));

        List<List<Integer>> expectedOutput1 = List.of(List.of(2, 1), List.of(3, 2), List.of(1, 3));
        List<List<Integer>> expectedOutput2 = List.of(List.of(3, 1), List.of(1, 2), List.of(2, 3));
        List<List<Integer>> expectedOutput3 = List.of(List.of(2, 2), List.of(1, 3), List.of(3, 4, 5), List.of(1, 7));

        test(SortLast::sortLast, input1, expectedOutput1);
        test(SortLast::sortLast, input2, expectedOutput2);
        test(SortLast::sortLast, input3, expectedOutput3);
    }
}

interface SortLastInterface {
    List<List<Integer>> sortLast(List<List<Integer>> tuples);
}
