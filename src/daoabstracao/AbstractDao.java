package daoabstracao;

/**
 *
 * @author luan
 */
public abstract class AbstractDao {

    public Object execute(){
        System.out.println("\nCria conexão de tals\n");
        String conexao = "Conexão";
        
        String result = (String) run(conexao);
        
        System.out.println("\nFecha conexão de tals\n");
        
        return result;
    }
    
    public abstract Object run(Object a);
}
