package constructors;

 class conexe {

		int id;
		String name;

	void display() {
		System.out.println(id+" "+name);
		}
	}

	public class con1 {

	public static void main(String[] args) {

		conexe emp1=new conexe();
		conexe emp2=new conexe();

		emp1.display();
		emp2.display();
		}
	}

//parameterized constructor

package constructors;

class Std{
	
	
		int id;
		String name;

		Std(int i,String n)
		{
		id=i;
		name=n;
		}

		void display() {
		System.out.println(id+" "+name);
		}
	}

	public class con2 {
	public static void main(String[] args) {

		Std std1=new Std(3,"Jhon");
		Std std2=new Std(15,"Mexi");
		std1.display();
		std2.display();
			}
	}

