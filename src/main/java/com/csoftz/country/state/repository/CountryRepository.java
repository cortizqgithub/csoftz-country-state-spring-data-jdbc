package com.csoftz.country.state.repository;

import com.csoftz.country.state.domain.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long> {
}