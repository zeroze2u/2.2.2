package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class serviceCar {

    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car("Mercedes", 3748, 100392));
        carsList.add(new Car("BMW", 1029, 827362));
        carsList.add(new Car("Folkswagen", 2948, 120438));
        carsList.add(new Car("Lada", 4957, 546382));
        carsList.add(new Car("Ford", 8732, 998173));
    }

    public List<Car> getCarsList(){return carsList;}

    public List<Car> getCarsCount(int count){return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
