package ru.nsu.g.dnavruzshoev.resume.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LanguageSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String language;
    private boolean isMotherTongue;
    @ManyToMany
    private List<User> users;
}
