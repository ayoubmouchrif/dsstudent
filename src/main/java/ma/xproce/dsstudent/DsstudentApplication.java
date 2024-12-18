package ma.xproce.dsstudent;

import ma.xproce.dsstudent.dto.StudentDTO;
import ma.xproce.dsstudent.service.StudentManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DsstudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsstudentApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StudentManager studentManager){
        return args -> {
            List<StudentDTO> studentsDTO = List.of(
                    StudentDTO.builder().name("Ahmed").email("ahmed@gmail.com").birthdate("12/12/2000").build(),
                    StudentDTO.builder().name("Adam").email("adam@gmail.com").birthdate("01/02/2001").build(),
                    StudentDTO.builder().name("Khalid").email("khalid@gmail.com").birthdate("23/06/2002").build(),
                    StudentDTO.builder().name("Amine").email("amine@gmail.com").birthdate("14/10/2003").build()
            );
            for(StudentDTO studentDTO:studentsDTO){
                studentManager.saveStudent(studentDTO);
            }
        };
    }
}
