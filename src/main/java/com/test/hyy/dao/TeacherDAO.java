package com.test.hyy.dao;

import com.test.hyy.pojo.Teacher;

import java.util.List;

public interface TeacherDAO {
    void addTeacher(Teacher teacher);

    void updateTeacher(Teacher teacher);

    void deleteTeacher(Integer id);

    List<Teacher> getTeacherList(Teacher teacher);

    Teacher getTeacherById(Integer id);
}
