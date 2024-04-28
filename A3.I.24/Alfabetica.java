import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Alfabetica {
        
        public double alfabetica() throws FileNotFoundException{
        File arquivo = new File("C:\\Users\\pedro\\Downloads\\fifa_countries_audience.csv");
        Scanner scanner = new Scanner(arquivo);
        scanner.useDelimiter("\n");
        scanner.next();
        ArrayList<String> nomes = new ArrayList<String>();
        while(scanner.hasNext())
           nomes.add(scanner.next());
           Collections.sort(nomes);
           System.out.println("Países ordenados por ordem alfabetica:");
           for(String nome : nomes) System.out.printf("Países: %s\n", nome);
           scanner.close();
        return 0; 
    

        }
}

