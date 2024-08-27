
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
        funcHor.setCargo("Programador");
        funcHor.setQtdeHorTrab(90);
        System.out.println("\n\nRegistro        => " + funcHor.getRegistro());
        System.out.println("Nome            => " + funcHor.getNome());
        System.out.println("Dt.Admissão     => " + funcHor.getDtAdmissao());
        System.out.println("Cargo           => " + funcHor.getCargo());
        System.out.println("Salário Bruto   => " + funcHor.calcSalBruto());
        System.out.println("Desconto        => " + funcHor.calcDesconto());        
        System.out.println("Gratificação    => " + funcHor.calcGratificacao());
        System.out.println("Salário Liquido => " +funcHor.calcSalLiquido());
        
        
        funcMen.setCargo("Auxiliar Administrativo");
        funcMen.setNumSalMin(2.5);
        System.out.println("\n\nRegistro        => " + funcMen.getRegistro());
        System.out.println("Nome            => " + funcMen.getNome());
        System.out.println("Dt.Admissão     => " + funcMen.getDtAdmissao());
        System.out.println("Cargo           => " + funcMen.getCargo());
        System.out.println("Salario Bruto   => " + funcMen.calcSalBruto());
        System.out.println("Desconto        => " + funcMen.calcDesconto());
        System.out.println("Salario Liquido => " + funcMen.calcSalLiquido());
   
        
        funcCom.setCargo("Vendedor");
        funcCom.setSalBase(900);
        funcCom.addVendas(1000); 
        funcCom.addVendas(3000);
        funcCom.addVendas(4000);          
        System.out.println("\n\nRegistro        => " + funcCom.getRegistro());
        System.out.println("Nome            => " + funcCom.getNome());
        System.out.println("Data admissão   => " + funcCom.getDtAdmissao());
        System.out.println("Cargo           => " + funcCom.getCargo());       
        System.out.println("Salario Base    => " + funcCom.getSalBase());
        System.out.println("Total das Vendas=> " + funcCom.getTotalVendas());
        System.out.println("Comissao        => " + funcCom.getTaxaComissao() + "%");
        System.out.println("Salario Bruto   => " + funcCom.calcSalBruto());
        System.out.println("Desconto        => " + funcCom.calcDesconto());
        System.out.println("Gratificacao    => " + funcCom.calcGratificacao());
        System.out.println("Salario Liquido => " + funcCom.calcSalLiquido());
    }
}
