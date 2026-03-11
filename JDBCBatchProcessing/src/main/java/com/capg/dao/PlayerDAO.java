package com.capg.dao;

import com.capg.entity.Player;

import java.sql.SQLException;
import java.util.List;

public interface PlayerDAO {
    void insertBatch(List<Player> players) throws Exception;
    //void updateBatch(List<Player> players);
   // void deleteBatch(List<Player> players);

}
