package userbooks.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import userbooks.model.User;
import userbooks.test.TestEnv;

import javax.persistence.Table;

import static org.junit.Assert.*;

/**
 * Created by yjlee on 2018-07-15.
 */

@RunWith(SpringRunner.class)
@DataJpaTest
public class SearchHistoryRepositoryTest {


    @Autowired
    SearchHistoryRepository searchHistoryRepository;

    @Autowired
    UserRepository userRepository;

    @Test
    public void given_whenFindTop10ByUserNoOrderByNoDesc_thenEmptyList(){

        User user = userRepository.save(new User("yjlee","password","yj"));
        searchHistoryRepository.findTop10ByUserNoOrderByNoDesc(user);

    }

}