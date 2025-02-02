package assic;

class PurchaseRequest {
    private String buyerName;
    private String phoneNumber;
    private Car car;

    // Конструктор класса
    public PurchaseRequest(String buyerName, String phoneNumber, Car car) {
        this.buyerName = buyerName;
        this.phoneNumber = phoneNumber;
        this.car = car;
        car.addRequest(this);
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Car getCar() {
        return car;
    }
}

