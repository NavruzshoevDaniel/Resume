package ru.nsu.g.dnavruzshoev.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.g.dnavruzshoev.resume.model.LanguageSkill;

@Repository
public interface LanguageSkillRepository extends JpaRepository<LanguageSkill,Long> {
}
