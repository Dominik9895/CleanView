package pl.dw.cleanview.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dw.cleanview.model.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Long> {
}
