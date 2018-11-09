/**
 * 
 */
package org.SpLSecond;

/**
 * @author Administrator
 *
 */
public class Employee {

	private int EMP_ID;
	private String EMP_NAME;
	private String EMP_NO;
	private String HIRE_DATE;
	private String IMAGE;
	private String JOB;
	private float SALARY;
	private int DEPT_ID;
	private int MNG_ID;

	public Employee() {

	}

	public Employee(int eMP_ID, String eMP_NAME, String eMP_NO, String hIRE_DATE, String iMAGE, String jOB,
			float sALARY, int dEPT_ID, int mNG_ID) {
		super();
		EMP_ID = eMP_ID;
		EMP_NAME = eMP_NAME;
		EMP_NO = eMP_NO;
		HIRE_DATE = hIRE_DATE;
		IMAGE = iMAGE;
		JOB = jOB;
		SALARY = sALARY;
		DEPT_ID = dEPT_ID;
		MNG_ID = mNG_ID;
	}

	public int getEMP_ID() {
		return EMP_ID;
	}

	public void setEMP_ID(int eMP_ID) {
		EMP_ID = eMP_ID;
	}

	public String getEMP_NAME() {
		return EMP_NAME;
	}

	public void setEMP_NAME(String eMP_NAME) {
		EMP_NAME = eMP_NAME;
	}

	public String getEMP_NO() {
		return EMP_NO;
	}

	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}

	public String getHIRE_DATE() {
		return HIRE_DATE;
	}

	public void setHIRE_DATE(String hIRE_DATE) {
		HIRE_DATE = hIRE_DATE;
	}

	public String getIMAGE() {
		return IMAGE;
	}

	public void setIMAGE(String iMAGE) {
		IMAGE = iMAGE;
	}

	public String getJOB() {
		return JOB;
	}

	public void setJOB(String jOB) {
		JOB = jOB;
	}

	public float getSALARY() {
		return SALARY;
	}

	public void setSALARY(float sALARY) {
		SALARY = sALARY;
	}

	public int getDEPT_ID() {
		return DEPT_ID;
	}

	public void setDEPT_ID(int dEPT_ID) {
		DEPT_ID = dEPT_ID;
	}

	public int getMNG_ID() {
		return MNG_ID;
	}

	public void setMNG_ID(int mNG_ID) {
		MNG_ID = mNG_ID;
	}

}
