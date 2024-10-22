package springsecurity69.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springsecurity69.demo.model.user;

public interface userrepo extends JpaRepository<user, String> {

}
