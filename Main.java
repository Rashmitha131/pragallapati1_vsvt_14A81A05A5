import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
         boolean f=true;
         Scanner sc=new Scanner(System.in);
         while(f) {
         System.out.println("1.Add Student");
         System.out.println("2.Remove Student");
         System.out.println("3.Display Students details");
         System.out.println("4.ID of Student");
         System.out.println("5.Set ID of Student");
         System.out.println("6.Full Name of Student");
         System.out.println("7.Set Full Name of Student");
         System.out.println("8.Date of Birth of Student");
         System.out.println("9.Set Date of Birth of Student");
         System.out.println("10.Average marks");
         System.out.println("11.Set Average Marks");
         System.out.println("12.Exit");
         System.out.println("Enter your choice:");
         int ch=sc.nextInt();
         Student s=new Student(1,"Divya",1997-jan-05,78);
         switch(ch)
         {
            case 1:System.out.println("Enter id:");
                   int id=sc.nextInt();
                   System.out.println("Enter full name");
                   String fname=sc.next();
                   System.out.println("Enter date of birth");
                   String d=sc.next();
                   Date dob=new Date("1997-oct-28");
                   System.out.println("Enter marks:");
                   double marks=sc.nextDouble();
                   Student s1=new Student(id,fname,dob,marks);
                   break;
            case 2:break;
            case 3:break;
            case 4:s.getId();
                   break;
            case 5:int id1=sc.nextInt();
                   s.setId(id1);
                   break;
            case 6:s.getFullName();
                   break;
            case 7:String name=sc.next();
                   s.setFullName(name);
                   break;
            case 8:s.getBirthDate();
                   break;
            case 9:Date d1=new Date("1992-jan-18");
                   s.setBirthDate(d1);
                   break;
            case 10:s.getAvgMark();
                    break;
            case 11:double mark=sc.nextDouble();
                    s.setAvgMark(mark);
                    break;
            case 12:f=false;
                    break;
         }
        }
	}

}
