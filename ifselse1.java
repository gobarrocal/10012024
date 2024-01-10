import java.util.*;
public class ifselse1 {
    public static void main(String[] args) {
        boolean sair = false;
        Scanner scnPalavra = new Scanner(System.in);
        String texto = "Doente de amor, procurei remédio na vida noturna\r\n" + //
            "Com a flor da noite em uma boate aqui na zona sul\r\n" + //
            "A dor do amor é com outro amor que a gente cura\r\n" + //
            "Vim curar a dor desse mal de amor na boate azul\r\n" + //
            "\r\n" + //
            "E quando a noite vai se agonizando no clarão da aurora\r\n" + //
            "Os integrantes da vida noturna se foram dormir\r\n" + //
            "E a dama da noite que estava comigo também foi embora\r\n" + //
            "Fecharam-se as portas, sozinho de novo tive que sair\r\n" + //
            "\r\n" + //
            "Sair de que jeito se nem sei o rumo para onde vou\r\n" + //
            "Muito vagamente me lembro que estou\r\n" + //
            "Em uma boate aqui na zona sul\r\n" + //
            "Eu bebi demais e não consigo me lembrar sequer\r\n" + //
            "Qual era o nome daquela mulher\r\n" + //
            "A flor da noite na boate azul\r\n" + //
            "\r\n" + //
            "E quando a noite vai se agonizando no clarão da aurora\r\n" + //
            "Os integrantes da vida noturna se foram dormir\r\n" + //
            "E a dama da noite que estava comigo também foi embora\r\n" + //
            "Fecharam-se as portas, sozinho de novo tive que sair\r\n" + //
            "\r\n" + //
            "Sair de que jeito se nem sei o rumo para onde vou\r\n" + //
            "Muito vagamente me lembro que estou\r\n" + //
            "Em uma boate aqui na zona sul\r\n" + //
            "Eu bebi demais e não consigo me lembrar sequer\r\n" + //
            "Qual era o nome daquela mulher\r\n" + //
            "A flor da noite na boate azul";
        String palavra;
        int posicaoPalavra;
        while (sair == false) {
            System.out.println(texto);
            System.out.println("Digite uma palavra a ser pesquisada no texto acima, depois tecle enter");
            palavra = scnPalavra.nextLine();
            posicaoPalavra = texto.indexOf(palavra);
            if (posicaoPalavra >= 0) {
                System.out.println("A palavra " + palavra + " foi encontrada na posição " + posicaoPalavra + " no texto acima.");
            } else {
                System.out.println("Ops! Palavra não encontrada");
            }
            System.out.println("Digite 'c' para continuar ou 's' para sair, depois tecle enter");
            if (scnPalavra.nextLine().equals("s")) {
                sair = true;
            }
        }
        scnPalavra.close();
    }
}