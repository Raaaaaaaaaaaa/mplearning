package com.zfl.test.service.impl;

import com.zfl.test.entity.User;
import com.zfl.test.mapper.UserMapper;
import com.zfl.test.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Raaaaaa
 * @since 2021-09-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
