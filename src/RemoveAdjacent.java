// 11. remove_adjacent
// Dada uma lista de números, retorne uma lista onde todos elementos
// adjacentes iguais são reduzidos a um único elemento.
// Exemplo: [1, 2, 2, 3]
// Irá retornar: [1, 2, 3]

import java.util.ArrayList;
import java.util.List;

public class RemoveAdjacent {

    public static List<Integer> removeAdjacent(List<Integer> nums) {
        if (nums.isEmpty()) {
            return nums;
        }

        List<Integer> result = new ArrayList<>();
        result.add(nums.get(0));

        for (int i = 1; i < nums.size(); i++) {
            int current = nums.get(i);
            int previous = nums.get(i - 1);

            if (current != previous) {
                result.add(current);
            }
        }

        return result;
    }

    // Função de teste
    public static void test(RemoveAdjacentInterface f, List<Integer> in, List<Integer> expected) {
        List<Integer> out = f.removeAdjacent(in);

        if (out.equals(expected)) {
            System.out.println("✅ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out);
        } else {
            System.out.println("❌ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out + " e o correto é " + expected);
        }
    }

    public static void main(String[] args) {
        // Testes
        List<Integer> input1 = List.of(1, 2, 2, 3);
        List<Integer> input2 = List.of(2, 2, 3, 3, 3);
        List<Integer> input3 = List.of();
        List<Integer> input4 = List.of(2, 2, 3, 3, 3, 2, 2);

        List<Integer> expectedOutput1 = List.of(1, 2, 3);
        List<Integer> expectedOutput2 = List.of(2, 3);
        List<Integer> expectedOutput3 = List.of();
        List<Integer> expectedOutput4 = List.of(2, 3, 2);

        test(RemoveAdjacent::removeAdjacent, input1, expectedOutput1);
        test(RemoveAdjacent::removeAdjacent, input2, expectedOutput2);
        test(RemoveAdjacent::removeAdjacent, input3, expectedOutput3);
        test(RemoveAdjacent::removeAdjacent, input4, expectedOutput4);
    }
}

interface RemoveAdjacentInterface {
    List<Integer> removeAdjacent(List<Integer> nums);
}
