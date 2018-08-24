package daoabstracao;

/**
 *
 * @author luan
 */
public class NothingQuery extends AbstractDao {

    @Override
    public Object run(Object a) {
        System.out.println("Realizando busca com a " + a);
        return "Resultado: Varios nadas de retorno kkkkkk\n=====";
    }
    
}
