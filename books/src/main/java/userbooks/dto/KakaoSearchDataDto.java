package userbooks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Pageable;

/**
 * Created by yjlee on 2018-07-14.
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class KakaoSearchDataDto {

    String searchWord;
    Pageable pageable;
}
