package br.com.petz.clientepet.pet.application.api;

import br.com.petz.clientepet.pet.domain.Porte;
import br.com.petz.clientepet.pet.domain.SexoPet;
import br.com.petz.clientepet.pet.domain.TipoPet;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;

@Value
public class PetRequest {
    @NotBlank
    private String nomePet;
    @Enumerated(EnumType.STRING)
    private Porte porte;
    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoPet tipoPet;
    private String microchip;
    @NotBlank
    private String raca;
    @NotNull
    @Enumerated(EnumType.STRING)
    private SexoPet sexo;
    private String pelagemCor;
    @NotNull
    private LocalDate dataNascimento;
    private String rga;
    private Integer peso;
}
