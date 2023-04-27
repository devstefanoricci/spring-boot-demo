package it.linksmt.springboot.demo.mycoolapp.test;

public class TestController {
    protected String s;
    public String sayHello(String name) {
       s = name.length() > 1
               ?  "Hello World by" + name
            :  "Hello World ";
        return s;
    }
}
