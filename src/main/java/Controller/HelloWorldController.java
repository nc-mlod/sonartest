package Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<String> getHelloWorldText(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello World to my controller");
    }

    @GetMapping(value = "/house")
    public ResponseEntity<String> getHelloHouse(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello House to my controller");
    }

    @GetMapping(value = "/business")
    public ResponseEntity<String> getBusiness(){
        return ResponseEntity.status(HttpStatus.OK).body("Deprecha");
    }
}
