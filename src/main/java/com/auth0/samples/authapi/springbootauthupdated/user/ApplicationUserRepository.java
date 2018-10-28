package com.auth0.samples.authapi.springbootauthupdated.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author MA Motyim <mohamed.motyim@gmail.com>
 * @see <www.motyim.me>
 * @since 10/28/2018
 */
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}