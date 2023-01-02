import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        secondary sc = new secondary();


        System.out.print("Quantidade de cadastro(s).: ");
        sc.qtdRegistros = Integer.parseInt(input.nextLine());

        System.out.println();
        System.out.print("===================================\n");

        for (int i=0; i<sc.qtdRegistros; i++){
            System.out.print("\nUsuário "+ (i+1)+ "\n");
            System.out.print("\tNome.: ");
            sc.nome = input.nextLine();
            System.out.print("\tAno de nascimento.: ");
            sc.anoNsc = Integer.parseInt(input.nextLine());
            sc.calcSituacao();
        }

        System.out.println();
        System.out.print("===================================\n");

        System.out.println();
        sc.proibidoVoto();

        System.out.println();
        sc.facultativoVoto();

        System.out.println();
        sc.obrigatorioVoto();

        System.out.println();
        sc.invalidoVoto();

        input.close();

    }
}
