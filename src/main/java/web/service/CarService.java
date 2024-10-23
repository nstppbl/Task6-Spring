package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "White", 2010));
        cars.add(new Car("Honda", "Black", 2015));
        cars.add(new Car("BMW", "Red", 2018));
        cars.add(new Car("Audi", "Black", 2020));
        cars.add(new Car("Ford", "Yellow", 2012));
    }

    public List<Car> getCars(int count){
        if (count >= cars.size()){
            return cars;
        }
        return cars.subList(0, count);
    }

    public List<Car> getAllCars(){
        return cars;
    }
}
