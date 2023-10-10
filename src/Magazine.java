public class Magazine extends Book{

    String codeBook;
    String titleBook;
    String publicationPeriode;
    String publicationYear;

    public Magazine(String codeBook, String titleBook, String publicationPeriode, String publicationYear){
        this.codeBook = codeBook;
        this.titleBook = titleBook;
        this.publicationPeriode = publicationPeriode;
        this.publicationYear = publicationYear;
    }

    @Override
    public String getCode() {
        return this.codeBook;
    }

    @Override
    public String  getTitle() {
        return this.titleBook;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "codeBook='" + codeBook + '\'' +
                ", titleBook='" + titleBook + '\'' +
                ", publicationPeriode='" + publicationPeriode + '\'' +
                ", publicationYear='" + publicationYear + '\'' +
                '}';
    }

}
