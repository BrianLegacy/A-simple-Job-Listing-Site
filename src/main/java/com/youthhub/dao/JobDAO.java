package com.youthhub.dao;

import com.youthhub.model.JobOpportunity;
import java.sql.*;
import java.util.*;

public class JobDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/youthhub";
    private String jdbcUser = "mysql";
    private String jdbcPass = "mysql123";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPass);
    }

    public List<JobOpportunity> getAllJobs() {
        List<JobOpportunity> jobs = new ArrayList<>();
        String sql = "SELECT * FROM jobs";

        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                jobs.add(new JobOpportunity(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("description")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return jobs;
    }

    public void addJob(JobOpportunity job) {
        String sql = "INSERT INTO jobs (title, description) VALUES (?, ?)";

        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, job.getTitle());
            stmt.setString(2, job.getDescription());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
