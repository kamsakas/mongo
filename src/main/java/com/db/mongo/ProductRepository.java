package com.db.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.db.mongo.model.product;
import org.springframework.data.mongodb.repository.Query;

public interface ProductRepository extends MongoRepository<product, String> {
    @Query("{name:'?0'}")
    product findItemByName(String name);
}
