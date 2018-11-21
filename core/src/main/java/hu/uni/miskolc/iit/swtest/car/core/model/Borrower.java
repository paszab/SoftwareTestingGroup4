package hu.uni.miskolc.iit.swtest.car.core.model;

public class Borrower extends User
{
    private Collection<Car> borrowedCars;

    public Borrower(int id, String name; Collection<Car> borrowedCars) {
        super(id, name);
        this.borrowedCars = borrowedCars;
    }

    public Collection<Car> getBorrowedCars() {
        return borrowedCars;
    }

    public void setBorrowedCars(Collection<Car> borrowedCars) {
        this.borrowedCars = borrowedCars;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Borrower{" +
                "borrowedCars=" + borrowedCars +
                '}';
    }
}