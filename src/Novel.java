public class Novel extends Book {

    String codeBook;
    String titleBook;
    String publisher;
    String publicationYear;
    String writer;

    public Novel(String codeBook, String titleBook, String publisher, String publicationYear, String writer){
        this.codeBook = codeBook;
        this.titleBook = titleBook;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.writer = writer;
    }

    @Override
    public String getCode() { return this.codeBook;}

    @Override
    public String getTitle() {
        return this.titleBook;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "codeBook='" + codeBook + '\'' +
                ", titleBook='" + titleBook + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicationYear='" + publicationYear + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }

}
