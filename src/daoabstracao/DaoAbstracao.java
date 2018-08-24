package daoabstracao;

/**
 *
 * @author luan
 */
public class DaoAbstracao {
    public static void main(String[] args) {

        Service service = new Service(new Dao());
        
        System.out.println(service.doSomething("Hello"));
        System.out.println(service.doNothing());
    }
    
}
