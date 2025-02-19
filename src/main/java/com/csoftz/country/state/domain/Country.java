package com.csoftz.country.state.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("COUNTRIES")
public record Country(@Id Long id, String name) {
}