import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Human {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int dateYear;
    private int dateMonth;
    private int dateDay;
    private String sex;
    public Human (){

    }

    public Human(int id1, String name1, String surname1, String patronymic1, int dateYear1, int dateMonth1,int dateDay1, String sex1){
        this.id=id1;
        this.name=name1;
        this.surname=surname1;
        this.patronymic=patronymic1;
        this.dateYear=dateYear1;
        this.dateMonth=dateMonth1;
        this.dateDay=dateDay1;
        this.sex=sex1;
    }

    void age(){
        LocalDate currDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        int year=currDate.getYear();
        int month=currDate.getMonthValue();
        int day=currDate.getDayOfMonth();
        int delta = year-dateYear;
        int delta1 = month-dateMonth;
        int delta2 = day-dateDay;
        if(((delta1>=0)&&(delta2>=0))||(delta1>0)) System.out.println(delta);
        else System.out.println(delta-1);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSex() {
        return sex;
    }
}


