package com.example.W2Assignment2.services;

import com.example.W2Assignment2.entities.Item;

import java.util.List;

public interface IItemService {


    List<Item> getAll();

    Item add(Item item);

    Item delete(int id);

    Item update(Item item);

    Item getById(int id);

}
