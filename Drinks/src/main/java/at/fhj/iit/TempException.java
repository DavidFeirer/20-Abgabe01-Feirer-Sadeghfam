package at.fhj.iit;

/**
 * Exception thrown when the Temperature is not right for the type of wine
 */
public class TempException extends Exception{

    /**
     * Error Message for the TempException
     */
    private static final String EXCEPTION_MESSAGE = "Wine cannot be served please check the Temperature";

    /**
     * Exception with default Exception message
     */
    public TempException(){
        super(EXCEPTION_MESSAGE);
    }
}
