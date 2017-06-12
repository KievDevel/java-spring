package my.app.service.impl;

import my.app.entities.Supply;
import my.app.repository.SupplyRepository;
import my.app.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class SupplyServiceImpl implements SupplyService {

    @Autowired
    private SupplyRepository supplyRepository;

    @Override
    public List<Supply> getAll() {
        return supplyRepository.findAll();
    }

    @Override
    public void saveOrUpdate(Supply supply) {
        supply.setUpdated_at(new Timestamp(System.currentTimeMillis()));
        supplyRepository.saveAndFlush(supply);
    }

    @Override
    public void delete(long id) {
        supplyRepository.delete(id);
    }

    @Override
    public Supply getById(long id) {
        return supplyRepository.findOne(id);
    }
}
