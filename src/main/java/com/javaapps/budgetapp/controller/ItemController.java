package com.javaapps.budgetapp.controller;

import com.javaapps.budgetapp.model.Item;
import com.javaapps.budgetapp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/add")
    public String add(@RequestBody Item item) {
        itemService.saveItem(item);
        return "New item added!";
    }

    @GetMapping("/getAll")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @DeleteMapping("/delete")
    public String deleteItem(@RequestBody Item item) {
        itemService.deleteItem(item);
        return "item deleted!";
    }

    @PutMapping("/update/{id}")
    public Item updateItem(@PathVariable Integer id, @RequestBody Item item) {
        return itemService.updateItem(id, item);
    }

}
