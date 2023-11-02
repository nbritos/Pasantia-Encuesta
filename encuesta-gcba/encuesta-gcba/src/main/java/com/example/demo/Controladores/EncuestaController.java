package com.example.demo.Controladores;

import com.example.demo.Servicios.EncuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/encuesta")
public class EncuestaController {

    @Autowired
    private EncuestaService encuestaService;

    @PostMapping("/responder")
    public ResponseEntity<String> responderPregunta(@RequestParam Long encuestaId, @RequestParam Long preguntaId, @RequestParam Long respuestaId) {
        try {
            encuestaService.responderPregunta(encuestaId, preguntaId, respuestaId);
            return ResponseEntity.status(HttpStatus.CREATED).body("Respuesta guardada exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error al guardar la respuesta.");
        }
    }
}

