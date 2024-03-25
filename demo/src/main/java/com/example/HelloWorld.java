package com.example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class HelloWorld implements Processor {
    


    public String helloString()
    {
        System.out.println(" Reached here.... ");
        return " My Hello World ";
    }

    @Override
    public void process(Exchange exchange) throws Exception {
        String originalFileContent = (String) exchange.getIn().getBody(String.class);
        String upperCaseFileContent = originalFileContent.toUpperCase();
        System.out.println(" testing the processor "+upperCaseFileContent);
        exchange.getIn().setBody(upperCaseFileContent);
    }
    
}
