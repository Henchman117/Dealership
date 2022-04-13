package dealership.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

/**
 * @author William Thomas, wdthomas2
 * CIS175 - Spring 2022
 * Apr 11, 2022
 */


@Entity
@Data
@ToString
public class Customer {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private Customer customer;
	

	
}
