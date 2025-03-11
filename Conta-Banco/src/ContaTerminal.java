
import java.util.Scanner;


public class ContaTerminal {
    //TODO: Conhecer e importar a classe Scanner
    //Exibir as mensagens para o nosso usuário
    //Obter pela Scanner os valores digitados no terminal
    //Exibir a mensagem

    public static void main(String[] args) {
        
        System.out.println("Por favor, digite o número da Conta: ");
        Scanner contaBancaria = new Scanner(System.in);
        int numeroConta = contaBancaria.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agenciaConta = contaBancaria.next();

        System.out.println("Por favor, digite seu nome: ");
        String nomeConta = contaBancaria.next();

        System.out.println("Por favor, digite seu saldo");
        double saldoConta = contaBancaria.nextDouble();
        contaBancaria.close();

        System.out.println("Olá "+ nomeConta + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agenciaConta +", conta "+
        numeroConta + " e seu saldo "+ saldoConta + " já está disponível para saque");


    }


}
