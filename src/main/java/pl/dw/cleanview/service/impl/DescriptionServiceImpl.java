package pl.dw.cleanview.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pl.dw.cleanview.model.Description;
import pl.dw.cleanview.repo.DescriptionRepo;
import pl.dw.cleanview.service.DescriptionService;

import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class DescriptionServiceImpl implements DescriptionService {
    private final DescriptionRepo descriptionRepo;
    @Override
    public Description create(Description description) {
        log.info("Saving new description:");
        return descriptionRepo.save(description);
    }

    @Override
    public Boolean delete(Long cid) {
        log.info("Deleting description by ID: {}", cid);
        descriptionRepo.deleteById(cid);
        return true;
    }

    @Override
    public Description get(Long cid) {
        log.info("Fetching description by ID: {}", cid);
        return descriptionRepo.getReferenceById(cid);
    }

    @Override
    public Description update(Description description) {
        log.info("Updating description");
        return descriptionRepo.save(description);
    }

    @Override
    public Collection<Description> list(int limit) {
        log.info("Listing descriptions");
        return descriptionRepo.findAll(PageRequest.of(0, limit)).toList();
    }
}
