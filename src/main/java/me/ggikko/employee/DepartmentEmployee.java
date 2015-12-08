package me.ggikko.employee;

import org.hibernate.annotations.Formula;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Park Ji Hong, ggikko.
 */


@Entity
@Table(name="dept_emp")
public class DepartmentEmployee {
    @Id
    @Column(name = "emp_no", nullable = true)
    private int empNo;

    @Column(name = "dept_no", nullable = true, insertable = false, updatable = false)
    private String deptNo;

    @OneToOne
    @JoinColumn(name = "dept_no", referencedColumnName = "dept_no")
    private Departments departments;
}
