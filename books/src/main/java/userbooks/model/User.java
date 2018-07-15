package userbooks.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by yjlee on 2018-07-08.
 */

@Entity
@Table(name="user")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    Long no;

    @Column(name="id" , length = 20 , nullable = false)
    String id;

    @Column(name = "password" , length = 20 ,nullable = false)
    String password;

    @Column(name = "name" , length = 10 , nullable = false)
    String name;

    public User(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }
}
