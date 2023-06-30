package com.fztest1.fztest1.controllers;

import com.fztest1.fztest1.dto.SAMLResponseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Base64;


@RestController
public class fztest1ApplicationController {


	@PostMapping("/saml/callback")
	public void samlCallback(@RequestBody SAMLResponseDto samlResponseDto, HttpServletRequest request) {
		// Decodificar o SAMLResponse
		byte[] samlResponseBytes = Base64.getDecoder().decode(samlResponseDto.getSamlResponse());
		String samlResponseXml = new String(samlResponseBytes);
		System.out.println(samlResponseXml);

	}
}




