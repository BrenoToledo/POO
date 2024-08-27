package fatec.poo.model;

/**
 *
 * @author Fatec
 */
public class Professor extends Pessoa{
    private int regFuncional;
    private double salario;
    
    public Professor(int rf, String n, String dtn){
        super(n, dtn); //chamada do método construtor da superclasse Pessoa
        regFuncional = rf;
    }
    
    public void setSalario(double s){
        salario = s;
    }
    
    public int getRegFuncional(){
        return(regFuncional);
    }
    
    public double getSalario(){
        return(salario);
    }
}
