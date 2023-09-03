package com.javaapps.budgetapp.service;

import com.javaapps.budgetapp.model.Item;
import com.javaapps.budgetapp.repository.ItemRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);   // using JPA to save new item to database
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item deleteItem(Item item) {
        itemRepository.delete(item);
        return item;
    }

    @Override
    public Item updateItem(Integer id, Item item) {
        Optional<Item> optionalItem = itemRepository.findById(id);

        // check if item exists
        if (optionalItem.isPresent()) {
            // update item
            Item updatedItem = optionalItem.get();
            updatedItem.setName(item.getName());
            updatedItem.setPrice(item.getPrice());
            updatedItem.setType(item.getType());

            return itemRepository.save(updatedItem);
        }
        else {
            throw new EntityNotFoundException("Entity with ID " + id + " not found.");
        }
    }

}
