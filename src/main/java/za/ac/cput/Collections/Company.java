package za.ac.cput.Collections;


 /* ADP term2 Assignment
  *Author: Zintle Zothe_216130565
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Company {
    public static void main(String[] args){

        // ******* MAP *****
        //adding staff
        HashMap<Integer,String> staff= new HashMap<>();
        staff.put(20212, "Nkosiphendule Roto");
        staff.put(20213, "Vuyolwethu Sipaji");
        staff.put(20214, "Ncumisa Mvalo");

        System.out.println("Staff list: "+"\n"+ staff);


        //remove
        staff.remove(20213);

        System.out.println("\n" + "Current staff list : "+ "\n"+ staff);

        // finding a staff member
        // using staff ID to check if the id does exist and if it does,display the staff name

        System.out.println("\n"+ "Name of the employee with staff ID 20212: ");
        if(staff.containsKey(20212))
            System.out.println("The staffID belongs to "+ staff.get(20212));
        else
            System.out.println(" the ID does not exist");
        //*****end of map ********

        //******* Set   *******

        // adding types of departments tha arre available in the company
        HashSet<String> Department= new HashSet<>();
        Department.add("Marketing");
        Department.add("Human Resource");
        Department.add("Sales");
        Department.add("Finance");

        System.out.println("\n"+ "Departments  in the company before COVID-19 pandemic: "+"\n"+ Department);

        // remove
        Department.remove("Finance");
        System.out.println("\n" + "Current Departments list : "+ "\n"+ Department+ "\n");

        //find

        System.out.println(Department.contains("Sales"));

        //***** List *****

        //add branch office location using linked-list
        LinkedList<String> branchOffice = new LinkedList<>();
        branchOffice.add("Cape Town");
        branchOffice.add("Khayelitsha");
        branchOffice.add("Camps Bay");

        System.out.println("\n" + "Company branch offices:" + branchOffice+ "\n");

        //remove
        branchOffice.remove("Cape Town");
        System.out.println("branch offices that are open during the lockdown: "+ branchOffice);

        //find
        System.out.println(branchOffice.contains("Khayelitsha"));



    }
}
