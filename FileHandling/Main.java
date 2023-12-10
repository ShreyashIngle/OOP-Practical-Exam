package FileHandling;

/**
 * Main
 */
import java.util.*;
import java.io.*;;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream OIS = null;
        ObjectOutputStream OOS = null;

        File file = new File("C:\\Users\\Tejas Ingle\\OneDrive\\Desktop\\PICT Study\\Oop\\FileHandling\\StudentDb.txt");

        ArrayList<Student> arrayList = new ArrayList<>();
        if (file.isFile()) {
            OIS = new ObjectInputStream(new FileInputStream(file));
            arrayList = (ArrayList<Student>) OIS.readObject();
            OIS.close();
        }

        Scanner sc = new Scanner(System.in);
        String name;
        String classname;
        int id;
        double marks;

        while (true) {
            System.out.println("\n-----Menu-----\n1.Insert\n2.Display\n3.Update\n4.Search\n5.Exit\nEnter the choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter the name:");
                    name = sc.next();
                    System.out.println("\nEnter the classname:");
                    classname = sc.next();
                    System.out.println("\nEnter the id:");
                    id = sc.nextInt();
                    System.out.println("\nEnter the marks:");
                    marks = sc.nextDouble();

                    arrayList.add(new Student(name, classname, id, marks));
                    OOS = new ObjectOutputStream(new FileOutputStream(file));
                    OOS.writeObject(arrayList);
                    OOS.close();
                    break;

                case 2:
                    for(Student student:arrayList){
                        System.out.println(student.toString());
                    }
                    break;
                case 3:
                    System.out.println("\nEnter the id:");
                    int n = sc.nextInt();
                    int i = 0;
                    for (Student std : arrayList) {
                        if (std.id == n) {
                            System.out.println("\nid found");
                            System.out.println("\nwhat you want to update\n1.Name\n2.class\n3.marks:Enter the choice:");
                            int ch = sc.nextInt();

                            switch (ch) {
                                case 1:
                                    System.out.println("\nEntet the name:");
                                    std.name = sc.next();
                                    break;
                                case 2:
                                    System.out.println("\nEnter the classname:");
                                    std.classname = sc.next();
                                    break;
                                case 3:
                                    System.out.println("\nEnter the marks:");
                                    std.marks = sc.nextDouble();
                                    break;

                                default:
                                    break;
                            }
                            arrayList.set(i, std);
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nEnter the id to searrch:");
                    int ids = sc.nextInt();
                    
                    for (Student student : arrayList) {
                        if (student.id==ids) {
                            System.out.println(student.toString());
                        }
                    }
                    break;

                default:
                    break;
            }
        }

    }
}