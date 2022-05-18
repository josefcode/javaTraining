import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        // var for memory ram

        String nome, sobrenome;
        int dia, mes, ano;
        char inicialNome, inicialSobrenome;


       // It type of class
        Scanner read = new Scanner(System.in);

        System.out.println("qual seu nome: ");

        nome = read.nextLine();
        System.out.println("qual seu sobrenome: ");
        sobrenome= read.nextLine();
        System.out.println("qual seu data de nacimento: ");

        dia = read.nextInt();
        mes = read.nextInt();
        ano = read.nextInt();


        System.out.println(nome + " " + sobrenome + " " + dia + " / " + mes + " / " + ano);

        inicialNome = nome.charAt(0);
        inicialSobrenome = sobrenome.charAt(0);

        System.out.println(inicialNome + " " + inicialSobrenome);
        //for good use is cleaning the Scanner at the end of use

        read.close();
    }


}
