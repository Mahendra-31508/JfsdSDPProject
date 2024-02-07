package com.klef.Rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Integer> {
    
    RegistrationEntity findByUsernameAndPassword(String username, String password);
}
