package hu.uni.miskolc.iit.swtest.car.core.model;

public class Manager extends User
{
    private Collection<Rental> rentedCars;

    public Manager(int id, String name, Collection<Rental> rentedCars) {
        super(id, name);
        this.rentedCars = rentedCars;
    }

    public Collection<Rental> getRentedCars() {
        return rentedCars;
    }

    public void setRentedCars(Collection<Rental> rentedCars) {
        this.rentedCars = rentedCars;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Manager{" +
                "rentedCars=" + rentedCars +
                '}';
    }
}