package com.sinc.project.shrv.model.vo;

public class EmployeeCertificateVO {
	private int certificate_id, emp_id;
	private String date;
	
	public EmployeeCertificateVO() {
		super();
	}

	public EmployeeCertificateVO(int certificate_id, int emp_id, String date) {
		super();
		this.certificate_id = certificate_id;
		this.emp_id = emp_id;
		this.date = date;
	}

	public int getCertificate_id() {
		return certificate_id;
	}

	public void setCertificate_id(int certificate_id) {
		this.certificate_id = certificate_id;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "EmployeeCertificateVO [certificate_id=" + certificate_id + ", emp_id=" + emp_id + ", date=" + date
				+ "]";
	}
}
