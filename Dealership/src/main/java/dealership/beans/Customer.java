package dealership.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author William Thomas, wdthomas2
 * CIS175 - Spring 2022
 * Apr 11, 2022
 */

@Entity
@Data
@NoArgsConstructor

public class Customer {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String department;
	
	//Constructor with arg
	
	public Customer(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	
}
