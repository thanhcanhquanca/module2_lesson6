package mintest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FictionBook fb1 = new FictionBook(5 , "Ken",3200,"nguoi My","viễn tưởng");
        FictionBook fb2 = new FictionBook(5 , "Alan",3200,"nguoi Lan","tình cảm");
        FictionBook fb3 = new FictionBook(5 , "name",3200,"nguoi Trung","cổ trang");

        ProgrammingBook pr1 = new ProgrammingBook(5,"Alan",7000,"người Mỹ","java","blue");
        ProgrammingBook pr2 = new ProgrammingBook(3,"Lico",3000,"người Anh","java","green");
        ProgrammingBook pr3 = new ProgrammingBook(8,"Lico",5000,"người Anh","web","red");


        Book[] books = {fb1, fb2, fb3, pr1, pr2, pr3};
        int sum = 0;
        for (Book book : books) {
            sum += book.getPrice();
        }
        System.out.println("Tổng giá 6 sản phẩm  " + sum);


        ProgrammingBook[] program = {pr1, pr2, pr3};
        String labi = "java";
        int countst = 0;
        for (ProgrammingBook pr : program) {
            if (pr.getLanguage().equals(labi)) {
                countst++;
            }
        }
        System.out.println("Số sách có ngôn ngữ là java là: " + countst);

        String vt = "viễn tưởng";
        int countv = 0;
        FictionBook[] ficti = {fb1, fb2, fb3};
        for (FictionBook fb : ficti) {
           if (fb.getCategory().equals(vt)){
               countv ++;
           }
        }

        System.out.println("Số sách có thể loại viễn tưởng là: " + countv);



        FictionBook[] fcbook = {fb1,fb2,fb3};
        int countf = 0;
        int priceNa = 10;

        for (FictionBook fb : fcbook) {
            if (fb.getPrice() >= priceNa){
                countf ++;
            }
        }

        System.out.println(" Số lượng sách có gia > 100000 la : " + countf);


        System.out.println(pr1);
        System.out.println(pr2);
        System.out.println(pr3);

        System.out.println(fb1);
        System.out.println(fb2);
        System.out.println(fb3);
    }

}
