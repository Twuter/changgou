package com.changgou.controller;

import com.changgou.goods.pojo.Brand;
import com.changgou.service.BrandService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/brand")
@CrossOrigin
@Component
public class BrandController {

    @Autowired
    private BrandService brandService;
    @GetMapping
    public  Result<List<Brand>>  findAll(){
        System.out.println("你好");
        List<Brand> findall = brandService.findall();

        return  new Result<List<Brand>>(true, StatusCode.OK,"查询品牌集合成功",findall);
    }


}
