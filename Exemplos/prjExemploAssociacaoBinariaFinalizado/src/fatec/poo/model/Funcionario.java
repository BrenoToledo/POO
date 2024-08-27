package fatec.poo.model;

/**
 *
 * @author dimas
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    private Departamento departamento; //multiplicidade 1
    private Projeto projeto; //ponteiro - multiplicidade 1
    
    public Funcionario(int registro, String nome, String dtAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }
    
    //Definição de um método abstrato
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
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

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //retorna o endereço de um objeto
    //da classe Departamento
    public Departamento getDepartamento() {
        return departamento;
    }

    //tem como parâmetro de entrada o endereço
    //de um objeto da classe Departamento
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    //retorna o endereço de um objeto
    //da classe Projeto
    public Projeto getProjeto() {
        return projeto;
    }

    //tem como parâmetro de entrada o endereço
    //de um objeto da classe Projeto
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}
