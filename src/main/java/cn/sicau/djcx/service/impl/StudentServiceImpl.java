package cn.sicau.djcx.service.impl;

import cn.sicau.djcx.entity.Student;
import cn.sicau.djcx.mapper.StudentMapper;
import cn.sicau.djcx.service.IStudentService;
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
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
