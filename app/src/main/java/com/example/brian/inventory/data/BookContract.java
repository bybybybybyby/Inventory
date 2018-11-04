package com.example.brian.inventory.data;

import android.provider.BaseColumns;

public class BookContract {

    private BookContract() {
    }

    // Inner class that defines constant values for the book database table
    // Each entry in the table represents a single book.
    public static final class BookEntry implements BaseColumns {

        // Name of database table for books
        public final static String TABLE_NAME = "books";

        //Unique ID number for the pet (only for use in the database table)
        //Type : INTEGER
        public final static String _ID = BaseColumns._ID;

        //Name of the book.
        //Type: TEXT
        public final static String COLUMN_BOOK_NAME = "name";

        //Price of the book.
        //Type: REAL
        public final static String COLUMN_BOOK_PRICE = "price";

        //Quantity of books available.
        //Type: INTEGER
        public final static String COLUMN_BOOK_QUANTITY = "quantity";

        //Supplier Name
        //Type: TEXT
        public final static String COLUMN_SUPPLIER_NAME = "supplier";

        //Supplier phone number.
        //Type: TEXT
        public final static String COLUMN_SUPPLIER_PHONE = "phone";
    }

}
