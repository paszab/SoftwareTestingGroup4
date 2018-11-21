package hu.uni.miskolc.iit.swtest.car.core.model;

public class Rental
{
    private int carId;
    private int borrowerId;
    private int managerId;
    private Date rentStartDate;
    private Date rentEndDate;
    private boolean approved;

    public Rental(int carId, int borrowerId, int managerId, Date rentStartDate, Date rentEndDate, boolean approved) {
        this.carId = carId;
        this.borrowerId = borrowerId;
        this.managerId = managerId;
        this.rentStartDate = rentStartDate;
        this.rentEndDate = rentEndDate;
        this.approved = approved;
    }

    public int getCarId() {
        return carId;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public int getManagerId() {
        return managerId;
    }

    public Date getRentStartDate() {
        return rentStartDate;
    }

    public Date getRentEndDate() {
        return rentEndDate;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public void setRentStartDate(Date rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public void setRentEndDate(Date rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Rental{" +
                "carId=" + carId +
                ", borrowerId=" + borrowerId +
                ", managerId=" + managerId +
                ", rentStartDate=" + rentStartDate +
                ", rentEndDate=" + rentEndDate +
                ", approved=" + approved +
                '}';
    }
}