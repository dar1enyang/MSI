package com.mercury.SpringBootRestDemo.daos;

import com.mercury.SpringBootRestDemo.beans.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoDao extends JpaRepository<UserInfo, Integer> {
}
