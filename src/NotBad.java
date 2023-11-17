// 06. not_bad
// Dada uma string, encontre a primeira aparição das
// substrings 'not' e 'bad'. Se 'bad' aparecer depois
// de 'not', troque todo o trecho entre 'not' e 'bad'
// por 'good' e retorne a string resultante.
// Exemplo: 'The dinner is not that bad!' retorna 'The dinner is good!'

public class NotBad {

    public static String notBad(String s) {
        // +++ SUA SOLUÇÃO +++
        return null; // Retorna null temporariamente, você precisará implementar essa lógica
    }

    // Função de teste
    public static void test(NotBadInterface f, String in, String expected) {
        String out = f.notBad(in);

        if (out.equals(expected)) {
            System.out.println("✅ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out);
        } else {
            System.out.println("❌ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out + " e o correto é " + expected);
        }
    }

    public static void main(String[] args) {
        // Testes
        test(NotBad::notBad, "This movie is not so bad", "This movie is good");
        test(NotBad::notBad, "This dinner is not that bad!", "This dinner is good!");
        test(NotBad::notBad, "This tea is not hot", "This tea is not hot");
        test(NotBad::notBad, "It's bad yet not", "It's bad yet not");
    }
}

interface NotBadInterface {
    String notBad(String s);
}
