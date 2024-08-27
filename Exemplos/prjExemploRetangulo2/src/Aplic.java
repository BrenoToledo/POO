
import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet = new Retangulo();
        Scanner entrada = new Scanner(System.in);
        double medAlt, medBase;
        
        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println("Medida da altura: " + objRet.getAltura());
        System.out.println("Medida da base: " + objRet.getBase());
        System.out.println("Área: " + objRet.calcArea());
        System.out.println("Perímetro: " + objRet.calcPerimetro());
        System.out.println("Diagonal: " + objRet.calcDiagonal());
    }    
}
