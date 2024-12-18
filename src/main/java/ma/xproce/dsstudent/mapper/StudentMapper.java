package ma.xproce.dsstudent.mapper;

import ma.xproce.dsstudent.dao.entities.Student;
import ma.xproce.dsstudent.dto.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    ModelMapper modelMapper = new ModelMapper();

    public Student fromStudentDTOToStudent(StudentDTO studentDTO){
        return modelMapper.map(studentDTO, Student.class);
    }

    public StudentDTO fromStudentToStudentDTO(Student student){
        return modelMapper.map(student, StudentDTO.class);
    }
}
