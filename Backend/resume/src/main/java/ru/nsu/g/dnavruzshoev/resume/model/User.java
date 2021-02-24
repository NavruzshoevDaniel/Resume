package ru.nsu.g.dnavruzshoev.resume.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.sql.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Surname is required")
    private String surname;
    @NotEmpty(message = "Firstname is required")
    private String firstname;
    private String patronymic;
    @NotEmpty(message = "Password is required")
    private String password;
    @NotEmpty(message = "Email is required")
    @Email
    private String email;
    @NotEmpty(message = "Gender is required")
    private String gender;
    private boolean experience;
    private Date birthday;

    @ManyToMany
    List<KeySkill> keySkills;

    @ManyToMany
    List<LanguageSkill> languageSkills;

    @ManyToMany
    List<Job> jobs;

    @ManyToMany
    List<EducationInstitution> educationInstitutions;
}
