package com.stu.manage.demo.controller;
import com.stu.manage.demo.entity.Course;
import com.stu.manage.demo.result.Result;
import com.stu.manage.demo.result.ResultEnum;
import com.stu.manage.demo.result.ResultUtil;
import com.stu.manage.demo.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shr
 */


@Slf4j
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;



    @GetMapping("/get/all")
    public Result allCourse(){

        List<Course> res =courseService.getAllCourse();
        if(!res.isEmpty()) {
            return ResultUtil.success(res);
        }else {
            return ResultUtil.error(ResultEnum.DATA_IS_NULL.getCode(),ResultEnum.DATA_IS_NULL.getMsg());
        }
    }

    @GetMapping("/get/examid/{examID}")
    public Result byExamId(@PathVariable("examID")Integer examId){
        List<Course> res = courseService.getByExamId(examId);
        if(!res.isEmpty()) {
            return ResultUtil.success(res);
        }else {
            return ResultUtil.error(ResultEnum.DATA_IS_NULL.getCode(),ResultEnum.DATA_IS_NULL.getMsg());
        }
    }

    @GetMapping("get/examinformation/{examInformation}")
    public Result byExamInformation(@PathVariable("examInformation")String examInformation){
        List<Course> res = courseService.getByExamInformation(examInformation);
        if(!res.isEmpty()) {
            return ResultUtil.success(res);
        }else {
            return ResultUtil.error(ResultEnum.DATA_IS_NULL.getCode(),ResultEnum.DATA_IS_NULL.getMsg());
        }
    }




    @PostMapping("/insert")
    public Result insert(@RequestBody @Valid Course course){

        int res= courseService.insertCourse(course);
        if(res==1){
            return ResultUtil.success(res);
        }else {
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(),ResultEnum.UNKNOWN_ERROR.getMsg());
        }

    }

    @PostMapping("/update")
    public Result update(@RequestBody @Valid  Course course){
        courseService.updateCourse(course);
        List<Course> res=new ArrayList<>();
        res.add(course);
        if(res.equals(courseService.getByExamId(course.getExamId()))){
            return ResultUtil.success();
        }else {
            return ResultUtil.error(ResultEnum.UPDATE_FAIL.getCode(),ResultEnum.UPDATE_FAIL.getMsg());
        }
    }


    @DeleteMapping("delete/examid/{examID}")
    public void deleteExam(@PathVariable("examID")Integer examId){
        courseService.deleteExam(examId);
    }


    @DeleteMapping("delete/examinformation/{examInformation}")
    public Result deleteExamInformation(@PathVariable("examInformation")String examInformation){
        courseService.deleteExamInformation(examInformation);
        List<Course> res=courseService.getByExamInformation(examInformation);
        if(res.isEmpty()){
            return ResultUtil.success(res);
        }else {
            return ResultUtil.error(ResultEnum.DELETE_FAIL.getCode(),ResultEnum.DELETE_FAIL.getMsg());
        }
    }
}