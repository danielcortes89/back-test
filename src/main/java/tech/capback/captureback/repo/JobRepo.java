package tech.capback.captureback.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.capback.captureback.model.Job;

import java.util.List;

public interface JobRepo extends JpaRepository<Job, Long> {
    Job findJobById(Long id);

    List<Job> getAll();
}
