package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.repository.CarRepository;
import com.cydeo.repository.DepartmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    CarRepository carRepository;
    DepartmentRepository departmentRepository;

    @Override
    public void run(String... args) throws Exception {

        Car c1 = new Car("BMW", "X5");
        Car c2 = new Car("Honda", "CRV");
        Car c3 = new Car("Lexus", "RX450H");
        Car c4 = new Car("Toyota", "Landcruiser");
        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);
        carRepository.save(c4);
    }

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    // lacking this constructor, will get an error

}
