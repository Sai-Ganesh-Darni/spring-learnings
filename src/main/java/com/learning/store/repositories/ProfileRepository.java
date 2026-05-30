package com.learning.store.repositories;

import com.learning.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository <Profile, Long> {
}
