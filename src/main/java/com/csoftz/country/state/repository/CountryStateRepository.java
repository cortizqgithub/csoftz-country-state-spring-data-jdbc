package com.csoftz.country.state.repository;

import com.csoftz.country.state.domain.Country;
import com.csoftz.country.state.domain.CountryState;
import java.util.List;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface CountryStateRepository extends CrudRepository<CountryState, Long> {

    @Query("""
        SELECT c.id AS countryId, c.name AS countryName, s.id AS stateId, s.name AS stateName 
        FROM COUNTRIES c 
        JOIN STATES s ON c.id = s.country_id
        """)
    List<CountryState> findCountryStates();
}
