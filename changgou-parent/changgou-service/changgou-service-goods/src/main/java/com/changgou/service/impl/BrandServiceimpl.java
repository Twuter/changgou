package com.changgou.service.impl;

import com.changgou.dao.BrandMapper;
import com.changgou.goods.pojo.Brand;
import com.changgou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BrandServiceimpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;


    @Override
    public List<Brand> findall() {

        return brandMapper.selectAll();
    }
}
