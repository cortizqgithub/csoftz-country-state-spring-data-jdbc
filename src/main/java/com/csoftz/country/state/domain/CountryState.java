package com.csoftz.country.state.domain;

public record CountryState(Long countryId,
                           String countryName,
                           Long stateId,
                           String stateName) {
}