package com.example.demo.Servicios;

import com.example.demo.Entidades.Encuesta;
import com.example.demo.Entidades.Pregunta;
import com.example.demo.Entidades.Respuesta;
import com.example.demo.Repositories.EncuestaRepository;
import com.example.demo.Repositories.RespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class EncuestaService {
    @Autowired
    private RespuestaRepository respuestaRepository;
    @Autowired
    private EncuestaRepository encuestaRepository;

    public void responderPregunta(Long encuestaId, Long preguntaId, Long respuestaId) {
        // Obtener la encuesta por ID
        Encuesta encuesta = encuestaRepository.findById(encuestaId)
                .orElseThrow(() -> new DataAccessException("La encuesta no existe con ID: " + encuestaId) {
                });

        // Verificar que la pregunta y la respuesta existan en la encuesta
        Pregunta pregunta = encuesta.getPreguntas().stream()
                .filter(p -> p.getId().equals(preguntaId))
                .findFirst()
                .orElseThrow(() -> new DataAccessException("La pregunta no existe con ID: " + preguntaId) {
                });

        Respuesta respuesta = pregunta.getRespuestas().stream()
                .filter(r -> Long.valueOf(r.getId()).equals(respuestaId))
                .findFirst()
                .orElseThrow(() -> new DataAccessException("La respuesta no existe con ID: " + respuestaId) {
                });
    }
}

