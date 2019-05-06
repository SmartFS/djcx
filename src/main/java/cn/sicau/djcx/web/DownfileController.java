package cn.sicau.djcx.web;


import cn.sicau.djcx.entity.Downfile;
import cn.sicau.djcx.mapper.DownfileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
@Controller
@RequestMapping("/downfile")
public class DownfileController {

    @Resource
    DownfileMapper downfileMapper;
    public void insertFile(){
        Downfile downfile = new Downfile();
        downfile.setFileId("fangfna");
        downfile.setFileUrl("shusa");
        downfileMapper.insert(downfile);
    }
}

