package homework_1_9;

public class HomeWork_1_9 {

    public static void main(String[] args) {
        Author authorLevTolstoy = new Author("Лев Толстой");
        Book bookAnnaKarenina = new Book("Анна Каренина", authorLevTolstoy, 1878);
        System.out.println("Автор - " + authorLevTolstoy.getFullNameAuthor() + ". Название книги - " + bookAnnaKarenina.getBookName() + ". Дата публикации - " + bookAnnaKarenina.getDateOfPublication() + ".");
        bookAnnaKarenina.setDateOfPublication(1879);
        System.out.printf("Дата публикации через сеттер- %s.\n", bookAnnaKarenina.getDateOfPublication());

        Author authorWilliamShakespeare = new Author("Уильям Шекспир");
        Book bookGamlet = new Book("Гамлет", authorWilliamShakespeare, 1623);
        System.out.println("Автор - " + authorWilliamShakespeare.getFullNameAuthor() + ". Название книги - " + bookGamlet.getBookName() + ". Дата публикации - " + bookGamlet.getDateOfPublication() + ".");
        bookAnnaKarenina.setDateOfPublication(1622);
        System.out.printf("Дата публикации через сеттер- %s.", bookGamlet.getDateOfPublication());
    }
}
