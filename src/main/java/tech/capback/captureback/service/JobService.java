package tech.capback.captureback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.capback.captureback.model.Job;
import tech.capback.captureback.repo.JobRepo;

import java.util.List;

@Service
public class JobService {
    private final JobRepo jobRepo;

    @Autowired
    public JobService(JobRepo jobRepo){
        this.jobRepo = jobRepo;
    }

    public Job addJob(Job job){

        return jobRepo.save(job);
    }

    public List<Job> getAllJobs(){
        return jobRepo.getAll();
    }

    public static Job getJobById(Long id){
        return jobRepo.findJobById(id);
    }
}
