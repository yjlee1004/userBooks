package userbooks.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import userbooks.model.User;

import java.util.Optional;

/**
 * Created by yjlee on 2018-07-14.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findOneById(String id);
    Optional<User> findOneByNo(Long no);

}
