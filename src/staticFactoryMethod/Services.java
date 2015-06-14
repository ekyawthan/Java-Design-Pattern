package staticFactoryMethod;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by kyawthan on 6/14/15.
 */
public class Services {

    private Services(){}

    private static  final Map<String, Provider> providers  = new ConcurrentHashMap<String, Provider>();
    private static final String DEFAULT_PROVIDER = "<def>";

    // api to registration
    public static final void registerDefaultProvider(Provider provider){
        registerProvider(DEFAULT_PROVIDER, provider);
    }

    public static final void registerProvider(String defaultProvider, Provider provider) {
        providers.put(defaultProvider, provider);
    }

    public static Service newService() {
        return newInstance(DEFAULT_PROVIDER);
    }

    public static Service newInstance(String defaultProvider) {
        Provider provider = providers.get(defaultProvider);
        if (provider == null){
            throw new IllegalArgumentException(
                    "No Service Registered , Using this name : " + defaultProvider
            );

        }
        return provider.newService();
    }


}

