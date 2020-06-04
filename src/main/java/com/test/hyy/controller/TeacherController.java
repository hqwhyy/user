package com.test.hyy.controller;

import com.github.pagehelper.PageInfo;

import com.test.hyy.pojo.Teacher;
import com.test.hyy.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @RequestMapping("add.html")
    public String add(Teacher teacher) {
        teacherService.addTeacher(teacher);
        return "redirect:list.html";
    }
    @RequestMapping("list.html")
    public ModelAndView list(Teacher teacher, Integer pageNum) {
        if (pageNum == null || pageNum < 1) {
            pageNum = 1;
        }
        PageInfo<Teacher> pageInfo = teacherService.getTeacherList(teacher, pageNum, 4);
        return new ModelAndView("list.jsp", "pageInfo", pageInfo);
    }

    @RequestMapping("delete.html")
    public String delete(Integer id) {
        teacherService.deleteTeacher(id);
        return "redirect:list.html";
    }

    @RequestMapping("go_update.html")
    public String goUpdate(Integer id, Model model){
        Teacher teacher=teacherService.getTeacherById(id);
        model.addAttribute("teacher",teacher);
        return "update.jsp";
    }

    @RequestMapping("update.html")
    public String update(Teacher teacher){
        teacherService.updateTeacher(teacher);
        return "redirect:list.html";
    }
}
