
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        Aluno objAlu = new Aluno(1010,"Carlos Silveira","15/03/1978");
								 
	
        Professor objProf = new Professor(1234,"Pedro Soares","27/02/1965");
        
           
        objAlu.setMensalidade(1500);
        System.out.println("Registro escolar: " + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data de Nascimento: " + objAlu.getDataNascimento());
        System.out.println("Mensalidade: " + objAlu.getMensalidade());						 
    
        objProf.setSalario(2780);
        System.out.println("\n\nRegistro funcional: " + objProf.getRegFuncional());
        System.out.println("Nome: " + objProf.getNome());
        System.out.println("Data de Nascimento: " + objProf.getDataNascimento());
        System.out.println("Salário: " + objProf.getSalario());	
    }
}
