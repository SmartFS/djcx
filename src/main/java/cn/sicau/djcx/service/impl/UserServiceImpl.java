package cn.sicau.djcx.service.impl;

import cn.sicau.djcx.entity.User;
import cn.sicau.djcx.mapper.UserMapper;
import cn.sicau.djcx.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
