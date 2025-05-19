package com.youthhub.bean;

import com.youthhub.model.JobOpportunity;
import com.youthhub.dao.JobDAO;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class JobBean {
    private JobOpportunity job = new JobOpportunity();
    private JobDAO jobDAO = new JobDAO();

    public JobOpportunity getJob() {
        return job;
    }

    public void setJob(JobOpportunity job) {
        this.job = job;
    }

    public List<JobOpportunity> getAllJobs() {
        return jobDAO.getAllJobs();
    }

    public String submitJob() {
        jobDAO.addJob(job);
        return "index.xhtml?faces-redirect=true";
    }
}
