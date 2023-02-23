package pl.dw.cleanview.resource;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dw.cleanview.model.Doctor;
import pl.dw.cleanview.service.DoctorService;

import java.util.Collection;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @GetMapping("/create")
    public Doctor create(Doctor doctor) { return doctorService.create(doctor); }

    @GetMapping("/delete")
    public Boolean delete(Long cid) { return doctorService.delete(cid); }

    @GetMapping("/get")
    public Doctor get(Long cid) { return doctorService.get(cid); }

    @GetMapping("/update")
    public Doctor update(Doctor doctor) { return doctorService.update(doctor); }

    @GetMapping("/list")
    public Collection<Doctor> getDoctors() {
        return doctorService.list(30);
    }
}
