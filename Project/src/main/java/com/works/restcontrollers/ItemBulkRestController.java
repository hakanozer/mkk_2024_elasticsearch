package com.works.restcontrollers;

import com.works.entities.Item;
import com.works.services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("items")
public class ItemBulkRestController {

    final ItemService itemService;

    @PostMapping("save")
    public Item save(@RequestBody Item item) {
       return itemService.create(item);
    }

    @PostMapping("saveAll")
    public Iterable<Item> saveAll(@RequestBody List<Item> items) {
        return itemService.createList(items);
    }

}
