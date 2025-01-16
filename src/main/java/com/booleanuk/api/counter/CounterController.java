package com.booleanuk.api.counter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("counter")
public class CounterController {
    private int counter;

    public CounterController() {
        this.counter = 0;
    }

    @GetMapping
    public int getCounter() {
        return this.counter;
    }

    @GetMapping("/increment")
    public int increment() {
        this.counter = counter + 1;
        return counter;
    }

    @GetMapping("/decrement")
    public int decrement() {
        this.counter = counter - 1;
        return counter;
    }

}
