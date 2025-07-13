package com.nelioalves.cursomc.resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;


@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@GetMapping
	public String listar() {
	
		return "Rest está funcionando";
	}

	
}
