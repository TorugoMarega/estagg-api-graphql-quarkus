package br.com.estagg.service;

import br.com.estagg.model.Course;
import br.com.estagg.model.University;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CollegeService {


    public List<Course> listAllCourses(){
        return Course.listAll();
    }

    @Transactional
    public Course createCourse(Course course){

        Course checkCourse = Course.findByName(course.getName());
        if (checkCourse != course || checkCourse == null){
            course.persist();
        }
        University checkUniversity = University.findById(course.getUniversity().id);
        course.setUniversity(checkUniversity);
        return course;
    }

    public List<University> listAllUniversities(){
        return University.listAll();
    }

    @Transactional
    public  University createUniversity(University university){
        university.persist();
        return university;
    }

    public Course findByName(Course course){
        return Course.findByName(course.getName());
    }
}
