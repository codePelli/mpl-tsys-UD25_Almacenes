package ejercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicios.service.ICajaService;

@RestController
@RequestMapping("/cajas")
public class CajaController {
	
	@Autowired
	private ICajaService cajaService;

}
