package springboot.springbootrestful.dao;

import org.apache.ibatis.annotations.Param;
import springboot.springbootrestful.domain.City;

import java.util.List;

public interface CityDao {
    City findById(@Param("id") Long id);

    List<City> findAllCity();

    void saveCity(City city);

    void updateCity(City city);

    void deleteCity(@Param("id") Long id);
}
