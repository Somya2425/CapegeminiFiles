package com.capg.dao;

import com.capg.Entity.Player;

import java.util.List;

public interface PlayerDAO {
    void insertPlayer(Player player);
    void updatePlayer(Player player);
    void deletePlayer(Player player);
    List<Player> getAllPlayers();
    
}
