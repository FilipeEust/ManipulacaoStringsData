
import java.awt.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Locale brasil = new Locale("pt", "BR");

        //Ola, {nome}. Hoje e {dia-da-semana}, BOM DIA.
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();
        LocalDate dataAtual = LocalDate.now();
        String hoje = dataAtual.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        for(Char letra : hoje.toCharArray()){
            for(int i = 0; i < hoje.length(); i++){

            }
        }

        String saudacao= "teste";

        System.out.printf("Ola, %s. Hoje e %s, %s.",nome,hoje,saudacao.toUpperCase());

        //ISO 8601

    }
}