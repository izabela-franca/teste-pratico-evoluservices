package ex2_isPalindrome;

/*
2- Um palíndromo é uma palavra que pode ser lida da esquerda para a direita e vice-versa.
Escreva uma função que verifica se a palavra dada é um palíndromo.
Caracteres em caixa alta devem ser ignorados.
Por exemplo, isPalindrome("Deleveled") deve retornar True, já que é um palíndromo por ser possível ser lido nos dois sentidos.
Utilize o esqueleto a seguir para implementar seu código:
public boolean isPalindrome(String s) { // Seu código}
 */

public class isPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Deleveled"));
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        return str.toLowerCase().equals(sb.toString().toLowerCase());
    }




}
