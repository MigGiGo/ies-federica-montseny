public interface ICompany {

    void showDepartmentNames();
    Employee[] getEmployees(String departmentName);
    void showEmployees (String departmentName);
    void showAllEmployees ();

}
