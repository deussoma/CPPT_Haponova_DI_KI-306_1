package ki306.haponova.lab3;

/**
 * The {@code ExperimentalCat} class extends the {@link Cat} class and implements
 * the {@link ExperimentalSubject} interface. It represents a cat that can be used
 * as an experimental subject.
 *
 * @author Haponova Darina
 */
public class ExperimentalCat extends Cat implements ExperimentalSubject {
    /**
     * Gets the type of experimental subject, which is "Cat" in this case.
     *
     * @return The type of experimental subject.
     */
    @Override
    public String getSubjectType() {
        return "Cat";
    }
}

