import java.util.InputMismatchException;
import java.util.Scanner;
//somenewchanse
public class Main {
    public static void main(String[] args) {
        //qweqweqweqweqweqw
        //qweqwewqeqwewqeqwewqe
        int choise=1;
        Human human = new Human();
        People people = new People();
        Scanner scan = new Scanner(System.in);
        while(choise !=0){
            System.out.println("1 - add | 2 - delete | 3 - show | 4 - age of unit | 0 - exit");
            try{
                choise = scan.nextInt();
                switch (choise) {
                    case (1):
                        people.add();
                        break;
                    case (2):
                        people.delete();
                        break;
                    case (3):
                        people.show();
                        break;
                    case (4):
                        System.out.print("select id: ");
                        int choiise = scan.nextInt();
                        for(int i=0;i<people.array.length;i++){
                            if(choiise==people.array[i].getId()){
                                people.array[i].age();
                                break;
                            }
                        }
                        break;
                    case (0):
                        System.out.println("Terminating...");
                        break;
                    default:
                        System.out.println("wrong number, try again");

                }
            }catch(InputMismatchException e){
                System.out.println("no letter allowed");
            }
            scan.nextLine();
        }
        }
}
