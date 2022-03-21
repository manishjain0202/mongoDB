package com.manish.mongo.repo;
public interface CustomItemRepository {
    
    void updateItemQuantity(String name, float newQuantity);

}