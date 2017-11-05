package tpwsrest

import com.mbds.tprest.Book
import com.mbds.tprest.Library

class BootStrap {

    def init = { servletContext ->

        Library library = new Library(name: 'Lib1', address: 'yolo street', yearCreated: 2002).save()
        Book book1 = new Book(name: 'livre1', releaseDate: Date.parse("yyyy-MM-dd", "2017-04-02"), isbn: 'AUG6', author: 'Cecile').save()
        Book book2 = new Book(name: 'livre2', releaseDate: Date.parse("yyyy-MM-dd", "2016-01-22"), isbn: 'GUG7', author: 'Julien').save()
        library.addToBooks(book1)
        library.addToBooks(book2)


        Library library2 = new Library(name: 'Lib2', address: 'omg street', yearCreated: 2012).save()
        Book book3 = new Book(name: 'livre3', releaseDate: Date.parse("yyyy-MM-dd", "2011-02-19"), isbn: 'AUG6', author: 'Patrick').save()
        Book book4 = new Book(name: 'livre4', releaseDate: Date.parse("yyyy-MM-dd", "2006-11-22"), isbn: 'GUG7', author: 'Gayardon').save()
        library2.addToBooks(book3)
        library2.addToBooks(book4)


    }
    def destroy = {
    }
}
