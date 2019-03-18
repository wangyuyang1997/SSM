package cn.wong.service;

import cn.wong.pojo.Dindan;
import cn.wong.pojo.DindanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Wong
 * Date: 2019/03/15
 * Description:
 * Version: V1.0
 */
@Service
public class DindanService {

    private DindanMapper dindanMapper;

    @Autowired
    public DindanService(DindanMapper dindanMapper){
        this.dindanMapper = dindanMapper;
    }

    public List<Dindan> selectUser(){
        return dindanMapper.selectDindans();
    }
}
