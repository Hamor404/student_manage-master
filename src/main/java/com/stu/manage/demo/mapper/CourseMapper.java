package com.stu.manage.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stu.manage.demo.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


/**
 * @author shr
 */

@Component
@Mapper
public interface CourseMapper extends BaseMapper<Course> {

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


//    /**
//     * 通过成绩编码查询成绩
//     *
//     * @param examId
//     * @return List<Course>
//     */
//    List<Course> getByExamId(Integer examId);
//
//    /**
//     * 通过学生id查询成绩
//     *
//     * @param examInformation
//     * @return List<Course>
//     */
//    List<Course> getByExamInformation(String examInformation);
//
//    /**
//     * 查询所有成绩
//     *
//     * @return List<Course>
//     */
//    List<Course> getAllCourse();
//
//    /**
//     * 删除
//     *
//     * @param examId
//     * @param examInformation
//     */
//    void deleteEs(Integer examId, String examInformation);
//    /**
//     * 更新
//     *
//     * @param course
//     */
//    void updateCourse(Course course);




}