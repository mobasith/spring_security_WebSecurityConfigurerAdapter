package springsecurity69.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import springsecurity69.demo.model.book;
import springsecurity69.demo.service.bookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("api/v1/")
public class bookController {
    @Autowired
    bookService service;

    @PostMapping("/admin")
    public ResponseEntity<book> addBook(@RequestBody book b) {
        // return new ResponseEntity<>(service.addBook(b), HttpStatus.OK);
        return ResponseEntity.ok(service.addBook(b));
    }

    @GetMapping("/books")
    public List<book> getallbooks() {
        return service.getallbooks();
    }

    // @PostMapping("/issue-book")
    // public ResponseEntity<issue> addBook(@RequestBody issue issue) {

    // user user=userser.find

    // }

}
