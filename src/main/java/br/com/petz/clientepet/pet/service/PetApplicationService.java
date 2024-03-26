package br.com.petz.clientepet.pet.service;

import br.com.petz.clientepet.pet.application.api.PetRequest;
import br.com.petz.clientepet.pet.application.api.PetResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Log4j2
@Service
public class PetApplicationService implements PetService{
    @Override
    public PetResponse criaPet(UUID idCliente, PetRequest petRequest) {
        log.info("[inicia] PetApplicationService - criaPet");
        log.info("[finaliza] PetApplicationService - criaPet");
        return null;
    }
}
