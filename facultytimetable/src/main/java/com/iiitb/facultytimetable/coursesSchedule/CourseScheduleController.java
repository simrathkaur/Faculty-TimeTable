package com.iiitb.facultytimetable.coursesSchedule;

import com.iiitb.facultytimetable.courses.Course;
import com.iiitb.facultytimetable.courses.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.iiitb.facultytimetable.courses.Course.*;
import java.util.List;
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping(path = "/courseschedule")
public class CourseScheduleController {
    private final CourseScheduleService courseScheduleService;

    @Autowired
    public CourseScheduleController(CourseScheduleService courseScheduleService) {
        this.courseScheduleService = courseScheduleService;
    }
    @GetMapping
    public List<CourseSchedule> getCourse(){return courseScheduleService.getCourse();}
    @PostMapping
    public  void registerNewCourseSchedule(@RequestBody CourseSchedule courseSchedule){
        courseScheduleService.addNewCourseSchedule(courseSchedule);
    }
    @GetMapping(path = "/course/{input}")
    public ResponseEntity<List<Object>> quesionone(@PathVariable Integer input){
        return new ResponseEntity<>(courseScheduleService.getCourseName(input), HttpStatus.OK);
    }
}
