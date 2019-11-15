package com.feng.bash.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * @Classname UserVo
 * @Description TODO
 * @Date 2019/10/15 15:48
 * @Created by FengYu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserVo implements Serializable {
    private Integer id;
    private String name;
    private Map<String, Object> map;
    private boolean is;
    private Date date;
}
