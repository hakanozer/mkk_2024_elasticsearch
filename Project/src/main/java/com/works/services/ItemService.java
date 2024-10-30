package com.works.services;

import com.works.entities.Item;
import com.works.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    final ItemRepository itemRepository;

    public Item create(Item item) {
        return itemRepository.save(item);
    }

    public Iterable<Item> createList(List<Item> itemList) {
        return itemRepository.saveAll(itemList);
    }

}
