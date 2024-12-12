package mintest;

public class ProgrammingBook extends Book{
    private String language;
    private String framework;

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(int bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook() {

    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" + " bookCode= " + getBookCode() + " name= " + getName()
                + " Price= " + getPrice()  + " Author= " + getAuthor()
                + "language='" + language +
                ", framework='" + framework +
                '}';
    }

}
