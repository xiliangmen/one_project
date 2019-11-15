package com.feng.bash.from;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Classname oneFrom
 * @Description TODO
 * @Date 2019/10/15 16:01
 * @Created by FengYu
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OneFrom implements Serializable {
    private String one;
}
