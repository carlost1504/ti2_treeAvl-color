package model;
import java.io.*;
import java.util.*;
public class controCentral {

    public static final String PLAYERS_FILE_NAME = "data/Names_2010Census.csv";
    public static final String PLAYERS_FILE_NAME1 = "data/babynames-clean.csv";

    public void importData() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(PLAYERS_FILE_NAME));

        String s;

        br.readLine();
        while ((s = br.readLine()) != null) {
            String[] line = s.split(",");
            Player player = new Player(line[0], line[1], Integer.parseInt(line[2]), line[3], Integer.parseInt(line[4]),
                    Integer.parseInt(line[5]), Integer.parseInt(line[6]), Integer.parseInt(line[7]),
                    Integer.parseInt(line[8]));

            reboundsAVL.insert(player);
            pointsAVL.insert(player);
            assistsRBT.insert(player);
            robberiesRBT.insert(player);
            blocksBST.insert(player);

        }

        br.close();

    }


}
