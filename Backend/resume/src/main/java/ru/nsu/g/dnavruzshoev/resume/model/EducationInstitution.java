package ru.nsu.g.dnavruzshoev.resume.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EducationInstitution {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    private List<User> users;
    private String levelEducation;
    private String faculty;
    private String specialization;
    private Date endDate;
    private Date startDate;
}
