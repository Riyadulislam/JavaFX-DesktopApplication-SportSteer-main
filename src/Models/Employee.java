/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Dexter Sam
 */
public class Employee {
    
    private  String EmployeeNameDB;
    private  String EmployeeAgeDB;
    private  String EmployeeSalaryDB;
    private  String EmployeePhoneDB;
    private  String EmployeeMailDB;
    private  String EmployeeAddressDB;
    private  String EmployeeBloodGroupDB;

    public Employee(String EmployeeNameDB, String EmployeeAgeDB, String EmployeeSalaryDB, String EmployeePhoneDB, String EmployeeMailDB, String EmployeeAddressDB, String EmployeeBloodGroupDB) {
        this.EmployeeNameDB = EmployeeNameDB;
        this.EmployeeAgeDB = EmployeeAgeDB;
        this.EmployeeSalaryDB = EmployeeSalaryDB;
        this.EmployeePhoneDB = EmployeePhoneDB;
        this.EmployeeMailDB = EmployeeMailDB;
        this.EmployeeAddressDB = EmployeeAddressDB;
        this.EmployeeBloodGroupDB = EmployeeBloodGroupDB;
    }
   
  

    public String getEmployeeNameDB() {
        return EmployeeNameDB;
    }

    public void setEmployeeNameDB(String EmployeeNameDB) {
        this.EmployeeNameDB = EmployeeNameDB;
    }

    public String getEmployeeAgeDB() {
        return EmployeeAgeDB;
    }

    public void setEmployeeAgeDB(String EmployeeAgeDB) {
        this.EmployeeAgeDB = EmployeeAgeDB;
    }

    public String getEmployeeSalaryDB() {
        return EmployeeSalaryDB;
    }

    public void setEmployeeSalaryDB(String EmployeeSalaryDB) {
        this.EmployeeSalaryDB = EmployeeSalaryDB;
    }

    public String getEmployeeMailDB() {
        return EmployeeMailDB;
    }

    public void setEmployeeMailDB(String EmployeeMailDB) {
        this.EmployeeMailDB = EmployeeMailDB;
    }

    public String getEmployeeAddressDB() {
        return EmployeeAddressDB;
    }

    public void setEmployeeAddressDB(String EmployeeAddressDB) {
        this.EmployeeAddressDB = EmployeeAddressDB;
    }

    public String getEmployeePhoneDB() {
        return EmployeePhoneDB;
    }

    public void setEmployeePhoneDB(String EmployeePhoneDB) {
        this.EmployeePhoneDB = EmployeePhoneDB;
    }

    public String getEmployeeBloodGroupDB() {
        return EmployeeBloodGroupDB;
    }

    public void setEmployeeBloodGroupDB(String EmployeeBloodGroupDB) {
        this.EmployeeBloodGroupDB = EmployeeBloodGroupDB;
    }


            
      
}
