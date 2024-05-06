package com.example.LIBRARY.Controllers;

import com.example.LIBRARY.Models.BookModel;
import com.example.LIBRARY.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    //get
    @GetMapping()
    public ArrayList<BookModel> findAllBooks(){
        return bookService.findAllBooks();
    }
    //post
    @PostMapping()
    public BookModel saveBook(@RequestBody BookModel book){
        return bookService.saveBook(book);
    }
    //update
    @PutMapping()
    public BookModel updateBook(@RequestBody BookModel book){
        return bookService.saveBook(book);
    }
    //buscar por nombre
    @GetMapping(path ="/find-by-name")
    public Optional<ArrayList<BookModel>> findByName(@RequestParam("name")String name){
        return bookService.findByName(name);
    }
    //eliminar
    @DeleteMapping("/delete-book-by-request")
    public String deleteBookByRequest(@RequestParam("request") Long request){
        return bookService.deleteStudentByRequest(request);
    }

}
