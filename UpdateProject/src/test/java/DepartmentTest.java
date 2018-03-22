import bean.Department;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;



public class DepartmentTest {
    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void checkDepartment() {
        Department department = new Department();

        Set<ConstraintViolation<Department>> constraintViolations =
                validator.validate(department);

        for(ConstraintViolation<Department> constraintViolation: constraintViolations){

            StringBuilder stringBuilder = new StringBuilder("property: ");
            stringBuilder.append(constraintViolation.getPropertyPath());
            stringBuilder.append(constraintViolation.getInvalidValue());
            stringBuilder.append(constraintViolation.getMessage());

        }
    }
}