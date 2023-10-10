import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InventoryServiceImpl implements InventoryService{

    private List<List<Book>> database = new ArrayList<>();

    public InventoryServiceImpl(){}

    public List<List<Book>> getDatabase(){
        return this.database;
    }

    @Override
    public void addBook(Book book) {
        this.database.add(Arrays.asList(book));
    }

    @Override
    public void searchBookByTitle(String titlebook) {
        getBook(titlebook,false);
    }

    @Override
    public void searchBookById(String idbook) {
        getBook(idbook,false);
    }

    @Override
    public void deleteBook(String databook) {
        getBook(databook,true);
    }

    @Override
    public void getAllBook() {
        int i= 1;
        for(List<Book> values : this.database){
            System.out.println(i+". "+values.toString());
            i++;
        }
    }

    public void getBook(String input, boolean delete){
        int indx = 0;
        for(List<Book> book : this.database){
            for(Book data : book){
                if((data.getTitle().equals(input)) || (data.getCode().equals(input))){
                    System.out.println(data);
                    if(delete){
                        database.remove(indx);
                        System.err.println("Data Deleted");
                        return;
                    }
                    return;
                }
            }
            indx+=1;
        }
    }
}
