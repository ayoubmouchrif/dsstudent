package ma.xproce.dsstudent.service;

import ma.xproce.dsstudent.dto.StudentDTO;

import java.util.Date;
import java.util.List;

public interface StudentService {
    StudentDTO saveStudent(StudentDTO studentDTO);
    List<StudentDTO> getStudentByDateNaissance(String date);

}
