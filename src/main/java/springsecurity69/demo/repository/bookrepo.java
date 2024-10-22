package springsecurity69.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springsecurity69.demo.model.book;

public interface bookrepo extends JpaRepository<book, Long> {

}
