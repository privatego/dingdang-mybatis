package com.dingdang.mybatis;

import com.dingdang.entity.Blog;

/**
 * @author: blessed
 * @Date: 2019/5/6
 */
public interface BlogMapper {
    Blog selectBlogById(int i);
}
