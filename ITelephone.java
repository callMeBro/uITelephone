/*
 * Abstract class that provide class that provide the necessary functionality to
 * classes that implement it.
 * All methods are public
 *
 */
package itelephone;

/**
 *
 * @author adder
 */
public interface ITelephone {

    public void powerOn();

    public void dial(int phoneNumber);

    public void answer();

    public boolean callPhone(int phoneNumber);

    public boolean isRinging();
}
