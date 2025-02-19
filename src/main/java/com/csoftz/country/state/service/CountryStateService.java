package com.csoftz.country.state.service;

import com.csoftz.country.state.domain.CountryState;
import com.csoftz.country.state.repository.CountryStateRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public record CountryStateService(CountryStateRepository countryStateRepository) {

    public List<CountryState> findCountryStates() {
        return countryStateRepository.findCountryStates();
    }
}