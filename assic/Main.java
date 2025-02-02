package assic;

public class Main {
    public static void main(String[] args) {
        CarDealership dealership = new CarDealership("Luxury Cars");

        Car car1 = new Car("Toyota", 5, 25000, 10, dealership);
        Car car2 = new Car("Honda", 5, 22000, 5, dealership);

        PurchaseRequest request1 = new PurchaseRequest("John Doe", "1234567890", car1);
        PurchaseRequest request2 = new PurchaseRequest("Jane Smith", "0987654321", car2);
        PurchaseRequest request3 = new PurchaseRequest("Mark Johnson", "1122334455", car2);

        System.out.println("Car: " + car1.getBrandName());
        System.out.println("Max Passengers: " + car1.getMaxPassengers());
        System.out.println("Cost: $" + car1.getCost());
        System.out.println("Stock: " + car1.getQuantityInStock());
        System.out.println("Availability: " + (car1.isAvailability() ? "Available" : "Not Available"));
        System.out.println("Purchase Requests for " + car1.getBrandName() + ":");
        for (PurchaseRequest req : car1.getPurchaseRequests()) {
            System.out.println("- " + req.getBuyerName() + " (" + req.getPhoneNumber() + ")");
        }

        System.out.println("\nSearching for 'Honda':");
        Car searchedCar = dealership.findCarByBrand("Honda");
        if (searchedCar != null) {
            System.out.println("Found Car: " + searchedCar.getBrandName());
        } else {
            System.out.println("Car not found.");
        }
    }
}

