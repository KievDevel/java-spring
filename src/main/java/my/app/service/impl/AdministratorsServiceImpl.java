package my.app.service.impl;

import my.app.entities.Administrators;
import my.app.repository.AdministratorsRepository;
import my.app.service.AdministratorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorsServiceImpl implements AdministratorsService{

    @Autowired
    private AdministratorsRepository administratorsRepository;


    @Override
    public List<Administrators> getAll() {
        return administratorsRepository.findAll();
    }

    @Override
    public void saveOrUpdate(Administrators administrators) {
        administratorsRepository.saveAndFlush(administrators);
    }

    @Override
    public void delete(long id) {
        administratorsRepository.delete(id);
    }

    @Override
    public Administrators getById(long id) {
        return administratorsRepository.findOne(id);
    }
}
