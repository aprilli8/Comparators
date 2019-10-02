public class Student {
	private String name;
	private String address;
	private long campusPhone;
	private int suBox;
	private long homePhone;

	// Be sure to include a toString method here.
	public String toString(){
		return name + ", " + address + ", " + campusPhone + ", " + suBox + ", " + homePhone + "| ";
	}

	public Student(String nm, String addr, long campusNum, int su, long homeNum){
		name = nm;
		address = addr;
		campusPhone = campusNum;
		suBox = su;
		homePhone = homeNum;
	}

	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public long getCampusPhone(){
		return campusPhone;
	}

	public int getSUBox(){
		return suBox;
	}

	public long getHomePhone(){
		return homePhone;
	}

}
