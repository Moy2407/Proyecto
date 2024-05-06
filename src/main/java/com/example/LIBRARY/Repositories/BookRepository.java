package com.example.LIBRARY.Repositories;

import com.example.LIBRARY.Models.BookModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<BookModel,Long> {
    //buscar por nombre
    public Optional<ArrayList<BookModel>> findByName(String name);
}
