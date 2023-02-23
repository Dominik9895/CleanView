package pl.dw.cleanview.service;

import pl.dw.cleanview.model.Doctor;

import java.util.Collection;

public interface DoctorService {
    Doctor create(Doctor doctor);
    Boolean delete(Long cid);
    Doctor get(Long cid);
    Doctor update(Doctor doctor);
    Collection<Doctor> list(int limit);
}
