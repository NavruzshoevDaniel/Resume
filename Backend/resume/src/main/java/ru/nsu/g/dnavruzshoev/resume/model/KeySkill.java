package ru.nsu.g.dnavruzshoev.resume.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class KeySkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String skillName;
    @ManyToMany
    private List<User> users;
}
