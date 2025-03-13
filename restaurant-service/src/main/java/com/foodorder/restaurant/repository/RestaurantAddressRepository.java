package com.foodorder.restaurant.repository;

import com.foodorder.restaurant.model.RestaurantAddress;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantAddressRepository extends MongoRepository<RestaurantAddress, String> {

}
