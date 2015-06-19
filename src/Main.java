import InterfaceTest.Player;
import builder.DrugModel;
import staticFactoryMethod.Provider;
import staticFactoryMethod.Service;
import staticFactoryMethod.Services;

/**
 * Created by kyawthan on 6/14/15.
 */
public class Main {

    public static void main(String[] args) {


        Player player = new Player(5);
        player.setDelegate(new Player.GameResultWithSetter() {
            @Override
            public void won() {
                System.out.println("I won");
            }

            @Override
            public void lost() {
                System.out.println("I lost");

            }
        });


        DrugModel model = new DrugModel.Builder("Lipitor", 20.0)
                .setProvider("Dr Kyaw")
                .setDirection("once day")
                .setQuantity(30.0).build();

        System.out.println(model.getName());

        new Player(new Player.GameResult() {
            @Override
            public void won() {
                System.out.println("I won");
            }

            @Override
            public void lost() {
                System.out.println("I lost");


            }
        }, 3);


    }


}

