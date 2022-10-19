import java.util.Calendar;

public class Human {
    String name;
    int birthYear;
    String residence;
    String job;

    Human(String name, int age, String residence, String job){
        this.name = name;
        if (age <= 0) {
            birthYear = Calendar.getInstance().getWeekYear() - Math.abs(age);
        } else {
            birthYear = Calendar.getInstance().getWeekYear() - age;
        }
        this.residence = residence;
        this.job = job;
    }
    Human(int age, String residence, String job) {
        this("No data", age, residence, job);
    }

    Human(String name,  String job, int age) {

        this.name = name;
        this.birthYear = Calendar.getInstance().getWeekYear() - Math.abs(age);
        this.job = job;
        this.residence = "No data";
    }
    Human(String name, int age, String residence) {

        this.name = name;
        this.birthYear = Calendar.getInstance().getWeekYear() - Math.abs(age);
        this.job = "No Data";
        this.residence = residence;
    }



    void greeting(){
        System.out.println("Привет! Меня зовут "+name+" Я из города "+residence+" Я родился в "+birthYear+" году. Я работаю на должности "+job+". Будем знакомы!");

    }
}


