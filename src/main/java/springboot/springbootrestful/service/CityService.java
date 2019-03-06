package springboot.springbootrestful.service;

import springboot.springbootrestful.domain.City;

import java.util.List;

public interface CityService {

    City findCityById(Long id);

    List<City> findAllCity();

    void saveCity(City city);

    void updateCity(City city);

    void deleteCity(Long id);
}
