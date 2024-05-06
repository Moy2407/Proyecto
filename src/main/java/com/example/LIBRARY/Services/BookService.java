package com.example.LIBRARY.Services;

import com.example.LIBRARY.Models.BookModel;
import com.example.LIBRARY.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    //guardar un libro
    public BookModel saveBook(BookModel book){
        if(bookRepository.findByName(book.getName()).toString().equals("Optional[[]]")){
            return bookRepository.save(book);
        }else{
            BookModel bookError = new BookModel();
            bookError.setRequest(-1L);
            return bookError;
        }
    }

    //obtener todos los libros solicitados
    public ArrayList<BookModel> findAllBooks(){
        return (ArrayList<BookModel>) bookRepository.findAll();
    }

    //buscar por nombre
    public Optional<ArrayList<BookModel>> findByName(String name){
        return bookRepository.findByName(name);
    }

    public Optional<BookModel> findById(Long request){
        return bookRepository.findById(request);
    }

    public String deleteStudentByRequest(Long request){
        if(findById(request).isPresent()){
            bookRepository.deleteById(request);
            return "book request deleted successfully";
        }else {
            return "request number="+ request+ " not found";
        }
    }



}
