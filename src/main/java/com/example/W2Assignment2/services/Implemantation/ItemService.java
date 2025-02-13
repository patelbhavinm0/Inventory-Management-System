package com.example.W2Assignment2.services.Implemantation;


import com.example.W2Assignment2.entities.Item;
import com.example.W2Assignment2.repo.ItemRepository;
import com.example.W2Assignment2.services.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService implements IItemService{

    ItemRepository itemRepository;

    public ItemService(@Autowired ItemRepository itemRepository)
    {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    public Item getById(int id)
    {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public Item add(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item delete(int id) {
        Item item = itemRepository.findById(id).orElse(null);
        itemRepository.deleteById(id);
        return item;
    }

    @Override
    public Item update(Item item) {
        return itemRepository.save(item);
    }
}