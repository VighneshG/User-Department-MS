package com.vighnesh.user.service;

import com.vighnesh.user.VO.Department;
import com.vighnesh.user.VO.ResponseVO;
import com.vighnesh.user.entity.User;
import com.vighnesh.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("In saveUser inside User Service");
        return userRepository.save(user);
    }

    public ResponseVO findUserDepartmentDetails(long userId) {
        log.info("In findUserDepartment inside User Service");
        ResponseVO responseVO = new ResponseVO();
        User user = userRepository.findByUserId(userId);

        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" +
                user.getDepartmentId(), Department.class);

        responseVO.setUser(user);
        responseVO.setDepartment(department);

        return responseVO;
    }

}
