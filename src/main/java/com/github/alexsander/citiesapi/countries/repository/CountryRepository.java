package com.github.alexsander.citiesapi.countries.repository;

import com.github.alexsander.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
