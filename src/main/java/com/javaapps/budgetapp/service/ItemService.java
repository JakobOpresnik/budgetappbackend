package com.javaapps.budgetapp.service;

import com.javaapps.budgetapp.model.Item;

import java.util.List;

public interface ItemService {
    public Item saveItem(Item item);
    public List<Item> getAllItems();
    public Item deleteItem(Item item);
    public Item updateItem(Integer id, Item item);
}
