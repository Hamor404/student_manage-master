package com.stu.manage.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 课程
 *
 * @author shr
 */

@Data
public class Course {

    private Integer examId;
    @NotNull
    private String examInformation;
    @NotNull
    private Integer id;
    @NotNull
    private float studyTime;
    @NotNull
    private float studyScore;


}