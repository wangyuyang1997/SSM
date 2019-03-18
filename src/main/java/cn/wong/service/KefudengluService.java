package cn.wong.service;

import cn.wong.pojo.Kefudenglu;
import cn.wong.pojo.KefudengluMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Wong
 * Date: 2019/03/15
 * Description:
 * Version: V1.0
 */
@Service
public class KefudengluService {

    private KefudengluMapper kefudengluMapper;
    @Autowired
    public KefudengluService(KefudengluMapper kefudengluMapper){
        this.kefudengluMapper = kefudengluMapper;
    }

    public KefudengluMapper getKefudengluMapper() {
        return kefudengluMapper;
    }
}
