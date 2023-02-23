package pl.dw.cleanview.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pl.dw.cleanview.model.Description;
import pl.dw.cleanview.model.Doctor;
import pl.dw.cleanview.repo.DoctorRepo;
import pl.dw.cleanview.service.DoctorService;

import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepo doctorRepo;

    @Override
    public Doctor create(Doctor doctor) {
        log.info("Saving new doctor: {}", doctor.getFullName());
        return doctorRepo.save(doctor);
    }

    @Override
    public Boolean delete(Long cid) {
        log.info("Deleting doctor by ID: {}", cid);
        doctorRepo.deleteById(cid);
        return true;
    }

    @Override
    public Doctor get(Long cid) {
        log.info("Fetching doctor by ID: {}", cid);
        return doctorRepo.getReferenceById(cid);
    }

    @Override
    public Doctor update(Doctor doctor) {
        log.info("Updating doctor: {}", doctor.getFullName());
        return doctorRepo.save(doctor);
    }

    @Override
    public Collection<Doctor> list(int limit) {
        log.info("Listing doctors");
        return doctorRepo.findAll(PageRequest.of(0, limit)).toList();
    }
}
