import java.util.*;
public class Main extends Hosteller{
    public static Hosteller getHostellerDetails(){
        Scanner sc=new Scanner(System.in);
        Hosteller hh=new Hosteller();
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int id=sc.nextInt();
        hh.setStudentId(id);
        System.out.println("Student Name");
        String n=sc.next();
        hh.setName(n);
        System.out.println("Department Id");
        int did=sc.nextInt();
        hh.setDepartmentId(did);
        System.out.println("Gender");
        String g=sc.next();
        hh.setGender(g);
        System.out.println("Phone Number");
        String p=sc.next();
        hh.setPhone(p);
        System.out.println("Hostel Name");
        String hn=sc.next();
        hh.setHostelName(hn);
        System.out.println("Room Number");
        int rn=sc.nextInt();
        hh.setRoomNumber(rn);
        return hh;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Hosteller host;
        host=getHostellerDetails();
        System.out.println("Modify Room Number(Y/N)");
        char rd=sc.next().charAt(0);
        if(rd=='Y'){
            System.out.println("New Room Number");
            int rdn=sc.nextInt();
            host.setRoomNumber(rdn);
        }
        System.out.println("Modify Phone Number(Y/N)");
        char pd=sc.next().charAt(0);
        if(pd=='Y'){
            System.out.println("New Phone Number");
            String pn=sc.next();
            host.setPhone(pn);
        }
        System.out.println("The Student Details:");
        System.out.println(host.getStudentId()+" "+host.getName()+" "+host.getDepartmentId()+" "+host.getGender()+" "+host.getPhone()+" "+host.getHostelName()+" "+host.getRoomNumber());
    }
}