package com.feng.bash.dto;

import com.feng.bash.from.OneFrom;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * @Classname UserDto
 * @Description TODO
 * @Date 2019/10/15 15:45
 * @Created by FengYu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto implements Serializable {
    private Integer id;
    private String name;
    private String pwd;
    private Map<String, OneFrom> map;
    private boolean is;
    private Date date;



}

