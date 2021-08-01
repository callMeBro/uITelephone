/*
 * Cant instantiate an iterface use the class thar implemented that
 * functionality
 */
package itelephone;

/**
 *
 * @author adder
 */
public class Main {

    public static void main(String[] args) {
        ITelephone dPhone;
        dPhone = new DeskPhone(123456);
        dPhone.powerOn();
        dPhone.callPhone(123456);
        dPhone.answer();

        System.out.println();

        dPhone = new MobilePhone(23456);
        dPhone.powerOn();
        dPhone.callPhone(23456);
        dPhone.answer();
    }
}
