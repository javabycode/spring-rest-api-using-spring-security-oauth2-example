package com.javabycode.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import com.javabycode.model.Fruit;

@Repository
public class FruitDAOImpl implements FruitDAO {

	// Dummy database. Initialize with some dummy values.
	private static final AtomicLong generateID = new AtomicLong();
	
	private static List<Fruit> fruits;
	{
		fruits = new ArrayList<Fruit>();
		fruits.add(new Fruit(generateID.incrementAndGet(), "Apple", "USA", "Delicious flavour"));
		fruits.add(new Fruit(generateID.incrementAndGet(), "Orange", "Indonesia", "Delicious flavour"));
		fruits.add(new Fruit(generateID.incrementAndGet(), "Banana", "Cuba", "Good quality"));
	}

	/**
	 * Returns list of fruits from dummy database.
	 * 
	 * @return list of fruits
	 */
	public List<Fruit> getAll() {
		return fruits;
	}
	
    @Override
    public Fruit findById(int id) {
        for (Fruit fruit : fruits){
            if (fruit.getId() == id){
                return fruit;
            }
        }
        return null;
    }

    @Override
    public Fruit findByName(String name) {
        for (Fruit fruit : fruits){
            if (fruit.getName().equals(name)){
                return fruit;
            }
        }
        return null;
    }

    @Override
    public void create(Fruit fruit) {
        fruit.setId(generateID.incrementAndGet());
        fruits.add(fruit);
    }

    @Override
    public void update(Fruit fruit) {
    	for (Fruit fr : fruits) {
			if (fruit.getId() == fr.getId()){
		        int index = fruits.indexOf(fr);
		        fruits.set(index, fruit);				
			}
		}
    }

    @Override
    public void delete(int id) {
        Fruit fruit = findById(id);
        fruits.remove(fruit);
    }

    @Override
    public boolean exists(Fruit fruit) {
        return findByName(fruit.getName()) != null;
    }	

}
