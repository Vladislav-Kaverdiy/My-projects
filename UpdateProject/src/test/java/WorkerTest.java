import bean.Department;
import bean.Worker;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class WorkerTest {
    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void checkWorker() {
        Worker worker = new Worker();

        Set<ConstraintViolation<Worker>> constraintViolations =
                validator.validate(worker);

        for(ConstraintViolation<Worker> constraintViolation: constraintViolations){

            StringBuilder stringBuilder = new StringBuilder("property: ");
            stringBuilder.append(constraintViolation.getPropertyPath());
            stringBuilder.append(constraintViolation.getInvalidValue());
            stringBuilder.append(constraintViolation.getMessage());

        }
    }
}