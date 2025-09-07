package com.example.demoapi;

import com.example.demoapi.model.BookTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookTable, Long> {
    // No need to write code — Spring Data JPA gives CRUD methods automatically
}


/*

What this code do......

JpaRepository<BookTable, Long> already gives  

findAll() → fetch all books

findById() → fetch by ID

save() → insert/update

deleteById() → delete

We don’t write SQL — Hibernate does it.


*/