package br.com.etechas.provaExercicioFisico.demo.repository;

import br.com.etechas.provaExercicioFisico.demo.entity.ExercicioFisico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<ExercicioFisico, Integer>{
}

