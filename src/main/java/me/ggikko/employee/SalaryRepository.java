package me.ggikko.employee;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Park Ji Hong, ggikko.
 */
public interface SalaryRepository extends JpaRepository<Salaries, Integer> {
    Salaries findByEmpno(Integer name);
}
