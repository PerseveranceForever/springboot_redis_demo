package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.model.City;

import java.util.List;

/**
 * @Author 落叶飞翔的蜗牛
 * @Date 2018/2/26
 * @Description 城市 DAO 接口类
 */
public interface CityDao {

    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<City> findAllCity();

    /**
     * 根据城市 ID，获取城市信息
     *
     * @param id
     * @return
     */
    City findById(@Param("id") Long id);

    /**
     * 保存城市信息
     * @param city
     * @return
     */
    Long saveCity(City city);

    /**
     * 修改城市信息
     * @param city
     * @return
     */
    Long updateCity(City city);

    /**
     * 删除城市信息
     * @param id
     * @return
     */
    Long deleteCity(Long id);
}
