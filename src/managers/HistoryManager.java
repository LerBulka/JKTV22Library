/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class HistoryManager {
    private Scanner scanner;

    public HistoryManager(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public History giveOutBook(Book[] books, Reader[] readers){
        History history = new History();
        //** 1. вывести список читателей 2.Попросить польователя выбрть номер читателя 3.Добавить выбранного читателя из массива readers 4.Сделать 1-3 пункт для книги 5.Добавить в history дату выдачи книги 
        
        
        return history;
    }
    
}
