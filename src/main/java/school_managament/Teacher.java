package school_managament;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(nullable = false)
	String name;
	
	@Column(nullable = false)
	String subject;
	
	@Column(nullable = false)
	String salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Teacher(String name, String subject, String salary) {
		super();
		this.name = name;
		this.subject = subject;
		this.salary = salary;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
