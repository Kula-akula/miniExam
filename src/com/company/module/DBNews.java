package com.company.module;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class DBNews {
    public boolean addNews(News news) {
        String SQL = "insert into news (head_line, news_text, publishing) values (?,?, now())";
        try (Connection conn = Database.connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setString(1, news.getHeadLine());
            statement.setString(2, news.getText());
            statement.executeUpdate();
            System.out.println("Successfully created news: " + news);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public News getNewsByHeadLine(String headLine) {
        String SQL = "select * from news where head_line = ?";
        try (Connection conn = Database.connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setString(1,headLine);
            try(ResultSet rs = statement.executeQuery()){
                if(rs.next()) {
                    News news = new News();
                    news.setId(rs.getInt("ID"));
                    news.setHeadLine(rs.getString("HEAD_LINE"));
                    news.setText(rs.getString("NEWS_TEXT"));
                    news.setPublishingTime(rs.getDate("PUBLISHING"));
                    return news;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public News deleteNewsByHeadLine(String headLine) {
        String SQL = "delete from news where head_line = ?";
        try (Connection conn = Database.connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setString(1,headLine);
            try(ResultSet rs = statement.executeQuery()){
                if(rs.next()) {
                    News news = new News();
                    news.setId(rs.getInt("ID"));
                    news.setHeadLine(rs.getString("HEAD_LINE"));
                    news.setText(rs.getString("NEWS_TEXT"));
                    news.setPublishingTime(rs.getDate("PUBLISHING"));
                    return news;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public News updateNewsByHeadLine(String headLine) {
        String SQL = "update news set head_line=? where head_line = ?";
        try (Connection conn = Database.connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setString(1,headLine);
            try(ResultSet rs = statement.executeQuery()){
                if(rs.next()) {
                    News news = new News();
                    news.setId(rs.getInt("ID"));
                    news.setHeadLine(rs.getString("HEAD_LINE"));
                    news.setText(rs.getString("NEWS_TEXT"));
                    news.setPublishingTime(rs.getDate("PUBLISHING"));
                    return news;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public News updateNewsByText(String headLine) {
        String SQL = "update news set news_text=? where news_text = ?";
        try (Connection conn = Database.connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setString(1,headLine);
            try(ResultSet rs = statement.executeQuery()){
                if(rs.next()) {
                    News news = new News();
                    news.setId(rs.getInt("ID"));
                    news.setHeadLine(rs.getString("HEAD_LINE"));
                    news.setText(rs.getString("NEWS_TEXT"));
                    news.setPublishingTime(rs.getDate("PUBLISHING"));
                    return news;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }






}
