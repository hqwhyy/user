package com.test.hyy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.hyy.dao.TeacherDAO;
import com.test.hyy.pojo.Teacher;
import com.test.hyy.service.api.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDAO teacherDAO;

    @Override
    public void addTeacher(Teacher teacher) {
        teacherDAO.addTeacher(teacher);
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        teacherDAO.updateTeacher(teacher);
    }

    @Override
    public void deleteTeacher(Integer id) {
        teacherDAO.deleteTeacher(id);
    }

    @Override
    public PageInfo<Teacher> getTeacherList(Teacher teacher, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<Teacher>(teacherDAO.getTeacherList(teacher));
    }

    @Override
    public Teacher getTeacherById(Integer id) {
        return teacherDAO.getTeacherById(id);
    }
}
