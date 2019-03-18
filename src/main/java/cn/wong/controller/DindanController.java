package cn.wong.controller;

import cn.wong.service.DindanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: Wong
 * Date: 2019/03/15
 * Description:
 * Version: V1.0
 */
@Controller
@RequestMapping("/dindan")
public class DindanController {
    private final DindanService dindanService;
    @Autowired
    public DindanController(DindanService dindanService){
        this.dindanService = dindanService;
    }
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String select(){
        System.out.println(dindanService.selectUser());
        return "success";
    }

}
