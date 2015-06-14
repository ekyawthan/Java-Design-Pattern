import staticFactoryMethod.Provider;
import staticFactoryMethod.Service;
import staticFactoryMethod.Services;

/**
 * Created by kyawthan on 6/14/15.
 */
public class Main {

    public static void main(String [] args){

       Services.registerProvider("Tmobile", new Provider() {
           @Override
           public Service newService() {
               return new Service();
           }
       });

        Services.newInstance("Tmobile");
    }
}
