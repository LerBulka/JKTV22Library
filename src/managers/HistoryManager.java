/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package managers;

 

import entity.Book;
import java.util.Scanner;
import entity.History;
import entity.Reader;
import java.util.Arrays;
import java.util.GregorianCalendar;

 

/**
*
* @author pupil
*/
public class HistoryManager {
    private final Scanner scanner;
    private ReaderManager readerManager;
    private BookManager bookManager;

    public HistoryManager(Scanner scanner, BookManager bookManager, ReaderManager readerManager) {
        this.scanner = scanner;
        this.readerManager = readerManager;
        this.bookManager = bookManager;
    }

 

    public History giveOutBook(Book[] books, Reader[] readers) {
        History history = new History();
        /**
         * 1. Вывести список читателей
         * 2. Попросить пользователя выбрать номер читателя из списка
         * 3. Добавить выбранного читателя из массива reader в history
         * 4. Сделать 1-3 пункт для книги
         * 5. Добавить в history дату выдачи книги (текущую дату)
         */
        ReaderManager readerManager = new ReaderManager(scanner);
        readerManager.printListReaders(readers);
        int selectedReaderNumber = scanner.nextInt(); scanner.nextLine();
        history.setReader(readers[selectedReaderNumber-1]);
        BookManager bookManager = new BookManager(scanner);
        bookManager.printListBooks(books);
        int selectedBookNumber = scanner.nextInt(); scanner.nextLine();
        history.setBook(books[selectedBookNumber-1]);
        history.setDateOnHand(new GregorianCalendar().getTime());
        return history;
    }

    public void returnBook(History[] histories) {
        BookManager bookManager = new BookManager(scanner);
        bookManager.printListGiveOutBooks(histories);
        System.out.println("Select book for return: ");
        int historyNumber = scanner.nextInt();scanner.nextLine();
        histories[historyNumber-1].setDateBack(new GregorianCalendar().getTime());
        System.out.printf("Book \"%s\" returned%n",
                histories[historyNumber-1].getBook().getTitle());
    }
}