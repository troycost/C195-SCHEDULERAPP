package Database;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.firstLevelDivision;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryForDivisions extends firstLevelDivision {

    public QueryForDivisions(int divisionID, String divisionName, int country_ID) {
        super(divisionID, divisionName, country_ID);
    }

    /**
     * ObservableList that takes entire divsions table.
     * @throws SQLException
     * @return firstLevelDivisionsObservableList
     */
    public static ObservableList<QueryForDivisions> getAllFirstLevelDivisions() throws SQLException {
        ObservableList<QueryForDivisions> firstLevelDivisionsObservableList = FXCollections.observableArrayList();
        String sql = "SELECT * from first_level_divisions";
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int divisionID = rs.getInt("Division_ID");
            String divisionName = rs.getString("Division");
            int country_ID = rs.getInt("COUNTRY_ID");
            QueryForDivisions firstLevelDivision = new QueryForDivisions(divisionID, divisionName, country_ID);
            firstLevelDivisionsObservableList.add(firstLevelDivision);
        }
        return firstLevelDivisionsObservableList;
    }

}
