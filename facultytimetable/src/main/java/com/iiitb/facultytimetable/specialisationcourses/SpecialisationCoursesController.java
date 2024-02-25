package com.iiitb.facultytimetable.specialisationcourses;

import com.iiitb.facultytimetable.courses.Course;
import com.iiitb.facultytimetable.specialisation.Specialisation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//controller
//API layer
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping(path="/special-course")
public class SpecialisationCoursesController {

}
