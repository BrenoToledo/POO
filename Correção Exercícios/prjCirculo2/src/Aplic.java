
import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       Circulo objCirc = new Circulo();;
       double medRaio;
       
       System.out.print("Digite a medida do raio: ");
       medRaio = entrada.nextDouble();
       
       objCirc.setRaio(medRaio);       
       System.out.println("\n\nMedida do raio: " + objCirc.getRaio()); 
       System.out.println("Área: " + objCirc.calcArea());
       System.out.println("Perímetro: " + objCirc.calcPerimetro());
       System.out.println("Diâmetro: " + objCirc.calcDiametro());
    }
}
