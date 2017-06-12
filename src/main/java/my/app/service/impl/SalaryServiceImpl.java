package my.app.service.impl;



import my.app.entities.Salary;
import my.app.repository.SalaryRepository;
import my.app.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryRepository salaryRepository;

    @Override
    public List<Salary> getAll() {
        return salaryRepository.findAll();
    }

    @Override
    public void saveOrUpdate(Salary salary) {
        salary.setUpdated_at(new Timestamp(System.currentTimeMillis()));
        salaryRepository.saveAndFlush(salary);
    }

    @Override
    public void delete(long id) {
        salaryRepository.delete(id);
    }

    @Override
    public Salary getById(long id) {
        return salaryRepository.findOne(id);
    }
}
