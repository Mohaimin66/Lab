
public class Pet_raring {
	
	class Pet {
		public String name;
	    public int age;
	    public int weight;
	    
	    
	    
	    public void set_name(String nm)
	    {
	        name= nm;
	    }
	    
	    public void set_age(int a)
	    {
	        age=a;
	    }
	    
	    public void set_weight(int a)
	    {
	        weight=a;
	    }
	    
	    public void get_name()
	    {
	        System.out.println("Name: "+name+".");
	    }
	    
	    public void get_age()
	    {
	        System.out.println("Age: "+age+" years.");
	    }
	    
	    public void get_weight()
	    {
	        System.out.println("Weight: "+weight+" kg.");
	    }
	    


	}
	


class Cat extends Pet {
			public void what_are_you() {
				System.out.println("I am a cat.\n");
			}

		}




class Dog extends Pet {
			public void what_are_you() {
				System.out.println("I am a dog.\n");
			}

		}
	
public static void main (String[] args) {
    Cat pet1= new Cat();
    pet1.set_weight(6);
    pet1.get_weight();
    pet1.set_age(13);
    pet1.get_age();
    pet1.set_name("Tommy");
    pet1.get_name();
    pet1.what_are_you();
    
    System.out.println("\n");
    Dog pet2= new Dog();
    pet2.set_weight(6);
    pet2.get_weight();
    pet2.set_age(13);
    pet2.get_age();
    pet2.set_name("Tommy");
    pet2.get_name();
    pet2.what_are_you();
    
}


}
