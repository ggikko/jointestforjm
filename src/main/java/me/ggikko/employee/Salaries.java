package me.ggikko.employee;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Park Ji Hong, ggikko.
 */
@Entity
@Getter
@Setter
public class Salaries {

    @Id
    @Column(name = "emp_no", nullable = false)
    private int empno;

    @Column(name = "salary", nullable = false)
    private String salary;

    @Column(name = "from_date", nullable = false)
    private String from_date;

    @Column(name = "to_date", nullable = false)
    private String to_date;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "employees_empno")
//    private Employees employees;


}
