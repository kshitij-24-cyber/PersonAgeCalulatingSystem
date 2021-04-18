package firstTask;

public class person {

    private String firstNAme;
    private String lastNAme;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    public person(String firstNAme, String lastNAme, int birthMonth, int birthDay, int birthYear) {
        this.firstNAme = firstNAme;
        this.lastNAme = lastNAme;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    public String getFirstNAme() {
        return firstNAme;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstNAme(String firstNAme) {
        this.firstNAme = firstNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setBirthDate(int month, int day, int year) {
        if ((month >= 1 && month <= 12) && (day >= 1 && day <= 31) && (year <= 1900 && year >= 2020)) {
            if (month == 2 & (day <= 1 && day >= 28)) {
                this.birthDay = day;
                this.birthMonth = month;
                this.birthYear = year;
            } else {
                System.out.println("A/c to feburay month, day is wrong");
            }
        } else {
            System.out.println("invalid input");
        }
    }

    public int computeAge() {
        int currentDate = 5;
        int currentMonth = 4;
        int currentYear = 2007;

        int[] month = {31, 28, 31, 30, 31, 30, 31,
                31, 30, 31, 30, 31};


        if (this.birthDay > currentDate) {
            currentMonth = currentMonth - 1;
            currentDate = currentDate + month[this.birthMonth - 1];
        }
        if (this.birthMonth > currentMonth) {
            currentYear = currentYear - 1;
            currentMonth = currentMonth + 12;
        }
        return currentYear - this.birthYear;
    }

    public boolean isAdult() {

        return computeAge() >= 18;

    }

    public void printDetails() {
        System.out.println(this.firstNAme + " " + this.lastNAme
                + " " + "born " + this.birthMonth + "/" + this.birthDay + "/" +
                birthYear + " age " +
                computeAge() + " " + (isAdult() ? "adult" : "minor"));


    }
}


