package ru.nsu.g.dnavruzshoev.resume.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.nsu.g.dnavruzshoev.resume.model.EducationInstitution;
import ru.nsu.g.dnavruzshoev.resume.model.Job;
import ru.nsu.g.dnavruzshoev.resume.model.KeySkill;
import ru.nsu.g.dnavruzshoev.resume.model.LanguageSkill;

import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String surname;
    private String firstname;
    private String patronymic;
    private String email;
    private String gender;
    private boolean experience;
    private Date birthday;

    private List<KeySkill> keySkills;
    private List<LanguageSkill> languageSkills;
    private List<Job> jobs;
    private List<EducationInstitution> educationInstitutions;

}
