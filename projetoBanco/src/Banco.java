import java.sql.SQLOutput;
import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        String tipoConta = "Corrente";
        int saldo = 2500;

        System.out.println("Boas Vindas, ao banco X!");
        System.out.println("Por favor, informe o seu nome completo sem abreviações:");
        String nome = scanner.nextLine();
        System.out.println("Qual é o seu CPF?");
        long cpf = scanner.nextLong();
        System.out.println("---");
        while(true){
            System.out.println("******************************");
            System.out.println("Dados iniciais do cliente:");
            System.out.println("");
            System.out.println("Nome:               "+nome);
            System.out.println("Tipo conta:         "+tipoConta);
            System.out.println("Saldo:              "+saldo);
            System.out.println("CPF:                "+cpf);
            System.out.println("******************************");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Operações");
            System.out.println("");
            System.out.println("1- Consultar Valor");
            System.out.println("2- Receber Valor");
            System.out.println("3- Transferir Valor");
            System.out.println("4. Sair do aplicativo");
            System.out.println("");
            System.out.println("Digite a opção desejada:");
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atual é "+saldo);
            }
            if (opcao == 2){
                System.out.println("Quanto valor irá depositar?");
                double deposito = scanner.nextDouble();
                saldo+=deposito;
            }
            if (opcao == 3){
                System.out.println("Qual valor será transferido?");
                double transferir = scanner.nextDouble();
                if (transferir > saldo){
                    System.out.println("Você não tem esse valor na conta bancaria!");
                }else if (transferir <= saldo){
                    saldo-=transferir;
                }

            }
            if (opcao == 4){
                System.out.println("Saindo do aplicativo!");
                break;
            }
            if (opcao>4 || opcao<1){
                System.out.println("Há somente opções entre 1 a 4");
            }
        }
    }
}
