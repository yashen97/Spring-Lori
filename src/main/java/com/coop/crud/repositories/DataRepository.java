package com.coop.crud.repositories;
import org.springframework.data.repository.CrudRepository;
import com.coop.crud.models.DataModel;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface DataRepository extends CrudRepository<DataModel, Integer> {

}