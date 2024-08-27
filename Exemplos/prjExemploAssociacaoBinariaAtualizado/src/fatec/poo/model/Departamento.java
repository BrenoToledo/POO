
package fatec.poo.model;

/**
 *
 * @author Dimas
 */

public class Departamento {
    private String sigla;
    private String nome;   
    private Funcionario[] funcionarios; //matriz de ponteiros para objetos
                                        //implementando a multiplicidade 1..*
    private int numFunc; //indice da matriz
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;   
        funcionarios = new Funcionario[5];
        numFunc = 0; //indica a primeira posição da matriz de objetos
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    //tem como parâmetro de entrada o endereço de 
    //um objeto da classe FuncionarioHorista,FuncionarioMensalista
    //ou FuncionarioComissionado
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    
    public void listarFuncionarios(){
        System.out.println("\n\nSigla: " + sigla); 
        System.out.println("Nome: " + nome);
        System.out.println("Qtde. de Funcionários: " + numFunc);
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        for(int x = 0; x < numFunc; x++){
            System.out.print(funcionarios[x].getRegistro() + "\t\t");
            System.out.print(funcionarios[x].getNome() + "\t\t");
            System.out.println(funcionarios[x].getCargo());
        }
    }   
}
