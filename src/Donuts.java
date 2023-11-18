// 01. donuts
// Dado um contador inteiro do número de donuts, retorne uma string
// com o formato 'Number of donuts: <count>' onde <count> é o número
// recebido. Entretanto, se o contador for 10 ou mais, use a palavra 'many'
// ao invés do contador.
// Exemplo: donuts(5) retorna 'Number of donuts: 5'
// e donuts(23) retorna 'Number of donuts: many'

public class Donuts {

    public static String donuts(int count) {
        // +++ SUA SOLUÇÃO +++
        StringBuilder donutsMsg = new StringBuilder();
        if (count >= 10) {
            donutsMsg.append("Number of donuts: many");
        }else{
            donutsMsg.append(String.format("Number of donuts: %d", count));
        }
        return donutsMsg.toString();
    }

    // Função de teste
    public static void test(DonutsInterface f, int in, String expected) {
        String out = f.donuts(in);

        if (out.equals(expected)) {
            System.out.println("✅ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out);
        } else {
            System.out.println("❌ " + f.getClass().getSimpleName() + "(" + in + ") retornou " + out + " e o correto é " + expected);
        }
    }

    public static void main(String[] args) {
        // Testes
        test(Donuts::donuts, 4, "Number of donuts: 4");
        test(Donuts::donuts, 9, "Number of donuts: 9");
        test(Donuts::donuts, 10, "Number of donuts: many");
        test(Donuts::donuts, 99, "Number of donuts: many");
    }
}

interface DonutsInterface {
    String donuts(int count);
}
