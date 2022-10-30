import java.util.Scanner;
import java.util.ArrayList;


class Main {
    public static void main(String args[]){
        System.out.println("Please, login");
        chooseUsers();
    }

    public static String chooseUsers() {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Choose your specialty: ");
        System.out.println("(1) Director");
        System.out.println("(2) HR");
        System.out.println("(3) SMM");
        System.out.println("(4) Manager");
        System.out.println("(5) Worker");
        System.out.println("(6) Deliveryman");
        while (true) {
            System.out.println("Your choice: ");
            String spec = Scanner.nextLine();
            if (spec.equals("1")) {
                System.out.println("Welcome director!");
                System.out.println("Enter your login and password");
                directorLgPs();
                break;
            } else if (spec.equals("2")) {
                System.out.println("Welcome HR Manager!");
                System.out.println("Enter your login and password");
                hrLgPs();
                break;
            } else if (spec.equals("3")) {
                System.out.println("Welcome SMM!");
                System.out.println("Enter your login and password");
                smmLgPs();
                break;
            } else if (spec.equals("4")) {
                System.out.println("Welcome Manager!");
                System.out.println("Enter your login and password");
                managerLgPs();
                break;
            } else if (spec.equals("5")) {
                System.out.println("Welcome Worker!");
                System.out.println("Enter your login and password");
                workerLgPs();
                break;
            } else if (spec.equals("6")) {
                System.out.println("Welcome Deliveryman!");
                System.out.println("Enter your login and password");
                deliverymanLgPs();
                break;
            } else {
                System.out.println("We don't have such worker.");
                System.out.println("If you want to try again, write 0");
                System.out.println("If you want to exit, write 1");
                int exit = Scanner.nextInt();
                if (exit == 0) {
                    chooseUsers();
                } else {
                    System.exit(0);
                }
            }
        }
        return "";
    }

    public static void directorLgPs() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> LogArrList = new ArrayList<String>();
        ArrayList<String> PassArrList = new ArrayList<String>();
        LogArrList.add("Director01");
        PassArrList.add("director01");
        LogArrList.add("Director02");
        PassArrList.add("director02");
        do {
            System.out.println("Enter your login");
            String login = scanner.next();
            scanner.nextLine();
            System.out.println("Enter your password");
            String password = scanner.next();
            scanner.nextLine();
            boolean haveLogin = false;
            if (LogArrList.contains(login) && PassArrList.contains(password)){
                haveLogin = true;
            }else{
                haveLogin = false;
            }
            if (haveLogin) {
                System.out.println("Director, you've entered successfully");
                break;
            } else {
                System.out.println("Please try again");
            }
        } while (true);
    }

    public static void hrLgPs() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> LogArrList = new ArrayList<String>();
        ArrayList<String> PassArrList = new ArrayList<String>();
        LogArrList.add("HR01");
        PassArrList.add("hr01");
        LogArrList.add("HR02");
        PassArrList.add("hr02");
        do {
            System.out.println("Enter your login");
            String login = scanner.next();
            scanner.nextLine();
            System.out.println("Enter your password");
            String password = scanner.next();
            scanner.nextLine();
            boolean haveLogin = false;
            if (LogArrList.contains(login) && PassArrList.contains(password)){
                haveLogin = true;
            }else{
                haveLogin = false;
            }
            if (haveLogin) {
                System.out.println("HR, you've entered successfully");
                break;
            } else {
                System.out.println("Please try again");
            }
        } while (true);
    }

    public static void smmLgPs() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> LogArrList = new ArrayList<String>();
        ArrayList<String> PassArrList = new ArrayList<String>();
        LogArrList.add("SMM01");
        PassArrList.add("smm01");
        LogArrList.add("SMM02");
        PassArrList.add("smm02");
        do {
            System.out.println("Enter your login");
            String login = scanner.next();
            scanner.nextLine();
            System.out.println("Enter your password");
            String password = scanner.next();
            scanner.nextLine();
            boolean haveLogin = false;
            if (LogArrList.contains(login) && PassArrList.contains(password)){
                haveLogin = true;
            }else{
                haveLogin = false;
            }
            if (haveLogin) {
                System.out.println("SMM, you've entered successfully");
                break;
            } else {
                System.out.println("Please try again");
            }
        } while (true);
    }

    public static void managerLgPs(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String>LogArrList = new ArrayList<String>();
        ArrayList<String>PassArrList = new ArrayList<String>();
        LogArrList.add("Manager01");
        PassArrList.add("manager01");
        LogArrList.add("Manager02");
        PassArrList.add("manager02");
        do{
            System.out.println("Enter your login");
            String login = scanner.next();
            scanner.nextLine();
            System.out.println("Enter your password");
            String password = scanner.next();
            scanner.nextLine();
            boolean haveLogin = false;
            if (LogArrList.contains(login) && PassArrList.contains(password)){
                haveLogin = true;
            }else{
                haveLogin = false;
            }
            if(haveLogin){
                System.out.println("Manager, you've entered successfully");
                break;
            }else{
                System.out.println("Please try again");
            }
        }while(true);
    }

    public static void workerLgPs(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String>LogArrList = new ArrayList<String>();
        ArrayList<String>PassArrList = new ArrayList<String>();
        LogArrList.add("Worker01");
        PassArrList.add("worker01");
        LogArrList.add("Worker02");
        PassArrList.add("worker02");
        LogArrList.add("Worker03");
        PassArrList.add("worker03");
        LogArrList.add("Worker04");
        PassArrList.add("worker04");
        LogArrList.add("Worker05");
        PassArrList.add("worker05");
        do{
            System.out.println("Enter your login");
            String login = scanner.next();
            scanner.nextLine();
            System.out.println("Enter your password");
            String password = scanner.next();
            scanner.nextLine();
            boolean haveLogin = false;
            if (LogArrList.contains(login) && PassArrList.contains(password)){
                haveLogin = true;
            }else{
                haveLogin = false;
            }
            if(haveLogin){
                System.out.println("Worker, you've entered successfully");
                break;
            }else{
                System.out.println("Please try again");
            }
        }while(true);
    }

    public static void deliverymanLgPs(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String>LogArrList = new ArrayList<String>();
        ArrayList<String>PassArrList = new ArrayList<String>();
        LogArrList.add("Deliver01");
        PassArrList.add("deliver01");
        LogArrList.add("Deliver02");
        PassArrList.add("deliver02");
        LogArrList.add("Deliver03");
        PassArrList.add("deliver03");
        do{
            System.out.println("Enter your login");
            String login = scanner.next();
            scanner.nextLine();
            System.out.println("Enter your password");
            String password = scanner.next();
            scanner.nextLine();
            boolean haveLogin = false;
            if (LogArrList.contains(login) && PassArrList.contains(password)){
                haveLogin = true;
            }else{
                haveLogin = false;
            }
            if(haveLogin){
                System.out.println("Deliver, you've entered successfully");
                break;
            }else{
                System.out.println("Please try again");
            }
        }while(true);
    }
}

