
import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int opcao;
       
       PreparaConexao con=null; 
       
       con = new PreparaConexao("Dimas","A12345678a");//usuario e senha
       con.setDriver("oracle.jdbc.driver.OracleDriver");
       con.setConnectionString("jdbc:oracle:thin:@192.168.1.6:1521:xe");
              
       do{
           System.out.println("\n\nDigite <1>Fazer conexão com o SGBD Oracle");
           System.out.println("Digite <2>Encerrar conexão com o SGBD Oracle");
           
           System.out.print("\tOpção: ");
           opcao=entrada.nextInt();
           
           if (opcao == 1){
               System.out.print("\n");
               con.abrirConexao();
           }else
              if (opcao == 2){ 
                  System.out.print("\n");
                  con.fecharConexao();
              }
       }while (opcao < 2);   
    }     
}
