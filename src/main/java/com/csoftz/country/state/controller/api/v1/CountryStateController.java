package com.csoftz.country.state.controller.api.v1;

import com.csoftz.country.state.domain.CountryState;
import com.csoftz.country.state.service.CountryStateService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public record CountryStateController(CountryStateService countryStateService) {
    @GetMapping("/country-states")
    public List<CountryState> getCountryStates() {
        return countryStateService.findCountryStates();
    }
}
