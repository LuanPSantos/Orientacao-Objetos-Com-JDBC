package daoabstracao;

/**
 *
 * @author luan
 */
public class Dao {

    String doSomething(SomethingQuery dao) {
        return (String) dao.execute();
    }
    
    String doNothing(NothingQuery dao) {
        return (String) dao.execute();
    }
    
}
