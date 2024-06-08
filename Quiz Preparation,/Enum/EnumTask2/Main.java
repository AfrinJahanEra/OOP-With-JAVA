package EnumTask2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<EmployeeData> employeeDataList = new ArrayList<>(Arrays.asList(
                new EmployeeData("Alice", "123 Main St", "Software Engineer"),
                new EmployeeData("Bob", "456 Elm St", "Data Analyst"),
                new EmployeeData("Charlie", "789 Oak St", "Project Manager")
        ));

        FillTable fillTable = new FillTable(employeeDataList);

        System.out.println(fillTable.getValueAt(0, ColumnIndex.ADDRESS_INDEX));
    }
}
