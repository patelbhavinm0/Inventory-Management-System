package com.example.W2Assignment2.controllers;

import com.example.W2Assignment2.entities.Item;
import com.example.W2Assignment2.services.Implemantation.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/item")
public class ItemController {

    @GetMapping("/hello")
    public  String sayHello()
    {
        return  "hello";
    }

    ItemService itemService;

    public ItemController(@Autowired  ItemService itemService)
    {
        this.itemService = itemService;
    }

    @GetMapping("/all")
    public List<Item> getAll()
    {
        return itemService.getAll();
    }

    @GetMapping("/{id}")
    public Item getById(@PathVariable int id)
    {
        return itemService.getById(id);
    }

    @PostMapping("/add")
    public Item add(@RequestBody Item item)
    {
        return itemService.add(item);
    }

    @DeleteMapping("/delete/{id}")
    public  Item delete(@PathVariable int id)
    {
        return itemService.delete(id);
    }

    @PutMapping("/update")
    public Item update(@RequestBody Item item)
    {
        return itemService.update(item);
    }

}
