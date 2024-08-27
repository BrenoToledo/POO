/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet1; //Definição do ponteiro
        Retangulo objRet2;
        
        objRet1 = new Retangulo(); //Instanciação do
                                   //objeto do classe Retangulo
           
        objRet2 = new Retangulo();
        
        objRet1.setAltura(5.0);
        objRet1.setBase(8.0);
        
        objRet2.setAltura(2.5);
        objRet2.setBase(6.5);
            
        System.out.println("Objeto Retangulo 1\n");
        System.out.println("Medida da altura: " + objRet1.getAltura());
        System.out.println("Medida da base: " + objRet1.getBase());
        System.out.println("Área: " + objRet1.calcArea());
        System.out.println("Perímetro: " + objRet1.calcPerimetro());
        System.out.println("Diagonal: " + objRet1.calcDiagonal());
    
        System.out.println("\nObjeto Retangulo 2\n");
        System.out.println("Medida da altura: " + objRet2.getAltura());
        System.out.println("Medida da base: " + objRet2.getBase());
        System.out.println("Área: " + objRet2.calcArea());
        System.out.println("Perímetro: " + objRet2.calcPerimetro());
        System.out.println("Diagonal: " + objRet2.calcDiagonal());
    }    
}
