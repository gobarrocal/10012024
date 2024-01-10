import java.util.*;
public class ifelse2 {
    public static void main(String[] args) {
        String strUsername = "gabriel";
        String strPassword = "1234";
        Scanner scnInput = new Scanner(System.in);
        System.out.println("Digite o nome de usuário abaixo e tecle enter para confirmar");
        String inUsername = scnInput.nextLine();
        System.out.println("Digite a senha de usuário abaixo e tecle enter para confirmar");
        String inPassword = scnInput.nextLine();
        if (strUsername.equals(inUsername) && strPassword.equals(inPassword)) {
            System.out.println("Acesso ao sistema liberado");
        } else {
            System.out.println("Ops! Usuário ou senha inválido(s)");
        }
        scnInput.close();
    }
}