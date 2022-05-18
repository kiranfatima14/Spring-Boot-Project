package com.example.form;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customers , Integer> {

}
