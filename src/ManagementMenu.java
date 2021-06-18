import java.util.Scanner;

public class ManagementMenu {
    static Scanner input = new Scanner(System.in);
    public static final String add = "1";
    public static final String search = "2";
    public static final String remove = "3";
    public static final String edit = "4";
    public static final String showAll = "5";
    public static final String sort = "6";
    public static final String searchBySpecialty = "7";
    public static final String exit = "8";
    public static final String nhanVien = "1";
    public static final String congNhan = "2";
    public static final String kySu = "3";

    public static void menu() {

        while (true) {
            welcome();
            String choice = input.nextLine();
            switch (choice) {
                case add -> add();
                case search -> QuanLyCanBo.searchByName();
                case remove -> QuanLyCanBo.delete();
                case edit -> QuanLyCanBo.edit();
                case showAll -> QuanLyCanBo.show();
                case sort -> QuanLyCanBo.sort();
                case searchBySpecialty -> QuanLyCanBo.searchBySpecialty();
                case exit -> System.exit(0);
                default -> System.out.println("Invalid command, re input");
            }
        }
    }

    public static void add() {
        addChoice();
        String choice = input.nextLine();
        switch (choice) {
            case nhanVien -> QuanLyCanBo.addNhanVien();
            case congNhan -> QuanLyCanBo.addCongNhan();
            case kySu -> QuanLyCanBo.addKySu();
            default -> System.out.println("invalid input");
        }
    }

    private static void addChoice() {
        System.out.println("1. Add employee");
        System.out.println("2. Add worker");
        System.out.println("3. Add engineer");
    }

    private static void welcome() {
        System.out.println("Welcome to Employee Management System");
        System.out.println("1. Add");
        System.out.println("2. Search");
        System.out.println("3. Remove");
        System.out.println("4. Edit");
        System.out.println("5. Show All");
        System.out.println("6. Sort");
        System.out.println("7. Search By Specialty");
        System.out.println("8. Exit");
    }
}
