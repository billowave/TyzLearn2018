package springmvc.example1.helloworld;


public class Area {

	private String area_name;
	private int area_num;
	private String area_owner;
	
	public Area() {
		super();
		this.area_name = "default";
		this.area_num = 100;
		this.area_owner = "tyz";
	
	}

	public Area(String area_name, int area_num, String area_owner) {
		super();
		this.area_name = area_name;
		this.area_num = area_num;
		this.area_owner = area_owner;
	}

	public int getArea_num() {
		return area_num;
	}

	public void setArea_num(int area_num) {
		this.area_num = area_num;
	}

	public String getArea_owner() {
		return area_owner;
	}

	public void setArea_owner(String area_owner) {
		this.area_owner = area_owner;
	}

	public String getArea_name() {
		return area_name;
	}

	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}

	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		String str = "";
		str = "��������" + this.area_name + "\n" + "�����С��" + this.area_num + "\n" + "�����ߣ�" + this.area_owner + "\n";
		return str;
	}

}