package pl.dw.cleanview.service;

import pl.dw.cleanview.model.Description;

import java.util.Collection;

public interface DescriptionService {
    Description create(Description description);
    Boolean delete(Long cid);
    Description get(Long cid);
    Description update(Description description);
    Collection <Description> list(int limit);
}
