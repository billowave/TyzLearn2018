package test.just.hibernate.annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentsh")
public class AnoStudent {

	@Id
	private int id;
	private String last_name;
	private String first_name;
	private int marks;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
}