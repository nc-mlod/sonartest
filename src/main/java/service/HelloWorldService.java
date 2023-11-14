package service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public int calcBusinessCosts(int income, int tax){
        return income - tax;
    }
    public String helloWorldTextValue(){ return "Hello world"; }
}
