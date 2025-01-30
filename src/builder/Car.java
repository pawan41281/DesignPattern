package builder;

public class Car {

	// required params
	private String brand;
	private String model;

	// optional param
	private String color;
	private String fuel;
	private String transmissionType;
	private Integer price;
	private Integer manufacturingYear;

	public Car(Builder builder) {
		this.brand = builder.brand;
		this.model = builder.model;
		this.color = builder.color;
		this.fuel = builder.fuel;
		this.transmissionType = builder.transmissionType;
		this.price = builder.price;
		this.manufacturingYear = builder.manufacturingYear;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", fuel=" + fuel
				+ ", transmissionType=" + transmissionType + ", price=" + price + ", manufacturingYear="
				+ manufacturingYear + "]";
	}

	public static class Builder {

		// required params
		private String brand;
		private String model;

		// optional param
		private String color;
		private String fuel;
		private String transmissionType;
		private Integer price;
		private Integer manufacturingYear;

		public Builder(String brand, String model) {
			this.brand = brand;
			this.model = model;
		}

		public Builder setColor(String color) {
			this.color = color;
			return this;
		}

		public Builder setFuel(String fuel) {
			this.fuel = fuel;
			return this;
		}

		public Builder setTransmissionType(String transmissionType) {
			this.transmissionType = transmissionType;
			return this;
		}

		public Builder setPrice(Integer price) {
			this.price = price;
			return this;
		}

		public Builder setManufacturingYear(Integer manufacturingYear) {
			this.manufacturingYear = manufacturingYear;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
	}
}
