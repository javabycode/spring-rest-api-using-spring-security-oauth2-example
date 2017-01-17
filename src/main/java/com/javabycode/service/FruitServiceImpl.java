package com.javabycode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabycode.dao.FruitDAO;
import com.javabycode.model.Fruit;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {

    @Autowired
    FruitDAO fruitDAO;

    @Override
    public List<Fruit> getAll(int offset, int count) {
        return fruitDAO.getAll();
    }

    @Override
    public Fruit findById(int id){
    	return fruitDAO.findById(id);
    }

    @Override
    public Fruit findByName(String name) {
        return fruitDAO.findByName(name);
    }

    @Override
    public void create(Fruit fruit) {
        fruitDAO.create(fruit);
    }

    @Override
    public void update(Fruit fruit) {
    	fruitDAO.update(fruit);
    }

    @Override
    public void delete(int id) {
    	fruitDAO.delete(id);
    }

    @Override
    public boolean exists(Fruit fruit) {
        return fruitDAO.exists(fruit);
    }
}
