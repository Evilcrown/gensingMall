package com.genSing.mall.management.dao;

import com.genSing.mall.management.model.po.UserPO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserPO,Long> {

}
