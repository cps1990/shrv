package com.sinc.shrv.model.vo;

public class GradeVO {
	private int grade_id;

	public GradeVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GradeVO(int grade_id) {
		super();
		this.grade_id = grade_id;
	}

	public int getGrade_id() {
		return grade_id;
	}

	public void setGrade_id(int grade_id) {
		this.grade_id = grade_id;
	}

	@Override
	public String toString() {
		return "GradeVO [grade_id=" + grade_id + "]";
	}
}
