package io.swagger.api.factories;

import io.swagger.api.StoreApiService;
import io.swagger.api.impl.StoreApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-10T14:41:01.487Z")
public class StoreApiServiceFactory {
    private final static StoreApiService service = new StoreApiServiceImpl();

    public static StoreApiService getStoreApi() {
        return service;
    }
}
