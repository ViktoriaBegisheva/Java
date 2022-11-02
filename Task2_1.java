package lab6;

class Student{
	private int id;
	private String surname;
	private String name;
	private String fathername;
	private String birthDate;
	private String address;
	private String telphnumber;
	private String facultet;
	private String curs;
	private String group;
	
	
	Student(int id0,String surname0, String name0, String fathername0,
			String birthDate0, String address0, String telphnumber0,
			String facultet0, String curs0, String group0){
		id = id0;
		surname = surname0;
		name = name0;
		fathername = fathername0;
		birthDate = birthDate0;
		address = address0;
		telphnumber = telphnumber0;
		facultet = facultet0;
		curs = curs0;
		group = group0;
	}
	
	
	String getId(){
		return Integer.toString(id);
	}	
	String getFullName(){
		return surname+" "+name+" "+fathername;
	}
	String getBirthDate(){
		return birthDate;
	}
	int getBirthYear() {
		String[] date = getBirthDate().split("\\.");
		return Integer.parseInt(date[2]);
	}
	String getAddress(){
		return address;
	}
	String getFacultet(){
		return facultet;
	}
	String getPhnumber(){
		return telphnumber;
	}
	String getCurs(){
		return curs;
	}
	String getGroup(){
		return group;
	}
	
	
	void setId(int i){
		id = i;
	}	
	void setFullName(String s,String n, String f){
		surname = s;
		name = n;
		fathername = f;
	}
	void setBirthDate(String b){
		birthDate = b;
	}
	void setAddress(String a){
		address = a;
	}
	void setFacultet(String f){
		facultet = f;
	}
	void setPhnumber(String t){
		telphnumber = t;
	}
	void setCurs(String c){
		curs = c;
	}
	void setGroup(String g){
		group = g;
	}
	
	@Override
	public String toString() {
		String s="id: " + getId() +
				"; full name: " +  getFullName()+
				"; birthDate: " + birthDate +
				"; address: " + address +
				"; telphone number: " + telphnumber +
				"; facultet: " + facultet +
				"; curs: " + curs +
				"; group: " + group;
		return s;
	}
	
	void checkFacultet(String f) {
		if (getFacultet()==f)
			System.out.println(toString());
	}
	
	void checkCurs(String f, String c) {
		if (getFacultet()==f&&getCurs()==c)
			System.out.println(toString());
	}
	
	void checkYear(int y) {
		if (getBirthYear()>y)
			System.out.println(toString());
	}
	
	void checkGroup(String f, String c, String g) {
		if (getFacultet()==f&&getCurs()==c&&getGroup()==g)
			System.out.println(toString());
	}

}

public class Task2_1 {

	public static void main(String[] args) {
		// 2.1
		
		Student[] std = new Student[4];
		std[0] = new Student(1,"A","A","A","14.03.2003","street n1","3801","MMF","comp_mat","3");
		std[1] = new Student(2,"B","B","B","14.03.2004","street n2","3802","IT","inform","2");
		std[2] = new Student(3,"C","C","C","15.02.2001","street n3","3803","MMF","math","4");
		std[3] = new Student(4,"D","D","D","11.10.2005","street n4","3804","MMF","comp_mat","1");
		
		// a
		String facul = "MMF";
		System.out.println("\na) facultet: "+facul);
		for(Student s:std)
			s.checkFacultet(facul);

		// b
		String curs = "comp_mat";
		System.out.println("\nb) curs "+curs+" of "+facul+" facultet");
		for(Student s:std)
			s.checkCurs(facul,curs);
		
		// c
		int year = 2003;
		System.out.println("\nc) year of birthday: "+year);
		for(Student s:std)
			s.checkYear(year);
		
		// d
		String group = "3";
		System.out.println("\nd) group "+group+" of curs "+curs+" of "+facul+" facultet");
		for(Student s:std)
			s.checkGroup(facul,curs,group);
				
		
		
	}

}
