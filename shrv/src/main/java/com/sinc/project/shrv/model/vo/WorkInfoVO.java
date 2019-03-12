package com.sinc.project.shrv.model.vo;

public class WorkInfoVO {
	private int emp_id;
	private String date, start_time, end_time, add_time, total_time;
	
	public WorkInfoVO() {
		super();
	}

	public WorkInfoVO(int emp_id, String date, String start_time, String end_time, String add_time, String total_time) {
		super();
		this.emp_id = emp_id;
		this.date = date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.add_time = add_time;
		this.total_time = total_time;
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

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getAdd_time() {
		return add_time;
	}

	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}

	public String getTotal_time() {
		return total_time;
	}

	public void setTotal_time(String total_time) {
		this.total_time = total_time;
	}

	@Override
	public String toString() {
		return "WorkInfoVO [emp_id=" + emp_id + ", date=" + date + ", start_time=" + start_time + ", end_time="
				+ end_time + ", add_time=" + add_time + ", total_time=" + total_time + "]";
	}
}
