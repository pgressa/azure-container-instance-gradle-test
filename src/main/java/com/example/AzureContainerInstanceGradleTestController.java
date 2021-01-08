package com.example;

import io.micronaut.http.annotation.*;

@Controller("/azureContainerInstanceGradleTest")
public class AzureContainerInstanceGradleTestController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}