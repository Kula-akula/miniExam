package com.company;

import com.company.module.DBNews;
import com.company.module.Database;
import com.company.module.News;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();
        News news=new News();


        DBNews newNews=new DBNews();
        newNews.addNews(news);

    }

}
