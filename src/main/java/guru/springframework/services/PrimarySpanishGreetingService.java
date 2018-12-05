package guru.springframework.services;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingService  implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }

}
