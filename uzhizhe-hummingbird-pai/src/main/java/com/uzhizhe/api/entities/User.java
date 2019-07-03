package com.uzhizhe.api.entities;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author qingjiang.li
 * @since 2019-07-03 2:01 PM
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Accessors(chain = true)
public class User {

    private Integer id;
    private String name;
    private Date createTime;

}
