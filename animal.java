import java.util.Scanner;
public class animal {
	public static void main(String[]args) {
		String name,gender;
		int age;
		Animala tiger=new Animala();
		tiger.setNameGenderAge("Jack","male",12);
		Scanner sc= new Scanner(System.in);
		Animala lion= new Animala();
		System.out.print("Please enter animal's name:");
		name=sc.nextLine();
		System.out.print("Please enter animal's gender:");
		gender=sc.nextLine();
		System.out.print("Please enter animal's age:");
		age=sc.nextInt();
		lion.setNameGenderAge(name, gender, age);
		System.out.print(tiger.sayHi());
		System.out.print(lion.sayHi());
		System.out.println(Animala.getNumber());
		}
}

class Animala{
	String name,gender;
	int age;
	static int animalNumber;
	public Animala() {
	}
	public void setNameGenderAge(String name,String gender,int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
		animalNumber++;
	}
	public static int getNumber() {
		return animalNumber;
	}
	public String sayHi() {
		return ("Hi,my name is "+this.name+
					", I'm "+age+" years old, "+gender+".\n" );
	}
}