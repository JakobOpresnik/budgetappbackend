package com.javaapps.budgetapp.repository;

import com.javaapps.budgetapp.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// importing JPA (Java Persistent API) repository for class 'Item' & primary key of type 'Integer'
@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
}