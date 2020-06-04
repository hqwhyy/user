package com.test.hyy.service.api;

import com.github.pagehelper.PageInfo;
import com.test.hyy.pojo.Teacher;

public interface TeacherService {
    void addTeacher(Teacher teacher);

    void updateTeacher(Teacher teacher);

    void deleteTeacher(Integer id);

    //分页查询
    PageInfo<Teacher> getTeacherList(Teacher teacher, int pageNum, int pageSize);

    Teacher getTeacherById(Integer id);
}
