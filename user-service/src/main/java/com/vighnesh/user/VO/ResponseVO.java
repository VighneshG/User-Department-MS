package com.vighnesh.user.VO;

import com.vighnesh.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseVO {

    private User user;
    private Department department;
}
