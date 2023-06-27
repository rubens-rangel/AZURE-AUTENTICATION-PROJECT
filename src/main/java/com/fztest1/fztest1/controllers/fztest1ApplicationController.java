package com.fztest1.fztest1.controllers;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fztest1ApplicationController {

//	private static final Logger LOGGER = LoggerFactory.getLogger(AuthADCallback.class);

	@PostMapping("/saml/sso")
	public String samlSSO(@RequestBody MultiValueMap<String, String> paramMap) {

//		if(authentication != null) {
//			if (LOGGER.isDebugEnabled()) {
//			}
//			LOGGER.info("Auth Name: {}", authentication.getName());
//			LOGGER.info("Auth Credentials: {}", authentication.getCredentials());
//			LOGGER.info("Auth Principal: {}", authentication.getPrincipal());
//		}
//		if (samlResponse != null && !samlResponse.isEmpty()) {
//			// Decodificar o token SAMLResponse e extrair informações relevantes
//			// Realizar validações e lógica de negócio necessárias
//			// Redirecionar para a página principal ou rota desejada
//			LOGGER.debug("Token Recebido do AD {}", samlResponse);
//			return "token";
//		} else {
//			// Tratar caso o token de autorização não seja válido ou esteja ausente
//			LOGGER.debug("Token Recebido do AD com erro {}", samlResponse);
//			return "Erro";
//		}
//	}
		for (int i = 0; i < paramMap.size(); i ++){
			System.out.println("value" + paramMap  );
		}

		return "recebido";
	}
}
