package br.com.estagg.resource;

import br.com.estagg.model.Course;
import br.com.estagg.model.University;
import br.com.estagg.service.CollegeService;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class CollegeResource {
    @Inject
    CollegeService service;

    @Mutation
    public Course createCourse(Course course){
        return service.createCourse(course) ;
    }

    @Query
    public List<Course> listAllCourses(){
        return service.listAllCourses();
    }

    @Mutation
    public University createUniversity(University university){
        return this.service.createUniversity(university);
    }

    @Query
    public List<University> listAllUniversities(){
        return service.listAllUniversities();
    }


}
