package com.vighnesh.user.repository;

import com.vighnesh.user.VO.ResponseVO;
import com.vighnesh.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    ResponseVO findUserDepartmentDetails(long userId);

    User findByUserId(long userId);
}
