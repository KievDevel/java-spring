package my.app.service;

import my.app.entities.Supply;


public interface SupplyService extends EntityService<Supply> {
    
    Supply getById(long id);
}
