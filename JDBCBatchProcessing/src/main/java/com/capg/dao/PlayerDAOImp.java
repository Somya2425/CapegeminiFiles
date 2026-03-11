package com.capg.dao;

import com.capg.entity.Player;
import com.capg.repo.BatchApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PlayerDAOImp implements PlayerDAO{

    @Override
    public void insertBatch(List<Player> players) throws Exception {
        Connection connection = BatchApplication.getConnection();
        String insertQuery = "INSERT INTO players VALUES (?,?,?)";
        PreparedStatement ps = connection.prepareStatement(insertQuery);
        for(Player p: players){
            ps.setInt(1,p.getPlayer_id());
            ps.setString(2, p.getPlayer_name());
            ps.addBatch();

        }
        int[] result = ps.executeBatch();
        System.out.println("inserted rows" + result.length);
        connection.close();
    }
}
