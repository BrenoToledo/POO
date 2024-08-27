package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    private Departamento departamento; //ponteiro
                                       //representa a multiplicidade 1
    
    public Funcionario(int r, String n, String dtAdm) {
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String c) {
        cargo = c;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
                                  
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
    
    
    //Método abstrato
    //Apresenta apenas a assinatura
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
}
