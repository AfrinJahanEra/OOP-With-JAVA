import java.util.Scanner;

interface Client {
    void input();  // public + abstract
    void output(); // public + abstract
}

class Interface implements Client {
    String name;
    double sal;

    public void input() {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Username:");
        name = r.nextLine();

        System.out.println("Enter Salary:");
        sal = Double.parseDouble(r.nextLine());
    }

    public void output() {
        System.out.println(name + " " + sal);
    }

    public static void main(String[] args) {
        Client c = new Interface();
        c.input();
        c.output();
    }
}