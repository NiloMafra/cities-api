package com.github.nilomafra.citiesapi.countries;

import com.github.nilomafra.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
