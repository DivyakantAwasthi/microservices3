package com.divyakant.userservice.service;

import com.divyakant.userservice.dto.Department;
import com.divyakant.userservice.dto.ResponseTemplate;
import com.divyakant.userservice.entity.User;
import com.divyakant.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findByUserId(Long id) {
        return userRepository.findByUserId(id);
    }

    public ResponseTemplate getUserDetails(Long id) {
        ResponseTemplate responseTemplate = new ResponseTemplate();
        User user = findByUserId(id);
        System.out.println(user.getDepartmentId());
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(),Department.class);

        responseTemplate.setUser(user);
        responseTemplate.setDepartment(department);
        return responseTemplate;
    }
}
