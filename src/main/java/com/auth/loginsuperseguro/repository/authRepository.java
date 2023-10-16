package com.auth.loginsuperseguro.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;
@Repository
public class authRepository {

    RestTemplate restTemplate = new RestTemplate();
    public String consultarApi() {
        try {
            String apiUrl = "https://ugpkgnoymxagweipdmxb.supabase.co/rest/v1/rpc/create";
            String body = "{ \"password\": \"value\", \"username\": \"value\" }";
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("apikey", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InVncGtnbm95bXhhZ3dlaXBkbXhiIiwicm9sZSI6ImFub24iLCJpYXQiOjE2OTczMDExNDUsImV4cCI6MjAxMjg3NzE0NX0.1TVx32aH5D-JHu1hew_guHZzHltAfEWP36iNCnAZkyw");
            headers.set("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InVncGtnbm95bXhhZ3dlaXBkbXhiIiwicm9sZSI6ImFub24iLCJpYXQiOjE2OTczMDExNDUsImV4cCI6MjAxMjg3NzE0NX0.1TVx32aH5D-JHu1hew_guHZzHltAfEWP36iNCnAZkyw");

            // Crea una entidad HTTP que incluye los encabezados y el cuerpo
            HttpEntity<String> requestEntity = new HttpEntity<>(body, headers);

            // Realiza la solicitud con los encabezados personalizados
            return restTemplate.postForObject(apiUrl, requestEntity, String.class);
        } catch (Exception e){
            System.out.println(e);
        }
        return "2";
    }
}
