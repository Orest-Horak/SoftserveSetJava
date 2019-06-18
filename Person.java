package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    private String name;
    private int birthyear;
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public Person() {}
    public String getName() {
        return name;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public Person(String name, int birthyear) {
        this.name = name;
        this.birthyear = birthyear;

    }
    public int age() {
        int now=2019;
        return(now-this.birthyear);
    }
    public void input() throws IOException {

        System.out.println("What is your name ? ");
        name= bf.readLine();
        System.out.println("What is your birth year?");
        birthyear= Integer.parseInt(bf.readLine());
    }

    public void output() throws IOException {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age());
    }
        public String changeName()throws IOException
        {
            System.out.println("new name: ");
            String name1= bf.readLine();
            return this.name=name1;
        }

}

