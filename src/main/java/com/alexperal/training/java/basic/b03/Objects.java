package com.alexperal.training.java.basic.b03;

public class Objects {

	public static void main(String[] args) {

		// sometimes you have info related to a concept, in this case a car
		String brand = "Mercedes";
		String model = "A-Class";
		int year =2021;

		// when calling a function you need to pass to it all the parameters
		printCar(brand, model, year);

		//If you want to create a second set of parameters you need to create all of them again
		String brand2 = "Mercedes";
		String model2 = "B-Class";
		int year2 =2021;

		printCar(brand2,model2, year2); // this is error-prone, can you spot the bug?


		// An object is a representation of a concept, it allows us to work with related information
		CarModel aMercedesModel = new CarModel("Mercedes","C-Class",2021);

		// It is easier to invoke methods on it
		printCar(aMercedesModel.brand, aMercedesModel.model, aMercedesModel.year);

		// An object can have it own methods (non-static)
		printCarObject(aMercedesModel);
		aMercedesModel.print();
		CarModel.print(aMercedesModel);
		aMercedesModel.print2();

		// Objects can be nested, in this case from a CarModel we are going to create an actual car
		Car car1 = aMercedesModel.plate("YYY 2222");
		Car car2 = aMercedesModel.plate("YYY 2223");

		System.out.println(car1.format());
		System.out.println(car2.format());
	}

	private static void printCarObject(CarModel carModel) {
		printCar(carModel.brand, carModel.model, carModel.year);
	}

	private static void printCar(String brand, String model, int year) {
		System.out.println("This is a "+ model +" from "+ brand +" made in "+ year);
	}

	static class CarModel {
		String brand;
		String model;
		int year;

		public CarModel(String brand, String model, int year) {
			this.brand = brand;
			this.model = model;
			this.year = year;
		}

		public void print() { // Invisible parameter of type same as the class (in this case CarModel)
			// you can access this invisbile parameter with the keyword this
			printCar(this.brand,this.model,this.year);
		}
		public static void print(CarModel anything) {
			printCar(anything.brand, anything.model, anything.year);
		}
		public void print2() {
			printCar(brand, model, year);
		}

		public Car plate(String plate) {
			return new Car(this,plate);
		}


	}

	static class Car{
		CarModel carModel;
		String plate;

		public Car(CarModel carModel, String plate) {
			this.carModel = carModel;
			this.plate = plate;
		}

		public String format() {
			return "This is the car with plate "+this.plate+" and model "+ this.carModel.model;
		}
	}
}
