package ma.xproce.dsstudent.dao.repositories;

import ma.xproce.dsstudent.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,String> {
    List<Student> getStudentsByBirthdate(String date);
}
