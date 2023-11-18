// 03. fix_start
// Dada uma string s, retorne uma string onde
// todas as ocorrências do primeiro caracter de s
// foram substituídas por '*', exceto a primeira.
// Exemplo: 'babble' retorna 'ba**le'
// Assuma que a string tem tamanho 1 ou maior.
// Dica: s.replace(stra, strb) retorna uma versão da string s
// onde todas as instâncias de stra foram substituídas por strb.

public class FixStart {

    public static String fixStart(String s) {
        // +++ SUA SOLUÇÃO +++
        char fristChar = s.charAt(0);
        StringBuilder newFixString = new StringBuilder(s.replaceAll(String.valueOf(fristChar), "*"));
        newFixString.setCharAt(0, fristChar);

        return newFixString.toString();
    }

    // Função de teste
    public static void test(FixStartInterface f, String in, String expected) {
        String out = f.fixStart(in);

        if (out.equals(expected)) {
            System.out.println("✅ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out);
        } else {
            System.out.println("❌ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out + " e o correto é " + expected);
        }
    }

    public static void main(String[] args) {
        // Testes
        test(FixStart::fixStart, "babble", "ba**le");
        test(FixStart::fixStart, "aardvark", "a*rdv*rk");
        test(FixStart::fixStart, "google", "goo*le");
        test(FixStart::fixStart, "donut", "donut");
    }
}

interface FixStartInterface {
    String fixStart(String s);
}
