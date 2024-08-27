

/**
 *
 * @author Dimas
 */
public class Circulo {
    private double raio;
    private String unidadeMedida;

    //método do construtor
    public Circulo(String unidMed) {
        unidadeMedida = unidMed;
    }    

    public double getRaio() {
        return raio;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    
    public void setRaio(double raio) {
        this.raio = raio;
    }   
    
    public double calcArea(){
        return(Math.PI * Math.pow(raio,2));
    }
    public double calcPerimetro(){
        return(2 * Math.PI * raio);
    }
    public double calcDiametro(){
        return(2 * raio);
    }    
}
