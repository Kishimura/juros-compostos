import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        for (int i = 1; i <= periodo; i++){
            valorFinal += valorFinal * taxaJuros;
        }

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("####0.00");



        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}