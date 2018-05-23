package com.pinyougou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/brand")
//组合注解：@Controller @ResponseBody
@RestController
public class BrandController {

    //从注册中心获取一个服务对象
    @Reference
    private BrandService brandService;

    /**
     * 查询所有品牌
     * @return 品牌列表
     */
    @GetMapping("/findAll")
    //@ResponseBody
    public List<TbBrand> findAll(){
        return brandService.queryAll();
    }
}
