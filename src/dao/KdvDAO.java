package dao;

import config.DbConnection;
import model.Kdv;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KdvDAO {

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS kdvs (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "tutar DOUBLE," +
                "oran DOUBLE," +
                "tarih VARCHAR(255)," +
                "aciklama VARCHAR(255)," +
                "fisNo VARCHAR(255))";
        try (Connection conn = DbConnection.connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void add(Kdv kdv) {
        String sql = "INSERT INTO kdvs (tutar, oran, tarih, aciklama, fisNo) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DbConnection.connect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, kdv.getTutar());
            ps.setDouble(2, kdv.getOran());
            ps.setString(3, kdv.getTarih());
            ps.setString(4, kdv.getAciklama());
            ps.setString(5, kdv.getFisNo());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Kdv> getAll() {
        List<Kdv> list = new ArrayList<>();
        String sql = "SELECT * FROM kdvs";
        try (Connection conn = DbConnection.connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Kdv(
                        rs.getInt("id"),
                        rs.getDouble("tutar"),
                        rs.getDouble("oran"),
                        rs.getString("tarih"),
                        rs.getString("aciklama"),
                        rs.getString("fisNo")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
