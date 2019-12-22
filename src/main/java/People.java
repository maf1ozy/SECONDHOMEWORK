import java.util.Scanner;

public class People {
    Scanner scanner = new Scanner(System.in);
    Human[] array = new Human[10];
    private int index=0;
    void add(){
        if(index>array.length){
            int people = array.length+10;
            Human [] array1 = new Human[people];
            for(int i=0;i<array.length;i++){
                array1[i]=array[i];
            }
            array=array1;
        }
        System.out.println("Enter ID");
        int id = scanner.nextInt();
        System.out.println("Enter name: ");
        String name = scanner.next();
        System.out.println("Enter surname: ");
        String surname = scanner.next();
        System.out.println("Enter patronymic: ");
        String patronymic = scanner.next();
        System.out.println("Enter Year of birth: ");
        int dateYear = scanner.nextInt();
        System.out.println("Enter Month of birth: ");
        int dateMonth = scanner.nextInt();
        System.out.println("Enter Day of birth: ");
        int dateDay = scanner.nextInt();
        System.out.println("Enter your gender: 0 - man; 1-woman");
        boolean gender=scanner.hasNextBoolean();
        String sex;
        if(gender==true){
            sex="female";
        }
        else sex="male";
        scanner.nextLine();
        array[index]=new Human(id,name,surname,patronymic,dateYear,dateMonth,dateDay,sex);
        index++;
    }
    void show(){
        for(int i=0;i<index;i++){
            System.out.println("id: "+ array[i].getId()+" name: "+array[i].getName()+" surname: "+array[i].getSurname()+
                    "patronymic: "+array[i].getPatronymic()+ "gender: "+ array[i].getSex());
        }
    }

    void delete(){
        System.out.print("select id: ");
        int choiise = scanner.nextInt();
        for(int i=0;i<array.length;i++){
            if(choiise==array[i].getId()){
                array[i]=null;
                break;
            }
        }
        }
    }
