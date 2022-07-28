package com.divyakant.userservice.dto;

import com.divyakant.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseTemplate {
    private User user;
    private Department department;
}
