package com.sinc.project.shrv.model.vo;

public class GradeVO {
	private int grade_id;
	private String grade_name;

	public GradeVO() {
		super();
	}

	public GradeVO(int grade_id, String grade_name) {
		super();
		this.grade_id = grade_id;
		this.grade_name = grade_name;
	}

	public int getGrade_id() {
		return grade_id;
	}

	public void setGrade_id(int grade_id) {
		this.grade_id = grade_id;
	}
	
	public String getGrade_name() {
		return grade_name;
	}

	public void setGrade_name(String grade_name) {
		this.grade_name = grade_name;
	}

	@Override
	public String toString() {
		return "GradeVO [grade_id=" + grade_id + "]";
	}
}
