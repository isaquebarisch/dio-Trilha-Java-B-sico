import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
       
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero da sua conta: ");
        numero = sc.nextInt();
        
        System.out.println("Insira o número da sua agencia: ");
        agencia = sc.next();

        System.out.println("Digite o seu nome: ");
        nomeCliente = sc.next();

        System.out.println("Digite o valor do seu saldo: ");
        saldo = sc.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "  + saldo + " já está disponível para saque");
        
    }
}
