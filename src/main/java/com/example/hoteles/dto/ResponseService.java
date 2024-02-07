package com.example.hoteles.dto;

import org.springframework.stereotype.Component;

@Component
public class ResponseService {

	

	private String codeRespon = "";

	private String message = "";

	private Object answer = null;


	public ResponseService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseService(String codeRespon, String message, Object answer) {
		super();
		this.codeRespon = codeRespon;
		this.message = message;
		this.answer = answer;
	}
	public String getCodeRespon() {
		return codeRespon;
	}

	public void setCodeRespon(String codeRespon) {
		this.codeRespon = codeRespon;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getAnswer() {
		return answer;
	}

	public void setAnswer(Object answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "RespuestaServicio [codeRespon=" + codeRespon + ", message=" + message + ", answer=" + answer + "]";
	}
}
