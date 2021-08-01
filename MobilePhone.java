/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itelephone;

/**
 *
 * @author adder
 */
public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int num) {
        this.myNumber = num;
    }

    @Override
    public void powerOn() {
        System.out.println("Powering on MobilePhone");
        isOn = true;
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone.");
        } else {
            System.out.println("Phone is switched off.");
        }
        System.out.println("Now ringing " + phoneNumber + " on deskPhone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the MobilePhone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("I'm Ringing ");

        } else {
            isRinging = false;
        }
        return isRinging();
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
