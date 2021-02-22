package ru.nsu.g.dnavruzshoev.resume.dto;

import lombok.Data;
import lombok.NonNull;
import ru.nsu.g.dnavruzshoev.resume.model.EducationInstitution;
import ru.nsu.g.dnavruzshoev.resume.model.Job;
import ru.nsu.g.dnavruzshoev.resume.model.KeySkill;
import ru.nsu.g.dnavruzshoev.resume.model.LanguageSkill;

import java.sql.Date;
import java.util.List;

@Data
public class UserDto {

    private final Long id;
    private final String surname;
    private final String firstname;
    private final String patronymic;
    private final String email;
    private final String gender;
    private final boolean experience;
    private final Date birthday;

    private final List<KeySkill> keySkills;
    private final List<LanguageSkill> languageSkills;
    private final List<Job> jobs;
    private final List<EducationInstitution> educationInstitutions;
}
