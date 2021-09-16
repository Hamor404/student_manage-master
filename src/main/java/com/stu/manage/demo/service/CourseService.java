package com.stu.manage.demo.service;

import com.stu.manage.demo.entity.GradeClass;
import com.stu.manage.demo.entity.Course;

import java.util.List;

/**
 * @author shr
 */

public interface CourseService {

    /**
     * 查询所有课程
     *
     * @return List<Course>
     */
     List<Course> getAllCourse();

    /**
     * 查询
     *
     * @param examId
     * @return List<Course>
     */
     List<Course> getByExamId(Integer examId);

    /**
     * 通过学号查询成绩
     *
     * @param examInformation
     * @return List<Course>
     */
     List<Course> getByExamInformation(String examInformation);





    /**
     * 插入
     *
     * @param course
     * @return int
     */
     int insertCourse(Course course);

    /**
     * 更新成绩
     *
     * @param course
     */
     void updateCourse(Course course);



    /**
     * 删除
     *
     * @param examId
     */
     void deleteExam(Integer examId);

    /**
     * 删除
     *
     * @param examInformation
     */
     void deleteExamInformation(String examInformation);

}