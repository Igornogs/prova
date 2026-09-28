package br.com.etechas.provaExercicioFisico.demo.entity;

import br.com.etechas.provaExercicioFisico.demo.enums.NivelDificuldadeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Exercicio_fisico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ExercicioFisico {
    @Id
    @Column(name="id_exercicio")
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="grupoMuscular")
    private String grupoMuscular;

    @Column(name="imagem")
    private String imagem;

    @Column(name="descricao")
    private String descricao;

    @Column(name="numeroSeries")
    private int numeroSeries;

    @Column(name="numeroRepeticoes")
    private int numeroRepeticoes;

    @Column(name="cargaSugerida")
    private double cargaSugerida;

    @Enumerated(EnumType.STRING)
    private NivelDificuldadeEnum nivelDificuldade;

}






