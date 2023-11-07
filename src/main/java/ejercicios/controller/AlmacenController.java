package ejercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicios.service.IAlmacenService;

@RestController
@RequestMapping("/almacenes")
public class AlmacenController {

	@Autowired
	private IAlmacenService almacenService;
}
