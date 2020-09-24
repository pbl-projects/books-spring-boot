package com.example.books.controller;

import com.example.books.domain.Book;
import com.example.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/books")
    public String allBooks(Model model) {
        List<Book> bookList = service.listAll();
        model.addAttribute("bookList", bookList);

        return "book_list";
    }

    @RequestMapping("/new/book")
    public String newBookForm(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);

        return "new_book_form";
    }

    @RequestMapping(value = "/save/book", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("book") Book book) {
        service.save(book);

        return "redirect:/books";
    }

    @RequestMapping("/edit/book/{id}")
    public ModelAndView editBookForm(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_book");
        Book book = service.get(id);
        mav.addObject("book", book);

        return mav;
    }

    @RequestMapping("/delete/book/{id}")
    public String deleteBook(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/books";
    }
}
