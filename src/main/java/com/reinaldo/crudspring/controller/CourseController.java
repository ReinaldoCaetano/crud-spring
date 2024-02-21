package com.reinaldo.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reinaldo.crudspring.model.Course;
import com.reinaldo.crudspring.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    
    private final CourseRepository courseRepository;


    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }



    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Course> list(){
        return courseRepository.findAll() ;
    }
    
}
