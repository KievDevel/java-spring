package my.app.service.impl;

import my.app.entities.KnowledgeBase;
import my.app.repository.KnowledgeBaseRepository;
import my.app.service.KnowledgeBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnowledgeBaseServiceImpl implements KnowledgeBaseService {

    @Autowired
    private KnowledgeBaseRepository knowledgeBaseRepository;

    @Override
    public List<KnowledgeBase> getAll() {
        return knowledgeBaseRepository.findAll();
    }

    @Override
    public void saveOrUpdate(KnowledgeBase knowledgeBase) {
        knowledgeBaseRepository.saveAndFlush(knowledgeBase);
    }

    @Override
    public void delete(long id) {
        knowledgeBaseRepository.delete(id);
    }

    @Override
    public KnowledgeBase getById(long id) {
        return knowledgeBaseRepository.findOne(id);
    }
}
