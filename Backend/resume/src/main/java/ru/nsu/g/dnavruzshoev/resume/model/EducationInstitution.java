package ru.nsu.g.dnavruzshoev.resume.model;

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
public class EducationInstitution {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    private List<User> users;
    private String levelEducation;
    private String faculty;
    private String specialization;
    @Temporal(TemporalType.DATE)
    private Date endDate;
}
