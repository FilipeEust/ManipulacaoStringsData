
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
        String hojenovo = hoje.replace("-feira",",");
        String saudacao= "Salve";

        System.out.printf("Ola, %s. Hoje é %s %s.",nome,hojenovo,saudacao.toUpperCase());
        //ISO 8601

    }
}