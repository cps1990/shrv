package com.sinc.project.shrv.model.vo;

public class TeamVO {
	private int dept_id, team_id;
	private String team_name;
	
	public TeamVO() {
		super();
	}

	public TeamVO(int dept_id, int team_id, String team_name) {
		super();
		this.dept_id = dept_id;
		this.team_id = team_id;
		this.team_name = team_name;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	@Override
	public String toString() {
		return "TeamVO [dept_id=" + dept_id + ", team_id=" + team_id + ", team_name=" + team_name + "]";
	}
}
