package com.sumanthi.spring.repository;

import com.sumanthi.spring.document.Authorities;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthoritiesRepository extends MongoRepository<Authorities, String> {
    public Authorities findByAuthority(String authority);
}

