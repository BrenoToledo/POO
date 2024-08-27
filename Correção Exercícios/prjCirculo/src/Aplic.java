/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
       Circulo objCirc1, objCirc2;
       
       objCirc1 = new Circulo();
       objCirc2 = new Circulo();
       
       objCirc1.setRaio(1.0);
       objCirc2.setRaio(3.0);
       
       System.out.println("Objeto Circulo 1\n");
       System.out.println("Medida do raio: " + objCirc1.getRaio()); 
       System.out.println("Área: " + objCirc1.calcArea());
       System.out.println("Perímetro: " + objCirc1.calcPerimetro());
       System.out.println("Diâmetro: " + objCirc1.calcDiametro());
       
       System.out.println("\nObjeto Circulo 2\n");
       System.out.println("Medida do raio: " + objCirc2.getRaio()); 
       System.out.println("Área: " + objCirc2.calcArea());
       System.out.println("Perímetro: " + objCirc2.calcPerimetro());
       System.out.println("Diâmetro: " + objCirc2.calcDiametro());  
    }
    
}
