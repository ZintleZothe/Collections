package za.ac.cput.Collections;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    @Test
        // **** Map testing***

        // add test
    void testAddStaff() {
        HashMap<Integer, String> staff = new HashMap<>();
        staff.put(20212, "Nkosiphendule Roto");
        staff.put(20213, "Vuyolwethu Sipaji");
        staff.put(20214, "Ncumisa Mvalo");

        //add test
        assertEquals(3, staff.size());
    }


    @Test
    void testRemoveStaff() {
        HashMap<Integer, String> staff = new HashMap<>();
        staff.put(20212, "Nkosiphendule Roto");
        staff.put(20213, "Vuyolwethu Sipaji");
        staff.put(20214, "Ncumisa Mvalo");

        //remove test
        staff.remove(20213);
        assertNotEquals(3,staff.size());

    }

    //find test
    @Test
    void testFindStaff() {
        HashMap<Integer, String> staff = new HashMap<>();
        staff.put(20212, "Nkosiphendule Roto");
        staff.put(20213, "Vuyolwethu Sipaji");
        staff.put(20214, "Ncumisa Mvalo");

        //find test
        assertTrue(staff.containsKey(20212),"The ID is found");

    }

    //***** Set testing ***
    // add test
    @Test
    void testAddDepartment() {
        HashSet<String> Department= new HashSet<>();
        Department.add("Marketing");
        Department.add("Human Resource");
        Department.add("Sales");
        Department.add("Finance");

        //add test
        assertEquals(4, Department.size());
    }


    @Test
    void testRemoveDepartment() {
        HashSet<String> Department= new HashSet<>();
        Department.add("Marketing");
        Department.add("Human Resource");
        Department.add("Sales");
        Department.add("Finance");

        //remove test
        Department.remove("Finance");
        assertNotEquals(4,Department.size());

    }

    //find test
    @Test
    void testFindDepartment() {
        HashSet<String> Department= new HashSet<>();
        Department.add("Marketing");
        Department.add("Human Resource");
        Department.add("Sales");
        Department.add("Finance");

        //find test
        assertSame("Sales", "Sales");

    }

    //***** List testing ***
    // add test
    @Test
    void testAddBranch() {
        LinkedList<String> branchOffice = new LinkedList<>();
        branchOffice.add("Cape Town");
        branchOffice.add("Khayelitsha");
        branchOffice.add("Camps Bay");

        //add test
        assertEquals(3, branchOffice.size());
    }


    @Test
    void testRemoveBranch() {
        LinkedList<String> branchOffice = new LinkedList<>();
        branchOffice.add("Cape Town");
        branchOffice.add("Khayelitsha");
        branchOffice.add("Camps Bay");

        //remove test
        branchOffice.remove("Finance");
        assertEquals(3,branchOffice.size());

    }

    //find test
    @Test
    void testFindBranch() {
        LinkedList<String> branchOffice = new LinkedList<>();
        branchOffice.add("Cape Town");
        branchOffice.add("Khayelitsha");
        branchOffice.add("Camps Bay");

        //find test
        assertSame("Khayelitsha", "Khayelitsha");

    }




}