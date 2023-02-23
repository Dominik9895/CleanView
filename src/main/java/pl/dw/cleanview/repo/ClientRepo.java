package pl.dw.cleanview.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dw.cleanview.model.Client;

public interface ClientRepo extends JpaRepository<Client, Long> {

}
