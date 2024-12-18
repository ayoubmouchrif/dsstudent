package ma.xproce.dsstudent.service;

import lombok.AllArgsConstructor;
import ma.xproce.dsstudent.dao.entities.Student;
import ma.xproce.dsstudent.dao.repositories.StudentRepository;
import ma.xproce.dsstudent.dto.StudentDTO;
import ma.xproce.dsstudent.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService{
    StudentRepository studentRepository;
    StudentMapper studentMapper;
    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        return studentMapper.fromStudentToStudentDTO(
                studentRepository.save(
                        studentMapper.fromStudentDTOToStudent(studentDTO)
                )
        );
    }

    @Override
    public List<StudentDTO> getStudentByDateNaissance(String date) {
        List<StudentDTO> studentsDTO = new ArrayList<>();
        List<Student> students = studentRepository.getStudentsByBirthdate(date);
        for(Student student:students){
            studentsDTO.add(studentMapper.fromStudentToStudentDTO(student));
        }
        return studentsDTO;
    }
}
