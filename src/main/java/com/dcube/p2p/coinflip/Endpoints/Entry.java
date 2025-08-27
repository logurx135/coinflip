package com.dcube.p2p.coinflip.Endpoints;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Entry {
    
    @GetMapping("/health")
    public String getMethodName() {
        return new String("I am alive");
    }
    
}
