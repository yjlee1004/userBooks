package userbooks.service.user;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import userbooks.dao.UserRepository;
import userbooks.dto.UserDto;
import userbooks.dto.UserJoinDto;
import userbooks.model.User;
import userbooks.service.search.UserJoinException;

/**
 * Created by yjlee on 2018-07-15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void join(UserJoinDto userJoinDto) {
        if( userRepository.findOneById(userJoinDto.getId()).isPresent() ){
            throw new UserJoinException("id duplicate error , req id : " + userJoinDto.getId());
        }

        User user = modelMapper.map(userJoinDto,User.class);
        userRepository.save(user);
    }

    @Override
    public UserDto getByUserno(Long userNo) {
        User user = userRepository.findOneByNo(userNo).orElseThrow( () -> new UserException("user not found exception userNo :" + userNo));
        return modelMapper.map(user,UserDto.class);
    }

    @Override
    public UserDto getById(String id) {
        if(id == null || id.isEmpty()) throw new IllegalArgumentException("id should be not null or empty");
        User user = userRepository.findOneById(id).orElseThrow( () -> new UserException("user not found exception id :" + id));
        return modelMapper.map(user,UserDto.class);
    }
}
