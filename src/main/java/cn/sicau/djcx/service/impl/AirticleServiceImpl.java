package cn.sicau.djcx.service.impl;

import cn.sicau.djcx.entity.Airticle;
import cn.sicau.djcx.mapper.AirticleMapper;
import cn.sicau.djcx.service.IAirticleService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
@Service
public class AirticleServiceImpl extends ServiceImpl<AirticleMapper, Airticle> implements IAirticleService {
    @Autowired
    AirticleMapper airticleMapper;
    public List<Airticle> getAllAirticles(Integer num){

        int pageSize = 8;
        PageHelper.startPage(num,pageSize);
        List<Airticle> airticles = airticleMapper.selectList(new EntityWrapper<Airticle>());
        return airticles;
    }
}
