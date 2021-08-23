package tech.capback.captureback.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.capback.captureback.model.Job;

public interface JobRepo extends JpaRepository<Job, Long> {
    Job findJobById(Long id);
}
