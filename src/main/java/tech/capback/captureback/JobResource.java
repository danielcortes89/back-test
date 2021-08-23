package tech.capback.captureback;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.capback.captureback.model.Job;
import tech.capback.captureback.service.JobService;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobResource {
    private final JobService jobService;

    public JobResource(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public ResponseEntity<List<Job>> getAllJobs(){
        List<Job> jobs = jobService.getAllJobs();
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Job> getJobById (@PathVariable("id") Long id){
        Job theJob = JobService.getJobById(id);
        return new ResponseEntity<Job>(theJob, HttpStatus.OK);
    }

    @PostMapping("/addjob")
    public ResponseEntity<Job> addJob (@RequestBody Job job){
        Job theJob = jobService.addJob(job);
        return new ResponseEntity<>(theJob, HttpStatus.OK);
    }
}
