import java.util.*;

public class Mimic {
//     14. mimic
//     Neste desafio você vai fazer um gerador de lero-lero.
//     É um programa que lê um arquivo, armazena a relação entre as palavras e então
//     gera um novo texto respeitando essas relações para imitar um escritor de
//     verdade.
//     Para isso você precisa:
//     A. Abrir o arquivo especificado via linha de comando.
//     B. Ler o conteúdo e separar as palavras obtendo uma lista de palavras.
//     C. Criar um dicionário de "imitação".
//     Nesse dicionário a chave será uma palavra e o valor será uma lista contendo
//     as palavras que aparecem no texto após a palavra usada na chave.
//     Por exemplo, suponha um arquivo com o conteúdo: A B C B A
//     O dicionário de imitação deve considerar que: * a chave A contém uma lista
//     com a palavra B * a chave B contém uma lista com as palavras C e A * a chave
//     C contém uma lista com a palavra B
//     Além disso, precisamos considerar que: * a chave '' contém uma lista com a
//     primeira palavra do arquivo * a última palavra do arquivo contém uma lista com
//     a palavra ''.
//     Com o dicionário imitador é bastante simples emitir aleatoriamente texto que
//     imita o original. Imprima uma palavra, depois veja quais palavras podem vir a
//     seguir e pegue uma aleatoriamente como a próxima palavra do texto.
//     Use a string vazia como a primeira palavra do texto para preparar as coisas.
//     Nota: o módulo padrão do python 'random' conta com o random.choice(list),
//     método que escolhe um elemento aleatório de uma lista não vazia.


    public static Map<String, List<String>> mimicDict(String filename) {
        // Retorna o dicionario imitador mapeando cada palavra para a lista de palavras subsequentes.
        // Implemente sua solução aqui
        return null;
    }

    public static void printMimic(Map<String, List<String>> mimicDict, String word) {
        // Dado o dicionario imitador e a palavra inicial, imprime texto de 200 palavras.
        // Implemente sua solução aqui
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Utilização: java Mimic file-to-read");
            System.exit(1);
        }

        Map<String, List<String>> dict = mimicDict(args[0]);
        printMimic(dict, "");
    }
}
