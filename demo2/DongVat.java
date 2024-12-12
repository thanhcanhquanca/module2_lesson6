package demo2;

class DongVat {
    public String ten;
    public int tuoi;

    public DongVat(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public void an() {
        System.out.println(ten + " đang ăn.");
    }

    public void ngu() {
        System.out.println(ten + " đang ngủ.");
    }
}


class Meo extends DongVat {
    private String mauLong;

    public Meo(String ten, int tuoi, String mauLong) {
        super(ten, tuoi);
        this.mauLong = mauLong;
    }

    public void keu() {
        System.out.println(ten + " kêu: Meo meo ");
    }
}

class Ho extends DongVat {
    private int sucManh;

    public Ho(String ten, int tuoi, int sucManh) {
        super(ten, tuoi);
        this.sucManh = sucManh;
    }

    public void gam() {
        System.out.println(ten + " gầm: Grrr ");
    }
}

