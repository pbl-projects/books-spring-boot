package com.example.books.service;

import com.example.books.domain.Book;
import com.example.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookService {

    @Autowired
    private BookRepository repo;

    public List<Book> listAll() {
        return repo.findAll();
    }

    public void save(Book book) {
        repo.save(book);
    }

    public Book get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
