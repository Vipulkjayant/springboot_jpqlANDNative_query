package Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String total_marks;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String total_marks) {
		super();
		this.id = id;
		this.name = name;
		this.total_marks = total_marks;
	}
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
	public String getTotal_marks() {
		return total_marks;
	}
	public void setTotal_marks(String total_marks) {
		this.total_marks = total_marks;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", total_marks=" + total_marks + "]";
	}
	
}
