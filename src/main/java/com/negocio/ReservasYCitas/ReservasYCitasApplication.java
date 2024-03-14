package com.negocio.ReservasYCitas;

import com.negocio.ReservasYCitas.Modelo.Menu;
import com.negocio.ReservasYCitas.Service.CitaService;
import com.negocio.ReservasYCitas.Service.FranjaHorariaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.rmi.MarshalException;

@SpringBootApplication
public class ReservasYCitasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservasYCitasApplication.class, args);
		FranjaHorariaService franjaHorariaService = new FranjaHorariaService();
		CitaService citaService = new CitaService(franjaHorariaService);
		Menu menu = new Menu(citaService, franjaHorariaService);
		menu.ejecutar();
	}

}
