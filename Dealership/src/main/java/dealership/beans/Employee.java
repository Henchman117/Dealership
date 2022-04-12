package dealership.beans;

import javax.persistence.Column;
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
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	@Column(name = "Emp Name")
	private String name;
	@Column(name = "Department")
	private String department;
	
	
	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	

}
