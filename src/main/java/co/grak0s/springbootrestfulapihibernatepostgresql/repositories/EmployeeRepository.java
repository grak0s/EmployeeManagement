package co.grak0s.springbootrestfulapihibernatepostgresql.repositories;

import co.grak0s.springbootrestfulapihibernatepostgresql.models.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}
