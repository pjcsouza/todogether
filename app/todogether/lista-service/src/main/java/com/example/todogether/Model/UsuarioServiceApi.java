package com.example.todogether.Model;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class UsuarioServiceApi implements IUsuarioService{
	@Autowired WebClient.Builder wBuilder;

    public WebClient client() {
        return wBuilder.baseUrl("lb://usuario").build();
    }
	
    @Override
    public Long getUsuario() {

        return (Long)
                client().get()
                        .uri("/usuario")
                        .retrieve().bodyToMono(Map.class).block().get("usuari");
                        
                        
    }
	
}
