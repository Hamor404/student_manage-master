package com.stu.manage.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.stu.manage.demo.entity.GradeClass;
import com.stu.manage.demo.entity.Course;
import com.stu.manage.demo.mapper.CourseMapper;
import com.stu.manage.demo.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shr
 */

@Slf4j
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;


    @Override
    public List<Course> getAllCourse() {
        Map<String,Object> map =new HashMap<>(1);
        map.put("is_valid",1);
        return courseMapper.selectByMap(map);
    }

    @Override
    public List<Course> getByExamId(Integer examId) {
        Map<String,Object> map =new HashMap<>(2);
        map.put("is_valid",1);
        map.put("exam_id",examId);
        return courseMapper.selectByMap(map);
    }

    @Override
    public List<Course> getByExamInformation(String examInformation) {
        Map<String,Object> map =new HashMap<>(2);
        map.put("is_valid",1);
        map.put("exam_information",examInformation);
        return courseMapper.selectByMap(map);
    }





    @Override
    public int insertCourse(Course course) {
       return courseMapper.insert(course);
    }

    @Override
    public void updateCourse(Course course) {
        QueryWrapper<Course> updateWrapper= new QueryWrapper<>();
        updateWrapper.eq("is_valid",1);
        updateWrapper.eq("exam_id",course.getExamId());
        courseMapper.update(course,updateWrapper);
    }

    @Override
    public void deleteExam(Integer examId) {
        courseMapper.deleteExam(examId);
    }

    @Override
    public void deleteExamInformation(String examInformation) {
        courseMapper.deleteExamInformation(examInformation);
    }
}