package ru.nsu.g.dnavruzshoev.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.g.dnavruzshoev.resume.dto.UserDto;
import ru.nsu.g.dnavruzshoev.resume.repository.UserRepository;
import ru.nsu.g.dnavruzshoev.resume.service.mapper.UserMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public void save(UserDto userDto) {
        userRepository.save(userMapper.toEntity(userDto));
    }

    public List<UserDto> listAll() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }

    public Optional<UserDto> get(Long id) {
        return userRepository.findById(id)
                .map(userMapper::toDto);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}
