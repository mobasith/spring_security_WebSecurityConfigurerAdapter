package springsecurity69.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springsecurity69.demo.model.book;
import springsecurity69.demo.repository.bookrepo;

@Service
public class bookService {

    @Autowired
    bookrepo brepo;

    public book addBook(book b) {
        brepo.save(b);
        return b;
    }

    public List<book> getallbooks() {
        return brepo.findAll();
    }

    public book getBookById(long bookId) {
        Optional<book> newbook = brepo.findById(bookId);
        if (newbook.isPresent()) {
            return newbook.get();
        } else {
            return null;
        }
    }

    public void deleteBook(long bookId) {
        brepo.deleteById(bookId);

    }

}
