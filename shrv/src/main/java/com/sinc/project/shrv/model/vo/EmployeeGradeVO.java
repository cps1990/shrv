package com.sinc.project.shrv.model.vo;

public class EmployeeGradeVO {
	private int emp_id, grade_id;
	private String date;
	
	public EmployeeGradeVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeGradeVO(int emp_id, int grade_id, String date) {
		super();
		this.emp_id = emp_id;
		this.grade_id = grade_id;
		this.date = date;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getGrade_id() {
		return grade_id;
	}

	public void setGrade_id(int grade_id) {
		this.grade_id = grade_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "EmployeeGradeVO [emp_id=" + emp_id + ", grade_id=" + grade_id + ", date=" + date + "]";
	}
}
