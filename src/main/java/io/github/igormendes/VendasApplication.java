package io.github.igormendes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@ComponentScan(basePackeges={artifact id do pacote}) Utilizar somente quando for utilizar mais de um pacote, serve para escanear os componentes,dentro e fora do escopo padrão,no padrão não costumamos utilizar para um pacote só 
@RestController
public class VendasApplication {
    @Autowired
    @Qualifier("applicationName")
    private String applicationName;
    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class,args);

    }
}
