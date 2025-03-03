package co.com.sofka.catalog.repository;

import co.com.sofka.catalog.entity.Course;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
    List<Course> findByNameContaining (String name);
    List<Course> findByCoachContaining (String coach);
    List<Course> findByLevel (Integer level);
}
