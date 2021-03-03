package main;

import classes.Giraffe;
import classes.Zebra;
import classes.Zoo;
import classes.Zookeeper;

public class Main {

	public static void main(String[] args) {
		Zookeeper keeper = new Zookeeper("Costel");
		Zoo zoo=new Zoo();
		
		zoo.setZookeeper(keeper);
		
		Giraffe giraffe = new Giraffe("Girafa", 10);
		Giraffe secondGiraffe = new Giraffe("GirafaDoi", 15, 200);
		
		zoo.addAnimal(giraffe);
		zoo.addAnimal(secondGiraffe);
		
		zoo.feedAllAnimals();
		
		Zebra z1= new Zebra("Zebra1", 7);
		Zebra z2= new Zebra("Zebra2", 9, 130);
		
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		
		zoo.feedAllAnimals();
	}

}
