import java.util.Scanner;

public class SistemaSentinela{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome?:");
        String nome = sc.nextLine();
        System.out.println("Qual o cargo que ocupa?");
        String cargo = sc.nextLine();
        System.out.println("Qual o seu nível de acesso (01 ao 10)?");
        int nivelAcesso = sc.nextInt();
        System.out.println("Qual o Nível de sigilo que você quer acessar(01 ao 10)?");
        int nivelSigilo = sc.nextInt();

        int saldoAutoridadeMenor = nivelSigilo - nivelAcesso;
        int saldoAutoridadeMaior = nivelAcesso - nivelSigilo;


        if (nivelAcesso < 1 || nivelSigilo < 1) {
            System.out.println("Erro: Nível de acesso inválido.");
        } 
        else if (nivelAcesso >= nivelSigilo) {
            System.out.println("Nome: " + nome);
            System.out.println("Cargo: " + cargo);
            System.out.println("Saldo de autoridade: " + saldoAutoridadeMaior);
            System.out.println("ACESSO PERMITIDO");
        } else{
            System.out.println("Nome: " + nome);
            System.out.println("Cargo: " + cargo);
            System.out.println("Saldo de autoridade: " + saldoAutoridadeMenor);
            System.out.println("ACESSO NEGADO");
            System.out.println("ALERTA: Tentativa de acesso indevida detectada!");
        }
    sc.close();
    }
}