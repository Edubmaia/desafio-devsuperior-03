package com.ebmaia.desafio03.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationErrorDTO extends CustomErrorDTO{

	private List<FieldMessageDTO> errors = new ArrayList<>();
	
	public ValidationErrorDTO(Instant timeStamp, Integer status, String error, String path) {
		super(timeStamp, status, error, path);
	}

	public List<FieldMessageDTO> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String message) {
		errors.add(new FieldMessageDTO(fieldName, message));
	}
	
}
