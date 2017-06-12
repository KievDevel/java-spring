package my.app.service;

import my.app.entities.Budget;
import my.app.entities.Salary;


public interface SalaryService extends EntityService<Salary> {


    Salary getById(long id);
}
