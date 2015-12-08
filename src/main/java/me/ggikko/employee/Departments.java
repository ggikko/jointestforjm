package me.ggikko.employee;

import javax.persistence.*;

/**
 * Created by Park Ji Hong, ggikko.
 */

@Entity
@Table(name = "departments")
public class Departments {
    @Id
    @Column(name = "dept_no", nullable = false)
    private String deptNo;

    @Column(name = "dept_name", unique = true, nullable = false)
    private String deptName;
}
