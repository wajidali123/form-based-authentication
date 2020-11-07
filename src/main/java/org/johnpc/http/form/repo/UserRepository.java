package org.johnpc.http.form.repo;


import org.johnpc.http.form.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("from User u where u.username=:username")
    User findByUsername(String username);
}
