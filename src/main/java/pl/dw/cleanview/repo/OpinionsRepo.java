package pl.dw.cleanview.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dw.cleanview.model.Opinions;

public interface OpinionsRepo extends JpaRepository<Opinions, Long> {
}
