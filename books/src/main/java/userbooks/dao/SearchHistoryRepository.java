package userbooks.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import userbooks.model.SearchWord;
import userbooks.model.User;

import java.util.List;

/**
 * Created by yjlee on 2018-07-15.
 */
public interface SearchHistoryRepository extends JpaRepository<SearchWord,Long> {

    List<SearchWord> findTop10ByUserNoOrderByNoDesc(User user);
}
