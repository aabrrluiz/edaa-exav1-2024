import java.io.BufferedReader;  
import java.io.File;  
import java.io.FileReader;  
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  

public class Audiencia {  

    private String pais;  
    private String confeederacao;  
    private Double participacaopartular;  
    private Double audienciaTv;  
    private Double parcelaPonderaPib;  

    private List<Audiencia> paises = new ArrayList<>();  

    public Audiencia() {}  

    public Audiencia(String pais, String confeederacao, Double participacaopartular, Double audienciaTv,
            Double parcelaPonderaPib) {  
        this.pais = pais;  
        this.confeederacao = confeederacao;  
        this.participacaopartular = participacaopartular;  
        this.audienciaTv = audienciaTv;  
        this.parcelaPonderaPib = parcelaPonderaPib;  
    }  

    public String getCountry() {  
        return pais;
    }

    public void setCountry(String pais) {  
        this.pais = pais;
    }

    public String getconfeederacao() {  
        return confeederacao;
    }

    public void setconfeederacao(String confeederacao) {  
        this.confeederacao = confeederacao;
    }

    public Double getparticipacaopartular() {  
        return participacaopartular;
    }

    public void setparticipacaopartular(Double participacaopartular) { 
        this.participacaopartular = participacaopartular;
    }

    public Double getaudienciaTv() { 
        return audienciaTv;
    }

    public void setaudienciaTv(Double audienciaTv) {
        this.audienciaTv = audienciaTv;
    }

    public Double getparcelaPonderaPib() {
        return parcelaPonderaPib;
    }

    public void setparcelaPonderaPib(Double parcelaPonderaPib) {
        this.parcelaPonderaPib = parcelaPonderaPib;
    }

    public List<Audiencia> getPais() {
        return paises;
    }

    public static void file(List<Audiencia> paises) {
        try {
            File file = new File("C:\\Users\\pedro\\Downloads\\fifa_countries_audience.csv");
            BufferedReader br = new BufferedReader(new FileReader(file));
            br.readLine();  
            String line = br.readLine();  
            while (line != null) {  
                String[] dados = line.split(","); 
                String pais = dados[0];  
                String confe = dados[1]; 
                double part = Double.parseDouble(dados[2]);  
                double tv = Double.parseDouble(dados[3]);  
                double pib = Double.parseDouble(dados[4]);  

                paises.add(new Audiencia(pais, confe, part, tv, pib));  
                line = br.readLine();  
            }
            br.close();  
        } catch (Exception e) { 
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return pais + ", " + confeederacao + ", " + participacaopartular
                + ", " + audienciaTv + ", " + parcelaPonderaPib;
    }

    public static void sortAudiencia(List<Audiencia> list) { 
        file(list);
        Collections.sort(list, (AudienceOne, AudienceTwo) -> AudienceTwo.getaudienciaTv()
                .compareTo(AudienceOne.getaudienciaTv()));
        list(list);
    }

    public static void list(List<Audiencia> list) {
        for (Audiencia f : list) {
            System.out.println(f);
        }
    }

}  
