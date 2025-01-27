package org.library.books.subGenres;

import org.library.books.Book;
import org.library.books.Category;
import org.library.books.Status;
import org.library.shareholders.Person;

public class Mystery extends Book {

    public Mystery( Long ISBN, String title, Person author, Integer edition, Status bookStatus, Double price) {
        super(ISBN, title, author, edition, bookStatus, price);
        setCategory(Category.MYSTERY);
    }
}
