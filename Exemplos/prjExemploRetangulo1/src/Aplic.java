/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet1; //Definição do ponteiro
        
        objRet1 = new Retangulo(); //Instanciação do
                                   //objeto do classe Retangulo
                                   
        objRet1.setAltura(3.0);
        objRet1.setBase(4.0);
            
        System.out.println("Medida da altura: " + objRet1.getAltura());
        System.out.println("Medida da base: " + objRet1.getBase());
        System.out.println("Área: " + objRet1.calcArea());
        System.out.println("Perímetro: " + objRet1.calcPerimetro());
        System.out.println("Diagonal: " + objRet1.calcDiagonal());
    }    
}
