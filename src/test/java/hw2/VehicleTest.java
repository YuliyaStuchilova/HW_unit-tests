package hw2;

import Homework2.Car;
import Homework2.Motorcycle;
import Homework2.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @Nested
    class TestCasesWithCar {

        @BeforeEach
        void prepareData() {
            car = new Car("Lexus", "LX 570", 2018);
        }

        @Test
        void carIsInstanceOfVehicleTest() {
            assertThat(car).isInstanceOf(Vehicle.class);
        }
        @Test
        void carObjectHasFourWheelsTest() {
            assertThat(car.getNumWheels()).isEqualTo(4);
        }
        @Test
        void carCheckTestDriveSpeedTest() {
            car.testDrive();
            assertThat(car.getSpeed()).isEqualTo(60);
        }
        @Test
        void carCheckParkModeSpeedTest() {
            car.testDrive();
            car.park();
            assertThat(car.getSpeed()).isEqualTo(0);
        }
    }

    @Nested
    class TestCasesWithMotorcycle {

        @BeforeEach
        void prepareData() {
            motorcycle = new Motorcycle("Yamaha", "FJR1300", 2014);
        }

        @Test
        void motorcycleObjectHasTwoWheelsTest() {
            assertThat(motorcycle.getNumWheels()).isEqualTo(2);
        }
        @Test
        void motorcycleCheckTestDriveSpeedTest() {
            motorcycle.testDrive();
            assertThat(motorcycle.getSpeed()).isEqualTo(75);
        }
        @Test
        void motorcycleCheckParkModeSpeedTest() {
            motorcycle.testDrive();
            motorcycle.park();
            assertThat(motorcycle.getSpeed()).isEqualTo(0);
        }
    }
}