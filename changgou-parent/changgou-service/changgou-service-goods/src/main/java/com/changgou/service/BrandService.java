package com.changgou.service;

import com.changgou.goods.pojo.Brand;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
public interface BrandService {




    List<Brand> findall();

}
