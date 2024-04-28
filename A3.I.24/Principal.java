import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Alfabetica alfabetica = new Alfabetica();
        List<Audiencia> paises = new ArrayList<>();
        String opcao, finalizar;

        do {

        System.out.println("*FIFA, COPA DO MUNDO 2010*");
        System.out.println("Selecione qual opção deseja para a visualição dos países referentes ao ano de 2010:" + "\n1: Ordenados por ordem alfabetica" + "\n2: Ordenados por audiência TV");
        opcao = scanner.next();

        switch (opcao){
            case "1":
            System.out.println(alfabetica.alfabetica());
            break;
            case "2":
            Audiencia.sortAudiencia(paises);
            break;
            default:System.out.println("Digito invalido"); 
        }

        System.out.println("Se deseja finalizar digite '.', se deseja continuar digite qualquer tecla.");
        finalizar = scanner.next();

        if (finalizar.equals("."))

        break;

    }while(true);
    System.out.println("Programa ecerrado");

    scanner.close();
    }

}
