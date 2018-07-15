package userbooks.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import userbooks.model.BookMark;

/**
 * Created by yjlee on 2018-07-15.
 */
public interface BookMarkRepository extends JpaRepository<BookMark,Long> {
}
