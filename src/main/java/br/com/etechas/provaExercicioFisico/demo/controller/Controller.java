package br.com.etechas.provaExercicioFisico.demo.controller;

import br.com.etechas.provaExercicioFisico.demo.entity.ExercicioFisico;
import br.com.etechas.provaExercicioFisico.demo.repository.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/exercicios")

public class Controller {

    private Repository repository;

    public Controller (Repository repository){
        this.repository = repository;
    }
    @GetMapping

    public ResponseEntity<List<ExercicioFisico>> listarTodos(){
        List<ExercicioFisico> exercicios = repository.findAll();
        if (exercicios.isEmpty()){
            return ResponseEntity.noContent().build();

        }
        return ResponseEntity.ok(exercicios);


    }
    @GetMapping("/{id}")
    public ResponseEntity <ExercicioFisico> buscarPorId(PathVariable Long id){

    }



}
