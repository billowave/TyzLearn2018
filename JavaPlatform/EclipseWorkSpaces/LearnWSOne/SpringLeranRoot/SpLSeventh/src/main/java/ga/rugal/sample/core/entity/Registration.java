package ga.rugal.sample.core.entity;

import com.google.gson.annotations.Expose;
import config.SystemDefaultProperties;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author Rugal Bernstein
 */
@Data
@Entity
@Table(name = "registration", schema = SystemDefaultProperties.SCHEMA)
public class Registration
{
	
	@Id
    @Basic(optional = false)
    @Expose
    @NotNull
    @Column(name = "rid", nullable = false)
    private Integer rid;

    @Column(name = "grade")
    @Expose
    private Integer grade;

    @Expose
    @JoinColumn(name = "cid", referencedColumnName = "cid")
    @ManyToOne
    private Course course;

    @Expose
    @JoinColumn(name = "sid", referencedColumnName = "sid")
    @ManyToOne
    private Student student;

    public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}



    @Override
    public int hashCode()
    {
        int hash = 2;
        hash += (rid != null ? rid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registration))
        {
            return false;
        }
        Registration other = (Registration) object;
        return !((this.rid == null && other.rid != null) || (this.rid != null && !this.rid.equals(other.rid)));
    }

    @Override
    public String toString()
    {
        return "ga.rugal.student.core.entity.Registration[ rid=" + rid + " ]";
    }

}
