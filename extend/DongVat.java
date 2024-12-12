package extend;
// ví dụ về extends
class DongVat3 {
    void tiengKeu1() {
        System.out.println("Động vật phát ra tiếng kêu");
    }
}

class Cho0 extends DongVat3 {
    @Override
    void tiengKeu1() {
        System.out.println("Chó sủa");
    }

    public static void main(String[] args) {
        Cho0 cho = new Cho0();
        cho.tiengKeu1();
    }
}




//  ví dụ từ khóa implements
interface HienThi {
    void hienThi();
}

class ManHinh implements HienThi {
    @Override
    public void hienThi() {
        System.out.println("Hiển thị thông tin");
    }
    public static void main(String[] args) {
        ManHinh mh = new ManHinh();
        mh.hienThi();
    }
}



//  ví dụ từ khóa super
class Dongvat {
    void tiengKeu() {
        System.out.println("Động vật phát ra tiếng kêu");
    }
}

class Cho1 extends Dongvat {
    @Override
    void tiengKeu() {
        super.tiengKeu();
        System.out.println("Chó sủa");
    }
    public static void main(String[] args) {
        Cho1 cho1 = new Cho1();
        cho1.tiengKeu();
    }
}




// ví dụ về instanceof
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        // Kiểm tra đối tượng myAnimal có phải là thể hiện của Animal không
        System.out.println(myAnimal instanceof Animal);  // Output: true
        System.out.println(myAnimal instanceof Dog);     // Output: false

        // Kiểm tra đối tượng myDog có phải là thể hiện của Dog không
        System.out.println(myDog instanceof Dog);        // Output: true
        System.out.println(myDog instanceof Animal);     // Output: true
    }
}



// ví dụ về final
class Animal1 {
    final String loai = "Mèo";

    // Phương thức final không thể ghi đè
    final void keu() {
        System.out.println("Meo meo");
    }
}

class Cat extends Animal1 {
// Không thể ghi đè phương thức keu() trong lớp con vì nó là final
//     public void keu() {  // Lỗi: phương thức keu() không thể ghi đè
//         System.out.println("Meo meo meo");
//     }

    public static void main(String[] args) {

        Animal1 animal = new Animal1();
        System.out.println(animal.loai);
        animal.keu();
    }
}









