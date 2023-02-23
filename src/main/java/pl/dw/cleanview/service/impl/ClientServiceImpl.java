package pl.dw.cleanview.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pl.dw.cleanview.model.Client;
import pl.dw.cleanview.repo.ClientRepo;
import pl.dw.cleanview.service.ClientService;

import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class ClientServiceImpl implements ClientService {
    private final ClientRepo clientRepo;

    @Override
    public Client create(Client client) {
        log.info("Saving new client: {}", client.getFullName());
        return clientRepo.save(client);
    }

    @Override
    public Boolean delete(Long cid) {
        log.info("Deleting client by ID: {}", cid);
        clientRepo.deleteById(cid);
        return true;
    }

    @Override
    public Client get(Long cid) {
        log.info("Fetching client by ID: {}", cid);
        return clientRepo.findById(cid).get();
    }

    @Override
    public Client update(Client client) {
        log.info("Updating client: {}", client.getFullName());
        return clientRepo.save(client);
    }

    @Override
    public Collection<Client> list(int limit) {
        log.info("Listing clients");
        return clientRepo.findAll(PageRequest.of(0, limit)).toList();
    }
}
