package com.sinc.shrv.model.vo;

public class CertificateVO {
	private int certificate_id;
	private String certificate_name;
	
	public CertificateVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CertificateVO(int certificate_id, String certificate_name) {
		super();
		this.certificate_id = certificate_id;
		this.certificate_name = certificate_name;
	}

	public int getCertificate_id() {
		return certificate_id;
	}

	public void setCertificate_id(int certificate_id) {
		this.certificate_id = certificate_id;
	}

	public String getCertificate_name() {
		return certificate_name;
	}

	public void setCertificate_name(String certificate_name) {
		this.certificate_name = certificate_name;
	}

	@Override
	public String toString() {
		return "CertificateVO [certificate_id=" + certificate_id + ", certificate_name=" + certificate_name + "]";
	}
}
