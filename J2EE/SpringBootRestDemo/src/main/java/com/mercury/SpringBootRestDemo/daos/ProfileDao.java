package com.mercury.SpringBootRestDemo.daos;

import com.mercury.SpringBootRestDemo.beans.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileDao extends JpaRepository<Profile, Integer> {
}
