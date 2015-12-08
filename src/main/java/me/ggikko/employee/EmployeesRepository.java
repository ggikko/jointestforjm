package me.ggikko.employee;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Park Ji Hong, ggikko.
 */
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

    Employees findByEmpno(Integer integer);
}
