package br.com.petz.clientepet.cliente.application.api;

import br.com.petz.clientepet.cliente.domain.Sexo;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class ClienteDetalhadoResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;
    private Sexo sexo;
    private Boolean aceitaTermos;
    private LocalDateTime dataHoraDoCadastro;

    public ClienteDetalhadoResponse(UUID idCliente, String nomeCompleto, String cpf,
                                    String email, String celular, Sexo sexo, Boolean aceitaTermos,
                                    LocalDateTime dataHoraDoCadastro) {
        this.idCliente = idCliente;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
        this.sexo = sexo;
        this.aceitaTermos = aceitaTermos;
        this.dataHoraDoCadastro = dataHoraDoCadastro;
    }
}
