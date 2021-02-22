package ru.nsu.g.dnavruzshoev.resume.service.mapper;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.nsu.g.dnavruzshoev.resume.dto.UserDto;
import ru.nsu.g.dnavruzshoev.resume.model.User;

@Service
public class UserMapper implements IMapper<User, UserDto> {

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public User toEntity(UserDto userDto) {
        return modelMapper.map(userDto, User.class);
    }

    @Override
    public UserDto toDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }
}
