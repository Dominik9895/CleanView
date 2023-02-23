package pl.dw.cleanview.service;

import pl.dw.cleanview.model.Client;

import java.util.Collection;

public interface ClientService {
    Client create(Client client);
    Boolean delete(Long cid);
    Client get(Long cid);
    Client update(Client client);
    Collection <Client> list(int limit);
}
