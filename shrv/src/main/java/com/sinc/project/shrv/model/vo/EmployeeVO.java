package com.sinc.project.shrv.model.vo;

public class EmployeeVO {
	private int emp_id, salary, team_id, band_id, grade_id;
	private String emp_name, hire_date, phone, email, work_state;
	
	public EmployeeVO() {
		super();
	}

	public EmployeeVO(int emp_id, int salary, int team_id, int band_id, int grade_id, String emp_name, String hire_date,
			String phone, String email, String work_state) {
		super();
		this.emp_id = emp_id;
		this.salary = salary;
		this.team_id = team_id;
		this.band_id = band_id;
		this.grade_id = grade_id;
		this.emp_name = emp_name;
		this.hire_date = hire_date;
		this.phone = phone;
		this.email = email;
		this.work_state = work_state;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public int getBand_id() {
		return band_id;
	}

	public void setBand_id(int band_id) {
		this.band_id = band_id;
	}

	public int getGrade_id() {
		return grade_id;
	}

	public void setGrade_id(int grade_id) {
		this.grade_id = grade_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getHire_date() {
		return hire_date;
	}

	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWork_state() {
		return work_state;
	}

	public void setWork_state(String work_state) {
		this.work_state = work_state;
	}

	@Override
	public String toString() {
		return "EmployeeVO [emp_id=" + emp_id + ", salary=" + salary + ", team_id=" + team_id + ", band_id=" + band_id
				+ ", grade_id=" + grade_id + ", emp_name=" + emp_name + ", hire_date=" + hire_date + ", phone=" + phone
				+ ", email=" + email + ", work_state=" + work_state + "]";
	}
}
