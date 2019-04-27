package cn.sicau.djcx.mapper;

import cn.sicau.djcx.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
@Component(value = "AdminMapper")
public interface UserMapper extends BaseMapper<User> {

}
