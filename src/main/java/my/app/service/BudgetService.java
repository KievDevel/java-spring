package my.app.service;

import my.app.entities.Budget;


public interface BudgetService extends EntityService<Budget> {

    Budget getById(long id);
}
