package my.app.service.impl;

import my.app.entities.Budget;
import my.app.repository.BudgetRepository;
import my.app.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetServiceImpl implements BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

    @Override
    public List<Budget> getAll() {
        return budgetRepository.findAll();
    }

    @Override
    public void saveOrUpdate(Budget budget) {
        budgetRepository.saveAndFlush(budget);
    }

    @Override
    public void delete(long id) {
        budgetRepository.delete(id);
    }

    @Override
    public Budget getById(long id) {
        return budgetRepository.findOne(id);
    }
}
