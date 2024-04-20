package Dao;

import Database.DatabaseHelpper;
import Model.Event; // Changed from DutySchedule to Event
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EventDAO {
    private Connection conn = null;
    private PreparedStatement sttm = null;

    public List<Event> getAll() {
        List<Event> events = new ArrayList<>(); // Changed from dutySchedules to events
        ResultSet rs = null;
        try {
            String sSQL = "SELECT * FROM Event";
            conn = DatabaseHelpper.getConnection();
            sttm = conn.prepareStatement(sSQL);
            rs = sttm.executeQuery();

            while (rs.next()) {
                Event event = new Event(); // Changed from DutySchedule to Event
                event.setEventId(rs.getInt("eventId"));
                event.setEventDate(rs.getDate("eventDate"));
                event.setDescription(rs.getString("description"));
                event.setStudentId(rs.getString("studentId"));
                events.add(event);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        } finally {
            closeResources();
        }
        return events;
    }
    
    public ArrayList<Event> getListEvent() {
        String query = "SELECT eventId, eventDate, description, studentId FROM Event";
        return getEventsFromDatabase(query); // Changed from getDutyScheduleFromDatabase to getEventsFromDatabase
    }
    
    public ArrayList<Event> getEventsFromDatabase(String queryStatement) { // Changed from getDutyScheduleFromDatabase to getEventsFromDatabase
        ArrayList<Event> listEvents = new ArrayList<>(); // Changed from listDutySchedules to listEvents
        try {
            Connection conn = DatabaseHelpper.getConnection();
            PreparedStatement ps = conn.prepareStatement(queryStatement);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Event event = new Event(); // Changed from DutySchedule to Event
                event.setEventId(resultSet.getInt("eventId"));
                event.setStudentId(resultSet.getString("studentId"));
                event.setEventDate(resultSet.getDate("eventDate"));
                event.setDescription(resultSet.getString("description"));
                listEvents.add(event);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listEvents;
    }
    
    private void closeResources() {
        try {
            if (sttm != null) {
                sttm.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Error closing resources: " + e.toString());
        }
    }
}
