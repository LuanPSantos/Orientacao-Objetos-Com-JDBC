package daoabstracao;

/**
 *
 * @author luan
 */
public class Service {

    private Dao dao;

    public Service(Dao dao) {
        this.dao = dao;
    }
    
    public String doSomething(String something){
        return dao.doSomething(new SomethingQuery(something));
    }
    
    public String doNothing(){
        return dao.doNothing(new NothingQuery());
    }
}


