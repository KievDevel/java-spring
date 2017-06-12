package my.app.service;


import my.app.entities.KnowledgeBase;

public interface KnowledgeBaseService extends EntityService<KnowledgeBase>{

    KnowledgeBase getById(long id);
}
