package com.csoftz.country.state.repository;

import com.csoftz.country.state.domain.State;
import org.springframework.data.repository.CrudRepository;

public interface StateRepository extends CrudRepository<State, Long> {
}
