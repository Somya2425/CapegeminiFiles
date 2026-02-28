package com.capg.dao;

import com.capg.Entity.Player;
import com.capg.repository.PlayerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAOImpl implements PlayerDAO {
    @Override
    public void insertPlayer(Player player) {
        String sql = "INSERT INTO player VALUES (?,?,?)";
        try(
        Connection conn = PlayerRepository.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, player.getPlayerID());
            ps.setString(2, player.getPlayerName());
            ps.setString(3, player.getPlayerCountry());

            ps.executeUpdate();
            System.out.println("player inserted.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updatePlayer(Player player) {




    }

    @Override
    public void deletePlayer(Player player) {

    }

    @Override
    public List<Player> getAllPlayers() {
        List<Player> list = new ArrayList<>();
        return list;
    }
}
