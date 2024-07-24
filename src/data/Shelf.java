package data;

import java.util.Scanner;

public class Shelf {
    //đặc điểm của 1 cái tủ bất kì là gì: màu sơn:__; giá tiền:__; nhà sx:__

    //số ngăn/ không gian chưa đồ:___ các món đồ nhét vào, món đồ là object
    //chứa nhiều đồ, nhiều object rõ ràng đến thời điểm này là ta cần mảng object
    //tủ sẽ chứa 1 list/ mảng/ danh sách các đối tượng
    //ứng dụng của mảng, góp phần tạo dựng nên object khác
    //OOP: tìm cá object, chúng phối hợp, trộn nhau
    private String color;
    private String label;   //tủ chén, tủ hồ sơ

    //chứa cái gì
    private Student[] ds = new Student[300];
    private Scanner sc = new Scanner(System.in);
    private int count = 0;  //mới mua tủ về, sô hồ sơ = 0
    //nhét thêm 1 hồ sơ thì count++
    //chơi mảng chỉ for đến count

    //Tui có không gian chứa info, tui sẽ giải quyết chuyện nhập xuất
    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }

    public void inputAStudent() {
        String id, name;
        int yob;
        double gpa;

        System.out.println("Input student #" + (count + 1) + "/" + ds.length);
        System.out.print("Input id: ");
        id = sc.nextLine();

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        ds[count] = new Student(id, name, yob, gpa);
        count++;
    }
    
    public void printStudentList() {
        System.out.println("The student list");
        for (int i = 0; i < count; i++) {
            ds[i].showProfile();
        }
    }
}
