package pl.dw.cleanview.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dw.cleanview.model.Description;

public interface DescriptionRepo extends JpaRepository<Description, Long> {
}
