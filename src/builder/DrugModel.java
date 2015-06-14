package builder;

/**
 * Created by kyawthan on 6/14/15.
 */
public class DrugModel {
    public String getName() {
        return name;
    }

    public Double getStrength() {
        return strength;
    }

    public String getDirection() {
        return direction;
    }

    public Double getQuantity() {
        return quantity;
    }

    public String getProvider() {
        return provider;
    }

    // require parameter
    private String name;
    private Double strength ;

    // optional parameter
    private String direction ;
    private Double quantity  ;
    private String provider ;

    public static class Builder{
        // require parameter
        private String name;
        private Double strength ;

        // optional parameter
        private String direction = "BID";
        private Double quantity  = 0.0;
        private String provider = "Dr xxx";

        public Builder(String name, Double strength){
            this.name = name;
            this.strength = strength;
        }
        public Builder setDirection(String direction){
            direction = direction; return this;
        }
        public Builder setQuantity(Double quantity){
            quantity = quantity; return this;
        }
        public Builder setProvider(String provider){
            provider = provider; return  this;
        }

        public DrugModel build(){
            return new DrugModel(this);
        }

    }

    public DrugModel(Builder builder){
        name = builder.name;
        strength = builder.strength;
        quantity = builder.quantity;
        direction = builder.direction;
        provider = builder.provider;
    }


}
