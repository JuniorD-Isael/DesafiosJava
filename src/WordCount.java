import java.util.*;

public class WordCount {

    // Este desafio é um programa que conta palavras de um arquivo de duas formas diferentes.
    // A. Lista todas as palavras por ordem alfabética indicando suas ocorrências.
    // Ou seja...
    // Dado um arquivo letras.txt contendo as palavras: A a C c c B b b B
    // Quando você executa o programa: java WordCount --count letras.txt
    // Ele deve imprimir todas as palavras em ordem alfabética seguidas
    // do número de ocorrências.
    // Por exemplo:
    // $ java WordCount --count letras.txt
    // a 2
    // b 4
    // c 3
    // B. Lista as 20 palavras mais frequêntes indicando suas ocorrências.
    // Ou seja...
    // Dado um arquivo letras.txt contendo as palavras: A a C c c B b b B
    // Quando você executa o programa: java WordCount --topcount letras.txt
    // Ele deve imprimir as 20 palavras mais frequêntes seguidas
    // do número de ocorrências, em ordem crescente de ocorrências.
    // Por exemplo:
    // $ java WordCount --topcount letras.txt
    // b 4
    // c 3
    // a 2
    // Abaixo já existe um esqueleto do programa para você preencher.
    // Você encontrará a função main() chama as funções printWords() e printTop()
    // de acordo com os parâmetro --count ou --topcount.
    // Seu trabalho é implementar as funções printWords() e depois printTop().
    // Dicas: * Armazene todas as palavras em caixa baixa, assim, as palavras 'A' e
    // 'a' contam como a mesma palavra. * Use str.split() (sem parêmatros) para fazer
    // separar as palavras. * Não construa todo o programade uma vez. Faça por partes
    // executando e conferindo cada etapa do seu progresso.

    public static void printWords(String filename) {
        // Implemente a função printWords
    }

    public static void printTop(String filename) {
        // Implemente a função printTop
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Utilização: java WordCount {--count | --topcount} file");
            System.exit(1);
        }

        String option = args[1];
        String filename = args[2];
        if (option.equals("--count")) {
            printWords(filename);
        } else if (option.equals("--topcount")) {
            printTop(filename);
        } else {
            System.out.println("unknown option: " + option);
            System.exit(1);
        }
    }
}
