package ru.nsu.g.dnavruzshoev.resume.service.mapper;

/**
 * @param <D> Entity
 * @param <E> DTO
 */
public interface IMapper<E, D> {
    E toEntity(D dto);

    D toDto(E entity);
}
