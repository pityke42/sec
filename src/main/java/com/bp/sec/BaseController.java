package com.bp.sec;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class BaseController {
    @GetMapping(path = "/tester")
    public ResponseEntity tester(){
        return ResponseEntity.ok(null);
    }
    @PutMapping(path = "/protected")
    public ResponseEntity testprotected(){
        return ResponseEntity.ok(null);
    }
}
