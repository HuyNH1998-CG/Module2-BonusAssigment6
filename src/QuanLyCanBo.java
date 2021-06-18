import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
    public static Scanner input = new Scanner(System.in);
    static ArrayList<CanBo> list = new ArrayList<>();
    static NameComparator comparator = new NameComparator();

    public static final String changeName = "1";
    public static final String changeDateOfBirth = "2";
    public static final String changeGender = "3";
    public static final String changeAddress = "4";
    public static final String changeType = "5";
    public static final String changeSpecialty = "6";

    public static void addNhanVien() {
        System.out.println("Adding new Employee");
        String name = inputName();
        String dateOfBirth = inputDateOfBirth();
        String gender = inputGender();
        String address = inputAddress();
        list.add(new NhanVien(name, dateOfBirth, gender, address));
    }

    public static void addCongNhan() {
        System.out.println("Adding new Worker");
        String name = inputName();
        String dateOfBirth = inputDateOfBirth();
        String gender = inputGender();
        String address = inputAddress();
        String type = inputWorkerType();
        String specialty = inputSpecialty();
        list.add(new CongNhan(name, dateOfBirth, gender, address, type, specialty));
    }


    public static void addKySu() {
        System.out.println("Adding new Engineer");
        String name = inputName();
        String dateOfBirth = inputDateOfBirth();
        String gender = inputGender();
        String address = inputAddress();
        String specialty = inputSpecialty();
        list.add(new KySu(name, dateOfBirth, gender, address, specialty));
    }

    private static String inputAddress() {
        System.out.println("input Address");
        return input.nextLine();
    }

    private static String inputGender() {
        System.out.println("input gender");
        return input.nextLine();
    }

    private static String inputName() {
        System.out.println("input Name");
        return input.nextLine();
    }

    private static String inputWorkerType() {
        System.out.println("input worker type");
        return input.nextLine();
    }

    private static String inputSpecialty() {
        System.out.println("input specialty");
        return input.nextLine();
    }

    private static String inputDateOfBirth() {
        System.out.println("input Date Of Birth");
        return input.nextLine();
    }

    public static CanBo matching(String name) {
        for (CanBo C : list) {
            if (C.getName().equals(name)) {
                return C;
            }
        }
        return null;
    }

    public static void searchByName() {
        String name = inputName();
        CanBo toSearch = matching(name);
        System.out.println(toSearch);
    }

    public static void delete() {
        String name = inputName();
        CanBo toSearch = matching(name);
        list.remove(toSearch);
    }
    public static void editChoices(){
        System.out.println("1. Name");
        System.out.println("2. Date Of Birth");
        System.out.println("3. Gender");
        System.out.println("4. Address");
        System.out.println("5. Type");
        System.out.println("6. Specialty");
    }

    public static void edit() {
        String name = inputName();
        for (CanBo C : list) {
            if (C.getName().equals(name)) {
                System.out.println("Change what");
                editChoices();
                String choice = input.nextLine();
                switch (choice) {
                    case changeName -> C.setName(inputName());
                    case changeDateOfBirth -> C.setDateOfBirth(inputDateOfBirth());
                    case changeGender -> C.setGender(inputGender());
                    case changeAddress -> C.setAddress(inputAddress());
                    case changeType -> {
                        if (C instanceof CongNhan) {
                            ((CongNhan) C).setType(inputWorkerType());
                        }
                    }
                    case changeSpecialty -> {
                        if (C instanceof CongNhan) {
                            ((CongNhan) C).setSpecialty(inputSpecialty());
                        }else if (C instanceof KySu){
                            ((KySu) C).setSpecialty(inputSpecialty());
                        }
                    }
                    default -> System.out.println("invalid input");
                }
            }
        }
    }

    public static void show() {
        for (CanBo C : list) {
            C.display();
        }
    }

    public static void sort() {
        list.sort(comparator);
    }

    public static void searchBySpecialty() {
        String specialty = inputSpecialty();
        for (CanBo C : list) {
            if (C instanceof CongNhan) {
                if (((CongNhan) C).getSpecialty().equals(specialty)) {
                    C.display();
                }
            } else if (C instanceof KySu) {
                if (((KySu) C).getSpecialty().equals(specialty)) {
                    C.display();
                }
            }
        }
    }

}
