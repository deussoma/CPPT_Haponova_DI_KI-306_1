package ki306.haponova.lab4;

/**
 * Class CalcException more precises ArithmeticException
 *
 * @author Haponova Darina
 */

public class CalcException extends ArithmeticException{
    public CalcException(){}
    public CalcException(String cause)
    {
        super(cause);
    }

}
