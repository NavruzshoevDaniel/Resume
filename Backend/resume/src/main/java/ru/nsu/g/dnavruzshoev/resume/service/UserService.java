package ru.nsu.g.dnavruzshoev.resume.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ru.nsu.g.dnavruzshoev.resume.dto.UserDto;
import ru.nsu.g.dnavruzshoev.resume.repository.UserRepository;
import ru.nsu.g.dnavruzshoev.resume.service.mapper.UserModelMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
@CacheConfig(cacheNames = "user")
public class UserService {
    private final UserRepository userRepository;
    private final UserModelMapper userModelMapper;

    @Autowired
    public UserService(UserRepository userRepository, UserModelMapper userModelMapper) {
        this.userRepository = userRepository;
        this.userModelMapper = userModelMapper;
    }

    @CachePut
    public void save(UserDto userDto) {
        log.info("Save: {}", userDto);
        userRepository.save(userModelMapper.toEntity(userDto));
    }

    public List<UserDto> listAll() {
        return userRepository.findAll()
                .stream()
                .map(userModelMapper::toDto)
                .collect(Collectors.toList());
    }

    @Cacheable
    public Optional<UserDto> get(Long id) {
        log.info("Get user with id: {}", id);
        return userRepository.findById(id)
                .map(userModelMapper::toDto);
    }

    @CacheEvict
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}
