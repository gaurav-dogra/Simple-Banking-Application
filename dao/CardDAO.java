package banking.dao;

import banking.model.Card;

public interface CardDAO extends DAO<Card> {
    String TABLE_NAME = "card";

    String DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;


    String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "  ("
            + " id INTEGER,"
            + " number TEXT,"
            + " pin TEXT,"
            + " balance INTEGER DEFAULT 0"
            + ")";

    String INSERT = "INSERT INTO " + TABLE_NAME + " (NUMBER, PIN, BALANCE)" +
            "VALUES(?, ?, ?)";

    String FIND_BY_NUMBER = "SELECT * FROM " + TABLE_NAME + " WHERE number=?";

}
