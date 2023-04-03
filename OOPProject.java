package oop.project;
import java.util.Scanner;


/**
 *
 * 
 */ 

// Daily-Moments Book project

public class OOPProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        User user = new User("habiba","#1234","habob");
        Premium_user premium = new Premium_user("ganna","#5678","batats");
        boolean ans;
        boolean logout;
        do{
        logout = false;

        System.out.println("Daily-Moments Book\n\n");
        System.out.println("Log In as 1. User");
        System.out.println("          2. Premium user\n");
        System.out.print("Enter your choice : ");
        int choice = input.nextInt();

        switch (choice) {
            case 1: {
                boolean IsTrue = user.login();
                if (IsTrue) {
                    System.out.println("\n\nThe Main Menu");
                    System.out.println("--------------\n");
                    System.out.println("1- Timeline\n");
                    System.out.println("2- Filter moments\n");
                    System.out.println("3- Sort moments\n");
                    System.out.println("4- Add new moments\n");
                    System.out.println("5- Edit a moment\n");
                    System.out.println("6- Delete a moment\n");
                    System.out.println("7- Log out\n");
                    

                    int X;
                    do {
                        ans = true;
                        System.out.print("Enter your choice: ");
                        X = input.nextInt();
                        switch (X) {
                            case 1: {
                                System.out.println("\n * TimeLine *\n");
                                user.DisplayMoments();
                                break;
                            }
                            case 2: {

                                System.out.println("\nFilter moments based on :\n");
                                System.out.println("1- Importance rate\n");
                                System.out.println("2- Year\n");
                                do {
                                    ans = true;
                                    System.out.print("Enter your choice: ");
                                    X = input.nextInt();
                                    switch (X) {
                                        //FilterAboveOrBelowXImpRate
                                        case 1: {
                                            System.out.println("\n1- Above X importance rate\n");
                                            System.out.println("2- Below X importance rate\n");
                                            do {
                                                ans = true;
                                                System.out.print("Enter your choice: ");
                                                X = input.nextInt();
                                                switch (X) {
                                                    case 1: {

                                                        System.out.print("\nEnter the value of X : ");
                                                        X = input.nextInt();
                                                        user.FilterAboveXImpRate(X);

                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("\nEnter the value of X : ");
                                                        X = input.nextInt();
                                                        user.FilterBelowXImpRate(X);

                                                        break;
                                                    }
                                                    default: {
                                                        ans = false;
                                                        System.out.println("Invalid number, Try again..\n");
                                                    }
                                                }
                                            } while (ans == false);

                                            break;
                                        }
                                        //FilterInXYear
                                        case 2: {
                                            System.out.print("Enter a year : ");
                                            X = input.nextInt();
                                            user.FilterInXYear(X);
                                            break;
                                        }
                                        default: {
                                            ans = false;
                                            System.out.println("Invalid number, Try again..\n");
                                        }

                                    }

                                } while (ans == false);
                                break;
                            }

                            case 3: {
                                System.out.println("1- Sort moments ascendingly\n");
                                System.out.println("2- Sort moments descendingly\n");
                                do {
                                    ans = true;
                                    System.out.print("Enter your choice: ");
                                    X = input.nextInt();
                                    switch (X) {
                                        case 1: {
                                            user.SortAsc();
                                            break;
                                        }
                                        case 2: {
                                            user.SortDsc();
                                            break;
                                        }
                                        default: {
                                            ans = false;
                                            System.out.println("Invalid number, Try again..\n");
                                        }

                                    }
                                } while (ans == false);
                                break;
                            }
                            case 4: {
                                System.out.println("1- Add memory \n");
                                System.out.println("2- Add achievement\n");

                                System.out.print("Enter your choice: ");
                                X = input.nextInt();
                                switch (X) {
                                    case 1: {
                                        user.insert_memory();
                                        break;
                                    }
                                    case 2: {
                                        user.insert_Achievement();
                                        break;
                                    }
                                    default: {

                                        System.out.println("Invalid number, Try again..\n");
                                    }
                                }

                                break;
                            }
                            case 5: {
                                user.EditMoment();
                                break;
                            }
                            case 6: {
                                user.DeleteMoment();
                                break;
                            }
                            case 7: {
                                logout = true;
                                ans = false;
                                break;
                            }

                            default:
                                System.out.println("Invalid number, Try again..\n");

                        }
                        if( logout == false){
                        System.out.println("Do you want to do another process?(Y/N) : ");
                        while (true) {
                            String again = input.next();
                            if (again.equals("N") || again.equals("n")) {
                                ans = false;
                                break;
                            } else if (again.equals("Y") || again.equals("y")) {
                                ans = true;
                                break;
                            } else {
                                System.out.print("Enter Y or N : ");
                            }
                        }
                        }

                    } while (ans == true);

                }
                break;
            }
            case 2: {
                boolean IsTrue = premium.login();
                if (IsTrue) {
                    System.out.println("\n\nThe Main Menu");
                    System.out.println("--------------\n");
                    System.out.println("1- Timeline\n");
                    System.out.println("2- Filter moments\n");
                    System.out.println("3- Sort moments\n");
                    System.out.println("4- Add new moments\n");
                    System.out.println("5- Edit a moment\n");
                    System.out.println("6- Delete a moment\n");
                    System.out.println("7- Get the average importance rate for all moments\n");
                    System.out.println("8- Get the average importance rate for all moments in a certain year\n");
                    System.out.println("9- Get your top rated moment\n");
                    System.out.println("10- Get your least rated moment\n");
                    System.out.println("11- Get your happiest moment\n");
                    System.out.println("12- Get your saddest moment\n");
                    System.out.println("13- Log out\n");

                    int X;
                    do {
                        ans = true;
                        System.out.print("Enter your choice: ");
                        X = input.nextInt();
                        switch (X) {
                            case 1: {
                                System.out.println("\n * TimeLine *\n");
                                premium.DisplayMoments();
                                break;
                            }
                            case 2: {

                                System.out.println("\nFilter moments based on :\n");
                                System.out.println("1- Importance rate\n");
                                System.out.println("2- Year\n");
                                do {
                                    ans = true;
                                    System.out.print("Enter your choice: ");
                                    X = input.nextInt();
                                    switch (X) {
                                        //FilterAboveOrBelowXImpRate
                                        case 1: {
                                            System.out.println("\n1- Above X importance rate\n");
                                            System.out.println("2- Below X importance rate\n");
                                            do {
                                                ans = true;
                                                System.out.print("Enter your choice: ");
                                                X = input.nextInt();
                                                switch (X) {
                                                    case 1: {

                                                        System.out.print("\nEnter the value of X : ");
                                                        X = input.nextInt();
                                                        premium.FilterAboveXImpRate(X);

                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("\nEnter the value of X : ");
                                                        X = input.nextInt();
                                                        premium.FilterBelowXImpRate(X);

                                                        break;
                                                    }
                                                    default: {
                                                        ans = false;
                                                        System.out.println("Invalid number, Try again..\n");
                                                    }
                                                }
                                            } while (ans == false);

                                            break;
                                        }
                                        //FilterInXYear
                                        case 2: {
                                            System.out.print("Enter a year : ");
                                            X = input.nextInt();
                                            premium.FilterInXYear(X);
                                            break;
                                        }
                                        default: {
                                            ans = false;
                                            System.out.println("Invalid number, Try again..\n");
                                        }

                                    }

                                } while (ans == false);
                                break;
                            }

                            case 3: {
                                System.out.println("1- Sort moments ascendingly\n");
                                System.out.println("2- Sort moments descendingly\n");
                                do {
                                    ans = true;
                                    System.out.print("Enter your choice: ");
                                    X = input.nextInt();
                                    switch (X) {
                                        case 1: {
                                            premium.SortAsc();
                                            break;
                                        }
                                        case 2: {
                                            premium.SortDsc();
                                            break;
                                        }
                                        default: {
                                            ans = false;
                                            System.out.println("Invalid number, Try again..\n");
                                        }

                                    }
                                } while (ans == false);
                                break;
                            }
                            case 4: {
                                System.out.println("1- Add memory \n");
                                System.out.println("2- Add achievement\n");

                                System.out.print("Enter your choice: ");
                                X = input.nextInt();
                                switch (X) {
                                    case 1: {
                                        premium.insert_memory();
                                        break;
                                    }
                                    case 2: {
                                        premium.insert_Achievement();
                                        break;
                                    }
                                    default: {

                                        System.out.println("Invalid number, Try again..\n");
                                    }
                                }

                                break;
                            }
                            case 5: {
                                premium.EditMoment();
                                break;
                            }
                            case 6: {
                                premium.DeleteMoment();
                                break;
                            }
                            case 7: {
                                premium.Avg();
                                break;
                            }
                            case 8: {
                                premium.AvgInXYear();
                                break;
                            }
                            case 9: {
                                premium.Top();
                                break;
                            }
                            case 10: {
                                premium.Least();
                                break;
                            }
                            case 11: {
                                premium.Happiest();
                                break;
                            }
                            case 12: {
                                premium.Saddest();
                                break;
                            }
                            case 13: {
                                logout = true;
                                ans = false;
                                break;
                            }

                            default:
                                System.out.println("Invalid number, Try again..\n");

                        }
                        if(logout == false){
                        System.out.println("Do you want to do another process?(Y/N) : ");
                        while (true) {
                            String again = input.next();
                            if (again.equals("N") || again.equals("n")) {
                                ans = false;
                                break;
                            } else if (again.equals("Y") || again.equals("y")) {
                                ans = true;
                                break;
                            } else {
                                System.out.print("Enter Y or N : ");
                            }
                        }
                        }

                    } while (ans == true);

                }
                break;
            }
        }
        }while(logout == true);

    }
}