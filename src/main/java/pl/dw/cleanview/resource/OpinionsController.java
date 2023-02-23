package pl.dw.cleanview.resource;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dw.cleanview.model.Opinions;
import pl.dw.cleanview.service.OpinionsService;

import java.util.Collection;

@RestController
@RequestMapping("/opinions")
@RequiredArgsConstructor
public class OpinionsController {
    private final OpinionsService opinionsService;

    @GetMapping("/create")
    public Opinions create(Opinions opinions) { return opinionsService.create(opinions); }

    @GetMapping("/delete")
    public Boolean delete(Long oid) { return opinionsService.delete(oid); }

    @GetMapping("/get")
    public Opinions get(Long oid) { return opinionsService.get(oid); }

    @GetMapping("/update")
    public Opinions update(Opinions opinions) { return opinionsService.update(opinions); }

    @GetMapping("/list")
    public Collection<Opinions> getOpinions() {
        return opinionsService.list(30);
    }
}
