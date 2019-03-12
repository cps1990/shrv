package com.sinc.project.shrv.model.vo;

public class BandVO {
	private int band_id;
	private String band_name;
	
	public BandVO() {
		super();
	}
	
	public BandVO(int band_id, String band_name) {
		super();
		this.band_id = band_id;
		this.band_name = band_name;
	}
	
	public int getBand_id() {
		return band_id;
	}
	
	public void setBand_id(int band_id) {
		this.band_id = band_id;
	}
	
	public String getBand_name() {
		return band_name;
	}
	
	public void setBand_name(String band_name) {
		this.band_name = band_name;
	}
	
	@Override
	public String toString() {
		return "BandVO [band_id=" + band_id + ", band_name=" + band_name + "]";
	}
}
