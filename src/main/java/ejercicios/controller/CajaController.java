package ejercicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicios.dto.Caja;
import ejercicios.service.ICajaService;
import ejercicios.service.ICajaServiceImpl;

@RestController
@RequestMapping("/caja")
public class CajaController {
	
	@Autowired
    private ICajaServiceImpl cajaService;

    @GetMapping("/list")
    public List<Caja> getAllAlmacenes() {
        return cajaService.listCaja();
    }

    @GetMapping("/{numReferencia}")
    public Caja getAlmacenById(@PathVariable String numReferencia) {
        return cajaService.cajaPorCod(numReferencia);
    }

    @PostMapping
    public Caja saveAlmacen(@RequestBody Caja caja) {
        return cajaService.saveCaja(caja);
    }

    @PutMapping("/{numReferencia}")
    public Caja updateAlmacen(@PathVariable String numReferencia, @RequestBody Caja caja) {
        return cajaService.updateCaja(caja);
    }

    @DeleteMapping("/{numReferencia}")
    public void deleteAlmacen(@PathVariable String numReferencia) {
    	cajaService.deleteCaja(numReferencia);
    }
}