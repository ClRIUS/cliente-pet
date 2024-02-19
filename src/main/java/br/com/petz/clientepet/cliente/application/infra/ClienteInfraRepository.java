package br.com.petz.clientepet.cliente.application.infra;

import br.com.petz.clientepet.cliente.application.repository.ClienteRepositoy;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
@Repository
@Log4j2
public class ClienteInfraRepository implements ClienteRepositoy {
    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[inicia] ClienteInfraRepository - salva");
        clienteSpringDataJPARepository.save(cliente);
        log.info("[finaliza] ClienteInfraRepository - salva");
        return cliente;
    }
}