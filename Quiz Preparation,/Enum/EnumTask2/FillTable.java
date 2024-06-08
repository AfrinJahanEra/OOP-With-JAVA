package EnumTask2;

import java.util.List;

public class FillTable {
    private List<EmployeeData> items;

    public FillTable(List<EmployeeData> items) {
        this.items = items;
    }

    public Object getValueAt(int row, ColumnIndex col) {
        EmployeeData employeeData = items.get(row);

        switch (col) {
            case NAME_INDEX:
                return employeeData.getName();
            case DESCRIPTION_INDEX:
                return employeeData.getDescription();
            case ADDRESS_INDEX:
                return employeeData.getAddress();
            default:
                return "";
        }
    }
} 
