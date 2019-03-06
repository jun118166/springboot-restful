package springboot.springbootrestful.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.springbootrestful.dao.CityDao;
import springboot.springbootrestful.domain.City;
import springboot.springbootrestful.service.CityService;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City findCityById(Long id) {
        return cityDao.findById(id);
    }

    @Override
    public List<City> findAllCity() {
        return cityDao.findAllCity();
    }

    @Override
    public void saveCity(City city) {
        cityDao.saveCity(city);
    }

    @Override
    public void updateCity(City city) {
        cityDao.updateCity(city);
    }

    @Override
    public void deleteCity(Long id) {
        cityDao.deleteCity(id);
    }
}
