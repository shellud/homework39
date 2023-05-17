package com.ua.robot.service;

import com.ua.robot.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    public List<Student> findAll(){
        return List.of(new Student(1, "Robson", 20, "SPU"),
                new Student(2, "Bibson", 18, "NTU"),
                new Student(3, "Gibson", 22, "TNT"),
                new Student(4, "Thomson", 21, "GPD"));
    }

    public Optional<Student> findById(int id){
        return Optional.of(new Student(2, "Ronson", 25, "GSM"));
    }

    public void save(Student student){
        System.out.println(student);
    }
}