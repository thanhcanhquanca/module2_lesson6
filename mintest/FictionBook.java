package mintest;

import java.util.List;

public class FictionBook extends Book{
    private String category;

    public FictionBook(int bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" + " BookCode "  + getBookCode() + " Name " + getName() + " Price " + getPrice() + " Auhor " + getAuthor() +
                "category='" + category + '\'' +
                '}';
    }


}
