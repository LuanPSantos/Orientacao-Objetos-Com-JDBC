package daoabstracao;

/**
 *
 * @author luan
 */
public class SomethingQuery extends AbstractDao {
    
    private String something;
    
    public SomethingQuery(String some){
        this.something = some;
    }

    @Override
    public Object run(Object a) {
        System.out.println("Realizando busca com a " + a);
        return "Resultado: " + something + " :D \n=====";
    }
}
