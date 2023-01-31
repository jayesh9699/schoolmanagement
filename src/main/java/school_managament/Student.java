package school_managament;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(nullable = false)
	String name;
	@Column(nullable = false)
	String stream;
	@Column(nullable = false)
	String fees;
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
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	public Student(String name, String stream, String fees) {
		super();
		this.name = name;
		this.stream = stream;
		this.fees = fees;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
