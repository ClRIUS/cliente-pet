package br.com.petz.clientepet.cliente.application.api;

import br.com.petz.clientepet.cliente.domain.Sexo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
@Value
public class ClienteRequest {
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String celular;
    private String telefone;
    private Sexo sexo;
    @NotNull
    private LocalDate dataNascimento;
    @CPF
    private String cpf;
    @NotNull
    @Getter(value = AccessLevel.NONE)
    private Boolean aceitaTermos;
}
