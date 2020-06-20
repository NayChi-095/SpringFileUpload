package com.isgm.solar.form;

import org.springframework.web.multipart.MultipartFile;

public class MyUploadForm {
	private String description;
	
	//Upload Files
	private MultipartFile[] fileDatas;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile[] getFileDatas() {
		return fileDatas;
	}

	public void setFileDates(MultipartFile[] fileDatas) {
		this.fileDatas = fileDatas;
	}
	
	
}
