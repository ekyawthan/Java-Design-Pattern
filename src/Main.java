import builder.DrugModel;
import staticFactoryMethod.Provider;
import staticFactoryMethod.Service;
import staticFactoryMethod.Services;

/**
 * Created by kyawthan on 6/14/15.
 */
public class Main {

    public static void main(String[] args) {


        DrugModel model = new DrugModel.Builder("Lipitor", 20.0)
                .setProvider("Dr Kyaw")
                .setDirection("once day")
                .setQuantity(30.0).build();

        System.out.println(model.getName());
    }
}

