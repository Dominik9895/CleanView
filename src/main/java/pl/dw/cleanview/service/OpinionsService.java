package pl.dw.cleanview.service;

import pl.dw.cleanview.model.Opinions;

import java.util.Collection;

public interface OpinionsService {
    Opinions create(Opinions opinions);
    Boolean delete(Long cid);
    Opinions get(Long cid);
    Opinions update(Opinions opinions);
    Collection<Opinions> list(int limit);
}
