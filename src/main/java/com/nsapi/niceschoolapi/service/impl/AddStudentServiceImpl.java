package com.nsapi.niceschoolapi.service.impl;

import com.nsapi.niceschoolapi.entity.CourseDB;
import com.nsapi.niceschoolapi.entity.StudentDB;
import com.nsapi.niceschoolapi.entity.StudentVO;
import com.nsapi.niceschoolapi.mapper.AddStudentMapper;
import com.nsapi.niceschoolapi.service.AddStudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class AddStudentServiceImpl implements AddStudentService {
    @Resource
    private AddStudentMapper addStudentMapper;


    //  根据前台传来信息添加学生
    @Override
    public Integer addStudent(StudentVO studentVO) {
        return addStudentMapper.addStudent(studentVO);
    }

    //  根据学生专业查询该专业开设的必修课程
    @Override
    public List<CourseDB> selCourse(Integer mid) {
        return addStudentMapper.selCourse(mid);
    }

    //  根据学号查询学生id编号
    @Override
    public Integer selectSid(String stuid) {
        return addStudentMapper.selectSid(stuid);
    }

    //  将学生id以及必修课程的id添加至学生选课表
    @Override
    public Integer addStuCourse(Integer sid, Integer cid) {
        return addStudentMapper.addStuCourse(sid,cid);
    }

    //  生成学生学号
    @Override
    public String selStuid(Integer gid) {
        return addStudentMapper.selStuid(gid);
    }

    @Override
    public String selStuid2() {
        return addStudentMapper.selStuid2();
    }

    //  班级人数+1
    @Override
    public Integer selecteClassinfo(Integer classid) {
        return addStudentMapper.selecteClassinfo(classid);
    }

    //  年级人数+1
    @Override
    public Integer selecteGrade(Integer gid) {
        return addStudentMapper.selecteGrade(gid);
    }

    //  专业人数+1
    @Override
    public Integer selecteMajor(Integer mid) {
        return addStudentMapper.selecteMajor(mid);
    }

    //  系部人数+1
    @Override
    public Integer selecteDepartment(Integer did) {
        return addStudentMapper.selecteDepartment(did);
    }


    //  判断该年份是否已存在学生
    @Override
    public Integer selectStuYear(Integer classid) {
        return addStudentMapper.selectStuYear(classid);
    }

    //  若该年份学生为空时 则添加一条分割线
    @Override
    public Integer stuSegmentation(Integer classid) {
        return addStudentMapper.stuSegmentation(classid);
    }

    //  根据学号查询信息
    @Override
    public List<StudentDB> selectMessage(String stuid) {
        return addStudentMapper.selectMessage(stuid);
    }

    //  查询sys_role角色id
    @Override
    public String selectRole() {
        return addStudentMapper.selectRole();
    }


}
