package com.qa.LBG_Spring_1.repos;

import com.qa.LBG_Spring_1.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository <Person, Integer> {
}
