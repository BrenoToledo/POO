
import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {               
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,
                                                                  "Ana Beatriz", 
                                                                  "22/10/1997",
                                                                  600.0);
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                     "Joao Mendes",
                                                                     "10/12/1975",
                                                                     10);
        //Instanciação de objetos da classe Departamento
        Departamento dep1 = new Departamento("RH", "Recursos Humanos");
        Departamento dep2 = new Departamento("VD", "Vendas");
        
        funcHor.setCargo("Programador");
        funcHor.setQtdeHorTrab(90);
               
        funcMen.setCargo("Auxiliar Administrativo");
        funcMen.setNumSalMin(2.5);       
        
        funcCom.setCargo("Vendedor");
        funcCom.setSalBase(900);
        funcCom.addVendas(1000); 
        funcCom.addVendas(3000);
        funcCom.addVendas(4000);  
        
        //Estabelecer a ligação(apontamento) entre 1(um) objeto da 
        //classe FuncionarioHorista, FuncionarioMensalista ou
        //FuncionarioComissionado com 1 (um) objeto da classe Departamento
        funcHor.setDepartamento(dep1);
        System.out.println("O funcionário horista " + funcHor.getNome() +
                           " trabalha no departamento " + funcHor.getDepartamento().getNome());
        
        funcMen.setDepartamento(dep1);
        System.out.println("O funcionário horista " + funcMen.getNome() +
                           " trabalha no departamento " + funcMen.getDepartamento().getNome());
  
        funcCom.setDepartamento(dep2);
        System.out.println("O funcionário horista " + funcCom.getNome() +
                           " trabalha no departamento " + funcCom.getDepartamento().getNome());
    
    
        //Estabelecer a ligação(apontamento) entre 1(um) objeto da 
        //classe Departamento com 1..* (um ou mais) objetos da 
        //classe FuncionarioHorista, FuncionarioMensalista ou
        //FuncionarioComissionado 
        dep1.addFuncionario(funcHor);
        dep1.addFuncionario(funcMen);
        dep1.listarFuncionarios();
        
        dep2.addFuncionario(funcCom);
        dep2.listarFuncionarios();
    }
}