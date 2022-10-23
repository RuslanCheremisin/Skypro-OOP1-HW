import java.util.Calendar;

public class Human {
    private String name;
    private int birthYear;
    private String residence;
    private String job;

    Human(String name, int age, String residence, String job){
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Incorrect info";
        }
        if (age <= 0) {
            birthYear = Calendar.getInstance().getWeekYear() - Math.abs(age);
        } else {
            birthYear = Calendar.getInstance().getWeekYear() - age;
        }
        if (residence != null && !residence.isBlank() && !residence.isEmpty()) {
            this.residence = residence;
        } else {
            this.residence = "Incorrect info";
        }
        if (job != null && !job.isBlank() && !job.isEmpty()) {
            this.job = job;
        } else {
            this.job = "Incorrect info";
        }
    }

    Human() {
    }

    public void setName(String name) {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Incorrect info";
        }
    }

    public void setBirthYear(int birthYear) {
        if (birthYear >= 1900) {
            this.birthYear = birthYear;
        }
    }

    public void setJob(String job) {
        if (job != null && !job.isBlank() && !job.isEmpty()) {
            this.job = job;
        } else {
            this.job = "Incorrect info";
        }

    }

    public void setResidence(String residence) {
        if (residence != null && !residence.isBlank() && !residence.isEmpty()) {
            this.residence = residence;
        } else {
            this.residence = "Incorrect info";
        }
    }

    void greeting(){
        System.out.println("Привет! Меня зовут "+job+" Я из города "+residence+" Я родился в "+birthYear+" году. Я работаю на должности "+job+". Будем знакомы!");

    }
}


