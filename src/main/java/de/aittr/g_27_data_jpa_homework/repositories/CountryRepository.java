package de.aittr.g_27_data_jpa_homework.repositories;

import de.aittr.g_27_data_jpa_homework.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}