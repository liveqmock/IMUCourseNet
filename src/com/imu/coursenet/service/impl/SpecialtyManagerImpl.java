package com.imu.coursenet.service.impl;

import java.util.List;


import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.*;
import com.imu.coursenet.service.*;

public class SpecialtyManagerImpl implements SpecialtyManager{
	private AdminDao adminDao;
	private TeacherDao teacherDao;
	private StudentDao studentDao;
	private DepartmentDao departmentDao;
	private SpecialtyDao specialtyDao;
	@Override
	public List<Specialty> listAllSpecialty() {
		return specialtyDao.findAll();
	}
	@Override
	public int addSpecialty(Specialty specialty) {
		return specialtyDao.save(specialty);
	}
	@Override
	public int deleteSpecialty(int specialtyId) {
		specialtyDao.delete(specialtyId);
		return this.OP_SUCC;
	}
	@Override
	public int updateSpecialty(Specialty specialty) {
		specialtyDao.update(specialty);
		return this.OP_SUCC;
	}
	@Override
	public Specialty getSpecialty(int specialtyId) {
		return specialtyDao.get(specialtyId);
	}
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	public void setSpecialtyDao(SpecialtyDao specialtyDao) {
		this.specialtyDao = specialtyDao;
	}
	
	
	
}
