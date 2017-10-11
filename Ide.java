import java.util.Scanner;

class Pet_raring{


    
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
    
    public void String get_name()
    {
        System.out.println("Name: "+name);
    }
    
    public void get_age()
    {
        System.out.println("Age: "+age);
    }
    
    public void get_weight()
    {
        System.out.println("Weight: "+weight);
    }
    



public static void main (String[] args) {
    Pet_raring cat= new Pet_raring();
    cat.set_weight(6);
    cat.get_weight();
    cat.set_age(13);
    cat.get_age();
    cat.set_name("Tommy");
    cat.get_name();
}

}