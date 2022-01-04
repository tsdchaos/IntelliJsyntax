package comsyntax.Class28HW;

import java.util.HashMap;
import java.util.Map;

public class EmployeeSalary {
    //Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
    //John Smith=$100000
    public static void main(String[] args) {
        HashMap<String, Integer> employeeMap=new HashMap<>();
        employeeMap.put("John Smith", 100000);
        employeeMap.put("Alan Shwartz", 125000);
        employeeMap.put("Jack Valin", 140000);
        employeeMap.put("Steven Soon", 125000);
        String maxSalaryEmpName="";
        double maxSalary=0;
        for (Map.Entry<String, Integer> employ:employeeMap.entrySet()) {
            if(employ.getValue()>maxSalary){
                maxSalary=employ.getValue();
                maxSalaryEmpName=employ.getKey();
            }
        }
        System.out.println(maxSalaryEmpName+" earns the highest salary of $"+(int)maxSalary+" per year");

    }
}
