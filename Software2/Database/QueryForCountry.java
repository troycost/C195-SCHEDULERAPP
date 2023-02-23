package Database;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Country;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryForCountry extends Country {

    public QueryForCountry(int countryID, String countryName) {
        super(countryID, countryName);
    }

    /**
     * ObservableList that queries Country_ID and Country from the countries database table.
     * @throws SQLException
     * @return countriesObservableList
     */
    public static ObservableList<QueryForCountry> getCountries() throws SQLException {
        ObservableList<QueryForCountry> countriesObservableList = FXCollections.observableArrayList();
        String sql = "SELECT Country_ID, Country from countries";
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int countryID = rs.getInt("Country_ID");
            String countryName = rs.getString("Country");
            QueryForCountry country = new QueryForCountry(countryID, countryName);
            countriesObservableList.add(country);
        }
        return countriesObservableList;
    }

}
