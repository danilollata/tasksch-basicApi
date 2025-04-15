
package com.example.tarea3Llata;

        
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController   
@RequestMapping("/api/temperatura")
public class Controller {
    
    @GetMapping("/celsius-a-fahrenheit")
    public String convertir(@RequestParam double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        return String.format("%.2f°C = %.2f°F", celsius, fahrenheit);
    }
}
