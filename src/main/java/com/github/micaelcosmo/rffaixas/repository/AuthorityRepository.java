package com.github.micaelcosmo.rffaixas.repository;

import com.github.micaelcosmo.rffaixas.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
