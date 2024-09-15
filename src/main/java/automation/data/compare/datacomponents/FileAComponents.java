package automation.data.compare.datacomponents;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@ExcelSheet("Data")
@EqualsAndHashCode(exclude = {"country"})
public class FileAComponents {

    @ExcelCellName("name")
    private String name;

    @ExcelCellName("EEID")
    private String eeid;

    @ExcelCellName("Full Name")
    private String fullName;

    @ExcelCellName("Job Title")
    private String jobTitle;

    @ExcelCellName("Department")
    private String department;

    @ExcelCellName("Business Unit")
    private String businessUnit;

    @ExcelCellName("Gender")
    private String gender;

    @ExcelCellName("Ethnicity")
    private String ethnicity;

    @ExcelCellName("Age")
    private String age;

    @ExcelCellName("Hire Date")
    private String hireDate;

    @ExcelCellName("Annual Salary")
    private String annualSalary;

    @ExcelCellName("Bonus %")
    private String bonusPercentage;

    @ExcelCellName("Country")
    private String country;

    @ExcelCellName("City")
    private String city;

    @ExcelCellName("Exit Date")
    private String exitDate;
}
