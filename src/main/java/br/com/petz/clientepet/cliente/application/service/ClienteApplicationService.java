package br.com.petz.clientepet.cliente.application.service;

import br.com.petz.clientepet.cliente.application.api.*;
import br.com.petz.clientepet.cliente.application.repository.ClienteRepositoy;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
    private final ClienteRepositoy clienteRepository;

    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteApplicationService - criaCliente");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
        log.info("[finaliza] ClienteApplicationService - criaCliente");
        return ClienteResponse.builder()
                .idCliente(cliente.getIdCliente())
                .build();
    }

    @Override
    public List<ClienteListResponse> buscaTodosClientes() {
        log.info("[inicia] ClienteApplicationService - buscaTodosClientes");
        List<Cliente> clientes = clienteRepository.buscaTodosClientes();
        log.info("[finaliza] ClienteApplicationService - buscaTodosClientes");
        return ClienteListResponse.converte(clientes);
    }

    @Override
    public ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteApplicationService - buscaClienteAtravesId");
        Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
        log.info("[finaliza] ClienteApplicationService - buscaClienteAtravesId");
        return new ClienteDetalhadoResponse(cliente);
    }

    @Override
    public void deletaClienteAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteApplicationService - deletaClienteAtravesId");
        Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
        clienteRepository.deletaCliente(cliente);
        log.info("[finaliza] ClienteApplicationService - deletaClienteAtravesId");
    }

    @Override
    public void alteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest) {
        log.info("[inicia] ClienteApplicationService - alteraCliente");
        Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
        cliente.alteraCliente(clienteAlteracaoRequest);
        clienteRepository.salva(cliente);
        log.info("[finaliza] ClienteApplicationService - alteraCliente");
    }
}
