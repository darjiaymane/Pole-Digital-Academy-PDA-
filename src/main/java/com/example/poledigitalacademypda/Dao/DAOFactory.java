package com.example.poledigitalacademypda.Dao;

import com.example.poledigitalacademypda.Dao.Implementations.UserDAOImpl;

public class DAOFactory {
    public static Dao makeDao(String dao){
        switch (dao){
            case "user":
                return new UserDAOImpl();
            default:
                return null;
        }
    }

}
