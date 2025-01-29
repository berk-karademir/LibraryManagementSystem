package main.library.books.subGenres;

import main.library.books.Book;
import main.library.books.Category;
import main.library.books.Status;
import main.library.shareholders.Author;
import main.library.shareholders.Person;

public class Play extends Book {
    public Play(Long ISBN, String title, Author author, Integer edition, Status bookStatus, Double price) {
        super(ISBN, title, author, edition, bookStatus, price);
        setCategory(Category.PLAY);
    }
}
