package com.feng.bash.test;

import com.alibaba.fastjson.JSON;
import com.feng.bash.dto.UserDto;
import com.feng.bash.from.OneFrom;
import com.feng.bash.vo.UserVo;
import org.assertj.core.util.Lists;
import org.assertj.core.util.Maps;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @Classname BeanCopyTest
 * @Description TODO
 * @Date 2019/10/15 15:49
 * @Created by FengYu
 */
public class BeanCopyTest {
    public static void main(String[] args) {
        UserDto userDto = UserDto.builder().id(1).name("fengyu").pwd("123456").build();
        userDto.setDate(new Date());
        userDto.setIs(false);
        Map<String, OneFrom> map = new HashMap<>();
        map.put("123", OneFrom.builder().one("str").build());
        userDto.setMap(map);
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(userDto, userVo);

        System.out.println(JSON.toJSON(userVo));
        System.out.println(userVo.toString());
        //
        //List<String> list = Lists.newArrayList();
        //list = null;
        //if (!CollectionUtils.isEmpty(list)) {
        //    list.forEach(s -> System.out.println(s.getBytes()));
        //} else {
        //    System.err.println("空异常了");
        //}
        userVo = null;
        //
        //String name = Optional.ofNullable(UserVo.builder().name("bbbb").build()).orElse(createUserVo("a")).getName();
        //String sname = Optional.ofNullable(UserVo.builder().name("bbbb").build()).orElseGet(()->createUserVo("b")).getName();
        //System.out.println(name);
        //System.out.println(sname);
        //

        List<UserVo> userVoList = null;
        System.out.println(userVoList);
        userVoList = Optional.ofNullable(userVoList).orElseGet(() -> Collections.emptyList());

        if (!Optional.ofNullable(null).isPresent()) {
            System.out.println("aaaaaaaaaaaaa");
        }
        System.out.println(userVoList.size());


        List<UserVo> userVoList1 = Lists.newArrayList();
        userVoList1.add(UserVo.builder().name("word").build());
        userVoList1.add(UserVo.builder().name("aaaa").build());
        //Optional.ofNullable(userVoList1).map(list->list.get(0))


        Optional.ofNullable(null).ifPresent(s -> {
            return;
        });

        System.out.println("sanjauidhaidhnauish");


        String str = "abc";
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = str;


        System.out.println(str == str1);
        System.out.println(str.equals(str1));
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        System.out.println(str == str3);
        System.out.println(str.equals(str3));

        Integer one = 1;
        Integer two = new Integer(1);
        Integer three=one;

        System.out.println(one.equals(two));
        System.out.println(one==two);
        System.out.println(one.equals(three));
        System.out.println(one==three);


        int uiid=1;
        Integer uiids=1;

        System.out.println(userDto.hashCode());

    }


    public static UserVo createUserVo(String a) {
        System.out.println("执行了方法啊:" + a);
        return UserVo.builder().name("create").build();
    }
}

