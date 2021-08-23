package tech.capback.captureback.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.capback.captureback.model.Empoyee;

public interface EmployeeRepo extends JpaRepository<Empoyee, Long> {

}
