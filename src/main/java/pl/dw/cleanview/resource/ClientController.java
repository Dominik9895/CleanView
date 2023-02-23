package pl.dw.cleanview.resource;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dw.cleanview.model.Client;
import pl.dw.cleanview.service.impl.ClientServiceImpl;
import java.util.Collection;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {
    private final ClientServiceImpl clientService;

    @GetMapping("/create")
    public Client create(Client client) { return clientService.create(client); }

    @GetMapping("/delete")
    public Boolean delete(Long cid) { return clientService.delete(cid); }

    @GetMapping("/get")
    public Client get(Long cid) { return clientService.get(cid); }

    @GetMapping("/update")
    public Client update(Client client) { return clientService.update(client); }

    @GetMapping("/list")
    public Collection<Client> getClients() {
        return clientService.list(30);
    }
}
