package school_managament;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Principal 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(nullable = false)
	String name;
	@Column(nullable = false,unique = true)
	String email;
	@Column(nullable = false,unique = true)
	String phnno;
	@Column(nullable = false)
	String password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhnno() {
		return phnno;
	}
	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Principal(String name, String email, String phnno, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phnno = phnno;
		this.password = password;
	}
	public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
