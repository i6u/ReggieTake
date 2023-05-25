package com.reggie.mapper;

import com.reggie.entity.Dish;
import com.reggie.entity.SetmealDish;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SetmealDishMapper {

    //根据菜品ids找套餐
    List<Long> getSetmealIdsByDishIds(List<Long> ids);

    //保存套餐和菜品的关联关系
    void insertBatch(List<SetmealDish> setmealDishes);

    //套餐id删除套餐菜品关系表中的数据
    void deleteBySetmealId(List<Long> ids);

    //根据菜品id更新套餐的餐菜品名称和价格
    void updateSetmealDishByID(Dish dish);

}
