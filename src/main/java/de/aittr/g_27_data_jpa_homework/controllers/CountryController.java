package de.aittr.g_27_data_jpa_homework.controllers;

import de.aittr.g_27_data_jpa_homework.domain.Country;
import de.aittr.g_27_data_jpa_homework.services.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {
    private CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Country> getAll() {
        return service.getAll();
    }
}