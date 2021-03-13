package com.bjfu.fortree.pojo.dto.user;

import com.bjfu.fortree.pojo.entity.user.Authority;
import com.bjfu.fortree.enums.entity.AuthorityTypeEnum;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class AuthorityDTO {

    public AuthorityDTO(Authority authority) {
        BeanUtils.copyProperties(authority, this);
    }
    /**
     * 权限类型
     */
    AuthorityTypeEnum type;
}