package pl.dw.cleanview.resource;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dw.cleanview.model.Description;
import pl.dw.cleanview.service.DescriptionService;

import java.util.Collection;

@RestController
@RequestMapping("/description")
@RequiredArgsConstructor
public class DescriptionController {
    private final DescriptionService descriptionService;

    @GetMapping("/create")
    public Description create(Description description) { return descriptionService.create(description); }

    @GetMapping("/delete")
    public Boolean delete(Long descId) { return descriptionService.delete(descId); }

    @GetMapping("/get")
    public Description get(Long descId) { return descriptionService.get(descId); }

    @GetMapping("/create")
    public Description update(Description description) { return descriptionService.update(description); }

    @GetMapping("/list")
    public Collection<Description> getDescriptions() {
        return descriptionService.list(30);
    }
}
