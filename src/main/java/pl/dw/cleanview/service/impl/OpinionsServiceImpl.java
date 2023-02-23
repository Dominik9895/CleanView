package pl.dw.cleanview.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pl.dw.cleanview.model.Opinions;
import pl.dw.cleanview.repo.OpinionsRepo;
import pl.dw.cleanview.service.OpinionsService;
import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class OpinionsServiceImpl implements OpinionsService {
    private final OpinionsRepo opinionsRepo;

    @Override
    public Opinions create(Opinions opinions) {
        log.info("Saving new opinions");
        return opinionsRepo.save(opinions);
    }

    @Override
    public Boolean delete(Long oid) {
        log.info("Deleting opinion");
        opinionsRepo.deleteById(oid);
        return true;
    }

    @Override
    public Opinions get(Long oid) {
        log.info("Fetching opinion");
        return opinionsRepo.getReferenceById(oid);
    }

    @Override
    public Opinions update(Opinions opinions) {
        log.info("Updating opinion");
        return opinionsRepo.save(opinions);
    }

    @Override
    public Collection<Opinions> list(int limit) {
        log.info("Listing opinions");
        return opinionsRepo.findAll(PageRequest.of(0, limit)).toList();
    }
}
