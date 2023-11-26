package sn.esmt.mp2isi.ecommerce.gateway.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import sn.esmt.mp2isi.ecommerce.gateway.domain.Authority;

/**
 * Spring Data R2DBC repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends R2dbcRepository<Authority, String> {}
