package VD2;

import java.util.Scanner;

public class Hobby {
    private String hobby;

    public Hobby() {
    }

    public Hobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void InputHobby(){
        Scanner scanner = new Scanner(System.in);
        this.hobby = scanner.next();
    }

    @Override
    public String toString() {
        return  hobby ;
    }
}
