package dealership.reposittory;

import org.springframework.data.jpa.repository.JpaRepository;

import dealership.beans.Employee;
import dealership.beans.Vehicle;


public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

	void save(Employee e);

}
