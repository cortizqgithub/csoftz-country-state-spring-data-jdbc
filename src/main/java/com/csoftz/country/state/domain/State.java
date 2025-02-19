package com.csoftz.country.state.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("STATES")
public record State(@Id Long id,
                    String name,
                    Long countryId) {
}