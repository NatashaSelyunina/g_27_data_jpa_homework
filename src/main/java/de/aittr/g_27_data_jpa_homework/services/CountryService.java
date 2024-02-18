package de.aittr.g_27_data_jpa_homework.services;

import de.aittr.g_27_data_jpa_homework.domain.Country;
import de.aittr.g_27_data_jpa_homework.repositories.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private CountryRepository repository;

    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }

    public List<Country> getAll() {
        return repository.findAll();
    }
}