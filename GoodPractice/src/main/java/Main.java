import com.capg.Entity.Player;
import com.capg.dao.PlayerDAO;
import com.capg.dao.PlayerDAOImpl;

public class Main {
    public static void main(String[] args) {
        PlayerDAO dao = new PlayerDAOImpl();

        //insert
        dao.insertPlayer(new Player(10, "dhoni", "india"));
    }
}
