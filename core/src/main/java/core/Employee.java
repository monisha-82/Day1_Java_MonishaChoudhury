package core;

public class Employee {
    private int empId;
    private String empName;
    private int empAge;
    private String empDepartment;

    //constructors
    public Employee(){
//        this(0, "ABC" , "XYZ");
        System.out.println("Pass employee id, employee name, employee age and employee department.");
    }

    public Employee(int empId){
//        this(empId, "ABC", "XYZ");
        System.out.println("Pass employee id, employee name, employee age and employee department.");
    }

    public Employee(int empId, String empName){
//        this(empId,empName,"XYZ");
        System.out.println("Pass employee id, employee name, employee age and employee department.");
    }

    public Employee(String empName, String empDepartment){
        System.out.println("Pass employee id, employee name, employee age and employee department.");
    }

    public Employee(int empId, String empName, int empAge, String empDepartment){
        this.empId = empId;
        this.empName =empName;
        this.empAge = empAge;
        this.empDepartment = empDepartment;
    }

    //getters and setters
    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }

    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String empName){
        this.empName = empName;
    }

    public int getEmpAge(){
        return empAge;
    }
    public void setEmpAge(int empAge){
        this.empAge = empAge;
    }

    public String getEmpDepartment(){
        return empDepartment;
    }
    public void setEmpDepartment(String empDepartment){
        this.empDepartment = empDepartment;
    }

    public String getEmployeeDetails(){
        return "Employee{ "+"empId= "+empId+ " , name= "+empName+ " , age= "+empAge+ " , department= "+empDepartment+ " }" ;
    }

}
