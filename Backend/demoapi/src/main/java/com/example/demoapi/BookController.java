package com.example.demoapi;


import org.springframework.web.bind.annotation.*;

import com.example.demoapi.model.BookTable;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:3000")  // allow React frontend
public class BookController {

    private final BookRepository bookRepository;

    // Constructor Injection
    
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    
    // GET request → fetch all books
    
    @GetMapping
    public List<BookTable> getAllBooks() {
        return bookRepository.findAll();  // runs SELECT * FROM book_table
    }
}

/*
 
 Why this file?

@RestController → makes it an API controller.

@RequestMapping("/api/books") → all book APIs start with /api/books.

@GetMapping → defines a GET request.

bookRepository.findAll() → Hibernate auto-generates SELECT * FROM book_table.

@CrossOrigin → fixes the CORS issue so React can call it.

 */

