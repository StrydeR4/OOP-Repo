package assic;

import java.util.ArrayList;
import java.util.List;

class Car {
    private String brandName;
    private int maxPassengers;
    private double cost;
    private int quantityInStock;
    private boolean availability;
    private CarDealership dealership;
    private List<PurchaseRequest> purchaseRequests;

    public Car(String brandName, int maxPassengers, double cost, int quantityInStock, CarDealership dealership) {
        this.brandName = brandName;
        this.maxPassengers = maxPassengers;
        this.cost = cost;
        this.quantityInStock = quantityInStock;
        this.dealership = dealership;
        this.purchaseRequests = new ArrayList<>();
        this.dealership.addCar(this);
    }

    public String getBrandName() {
        return brandName;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public double getCost() {
        return cost;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public boolean isAvailability() {
        return quantityInStock > 0 && purchaseRequests.size() < quantityInStock;
    }

    public CarDealership getDealership() {
        return dealership;
    }

    public List<PurchaseRequest> getPurchaseRequests() {
        return purchaseRequests;
    }

    public void addRequest(PurchaseRequest request) {
        purchaseRequests.add(request);
    }

    public void removeRequest(PurchaseRequest request) {
        purchaseRequests.remove(request);
    }
}
