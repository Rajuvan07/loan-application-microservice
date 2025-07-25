package com.example.loanservice.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/loan")
public class LoanController {
    @GetMapping("/info")
    public List<String> getAll() {
        return List.of("Sample Loan 1", "Sample Loan 2");
    }
}
