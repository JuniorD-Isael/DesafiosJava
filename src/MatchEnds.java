// 08. match_ends
// Dada uma lista de strings, retorne a contagem do número de
// strings onde o comprimento da cadeia é 2 ou mais e o primeiro
// e o último caracteres da cadeia são os mesmos.
// PS: Python não possui o operador ++, porém += funciona.

import java.util.List;

public class MatchEnds {

    public static int matchEnds(List<String> words) {
        // +++ SUA SOLUÇÃO +++
        int result = 0;

        for (String word : words) {
            if (word.length() >= 2 && word.charAt(0) == word.charAt(word.length()-1)) {
                result++;
            }
        }

        return result;
    }

    // Função de teste
    public static void test(MatchEndsInterface f, List<String> in, int expected) {
        int out = f.matchEnds(in);

        if (out == expected) {
            System.out.println("✅ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out);
        } else {
            System.out.println("❌ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out + " e o correto é " + expected);
        }
    }

    public static void main(String[] args) {
        // Testes
        List<String> input1 = List.of("aba", "xyz", "aa", "x", "bbb");
        List<String> input2 = List.of("", "x", "xy", "xyx", "xx");
        List<String> input3 = List.of("aaa", "be", "abc", "hello");

        test(MatchEnds::matchEnds, input1, 3);
        test(MatchEnds::matchEnds, input2, 2);
        test(MatchEnds::matchEnds, input3, 1);
    }
}

interface MatchEndsInterface {
    int matchEnds(List<String> words);
}

