package com.example.zachet_adminka.controller;



import com.example.zachet_adminka.model.Buyer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/buyers")
public class BuyerController {
    @GetMapping("/get_all_buyers")
    public List<Buyer> getAllBuyers() {
        List <Buyer> buyer = new ArrayList<>();
        Buyer user1 = new Buyer(1, "Joe", 26);
        Buyer user2 = new Buyer(2, "Bob", 25);
        buyer.add(user1);
        buyer.add(user2);
        return buyer;
    }
}
