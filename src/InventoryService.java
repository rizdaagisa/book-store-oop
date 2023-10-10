public interface InventoryService {
    public void addBook(Book book);
    public void searchBookByTitle(String titlebook);
    public void searchBookById(String idbook);
    public void deleteBook(String databook);
    public void getAllBook();
}
