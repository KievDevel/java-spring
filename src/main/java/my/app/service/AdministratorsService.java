package my.app.service;

import my.app.entities.Administrators;


public interface AdministratorsService extends EntityService<Administrators> {

    Administrators getById(long id);
}
