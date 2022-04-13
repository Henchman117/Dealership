package dealership.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String make;
	private String model;
	private String color;
	private float price;
	private boolean sold;
}
