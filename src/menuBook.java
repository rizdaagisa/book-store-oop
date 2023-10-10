import java.util.Scanner;

public class menuBook {
    public static void run(InventoryServiceImpl service){
        while (true){
            String input = mainMenu();
            switch (input){
                case "1":
                    System.out.println("Chose Category Book");
                    System.out.println("1.Novel");
                    System.out.println("2.Magazine");
                    System.out.println("chose input : ");
                    Scanner scanner = new Scanner(System.in);
                    String category = scanner.nextLine().toLowerCase();

                    if(category.equals("novel") || category.equals("1")){
                        System.out.print("Input Title Novel : ");
                        String bookName = scanner.nextLine();
                        System.out.print("Input Publisher : ");
                        String publisher = scanner.nextLine();
                        System.out.print("Input Publication Year : ");
                        String publicationYear = scanner.nextLine();
                        System.out.print("Input Writer : ");
                        String writer = scanner.nextLine();

                        String kode = publicationYear+"-A-"+(service.getDatabase().size()+1);
                        Book novel = new Novel(kode,bookName,publisher,publicationYear,writer);
                        service.addBook(novel);

                    } else if (category.equals("magazine") || category.equals("2")){
                        System.out.print("Input Title Magazine : ");
                        String bookName = scanner.nextLine();
                        System.out.print("Input Publication Periode (Weekly/Montly) : ");
                        String publisherPeriode = scanner.nextLine();
                        System.out.print("Input Publication Year (YYYY) : ");
                        String publicationYear = scanner.nextLine();

                        String kode = publicationYear+"-B-"+(service.getDatabase().size()+1);
                        Book magazine = new Magazine(kode,bookName,publisherPeriode,publicationYear);
                        service.addBook(magazine);
                    }
                    break;
                case "2":
                    System.out.print("Input Title Book : ");
                    Scanner scanner3 = new Scanner(System.in);
                    String inputTitle = scanner3.nextLine();
                    service.searchBookByTitle(inputTitle);
                    break;
                case"3":
                    System.out.print("Input Code Book : ");
                    Scanner scanner4 = new Scanner(System.in);
                    String inputCode = scanner4.nextLine();
                    service.searchBookById(inputCode);
                    break;
                case "4":
                    System.out.print("Input Code Book / Title Book : ");
                    Scanner scanner2 = new Scanner(System.in);
                    String inputBook = scanner2.nextLine();
                    service.deleteBook(inputBook);
                    break;
                case "5":
                    service.getAllBook();
                    break;
                case "x":
                    System.exit(0);
                default:
                    System.err.println("Input tidak sesuai");
            }
        }
    }

    public static String mainMenu(){
        System.out.println("\n============ MAIN MENU ==========");
        System.out.println("1. Add Book");
        System.out.println("2. Search Book by Title");
        System.out.println("3. Search Book by ID");
        System.out.println("4. Delete Book");
        System.out.println("5. View All Book");
        System.out.println("X. Exit Aplication");
        System.out.println("=================================");
        System.out.print("Silakan input pilihan : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}
