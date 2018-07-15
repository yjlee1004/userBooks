package userbooks.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by yjlee on 2018-07-15.
 */

@Entity
@Table(name="book_mark")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookMark {

    @Id
    @GeneratedValue
    Long no;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_no", referencedColumnName = "no" , nullable = false)
    User userNo;

    @Column(name = "url" , length = 128 , nullable = false)
    String url;

    @Column(name = "name" , length = 128 , nullable = false)
    String name;




}
