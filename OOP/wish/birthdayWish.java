/*
    Author : Arnob Mahmud

    Mail : arnob.tech.me@gmail.com
*/

package OOP.wish;

class SetPersonData {
    public String birthdayGirl;
    public void personName(String birthdayGirl) 
    {
        this.birthdayGirl = birthdayGirl;
    }
    public SetPersonData() {}
}

class Person extends SetPersonData {
    public void wish()
    {
        System.out.println("Happy Birthday " + birthdayGirl);
    }
}

public class birthdayWish {
    public static void main(String[] args) {
        Person fabrican = new Person();

        fabrican.personName("Anannya");
        fabrican.wish();
    }
}