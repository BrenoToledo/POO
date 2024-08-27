package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras; 
    
    public Pessoa(String n, int anoIns){
        nome = n;
        anoInscricao = anoIns;       
    }
    
    abstract public double calcBonus(int anoAtual);
    
    public void addCompras(double val){
        totalCompras += val; //totalCompras = totalCompras + val
    }
    
    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }  
}
