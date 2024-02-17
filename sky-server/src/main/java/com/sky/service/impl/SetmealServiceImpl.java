package com.sky.service.impl;

import com.sky.dto.SetmealDTO;
import com.sky.mapper.SetmealMapper;
import com.sky.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetmealServiceImpl implements SetmealService {

    @Autowired
    private SetmealMapper setmealMapper;

    /**
     * 新增套餐
     * @param setmealDTO
     */
    @Override
    //TODO
    public void save(SetmealDTO setmealDTO) {

    }
}
