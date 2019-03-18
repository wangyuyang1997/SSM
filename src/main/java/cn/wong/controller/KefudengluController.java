package cn.wong.controller;

import cn.wong.pojo.Kefudenglu;
import cn.wong.service.KefudengluService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Wong
 * Date: 2019/03/15
 * Description:
 * Version: V1.0
 */
@Controller
@RequestMapping("/kefudenglu")
public class KefudengluController {

    private KefudengluService kefudengluService;

    public KefudengluService getKefudengluService() {
        return kefudengluService;
    }

    @Autowired
    public KefudengluController(KefudengluService kefudengluService){
        this.kefudengluService = kefudengluService;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,String> login(@RequestBody Kefudenglu kefudenglu){
        System.out.println(kefudenglu.getShoujihaoma());
        System.out.println(kefudenglu.getMima());
        Map<String,String> map = new HashMap<>();
        map.put("returnCode","300");
        return map;
    }
}
