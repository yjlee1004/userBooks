package userbooks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.NamedEntityGraph;

/**
 * Created by yjlee on 2018-07-15.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSession {

    Long no;
    String id;
    String name;



}
