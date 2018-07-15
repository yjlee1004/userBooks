package userbooks.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by yjlee on 2018-07-15.
 */
@Entity
@Table(name="search_word")
@Getter
@Setter
@NoArgsConstructor
public class SearchWord {

    @Id
    @GeneratedValue
    Long no;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_no", referencedColumnName = "no")
    User userNo;

    @Column(name="word" , length = 128 , nullable = false)
    String word;
}
