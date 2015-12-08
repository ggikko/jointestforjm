package me.ggikko.employee;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Park Ji Hong, ggikko.
 */
@Entity
@Getter
@Setter
@IdClass(GgikkoKey.class)
public class Salaries {

    @Id
    private int emp_no;

    @Id
    private Date from_date;

    @Column(name = "salary", nullable = false)
    private int salary;

    @Column(name = "to_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date toDate;

//    @ManyToOne
//    private Employees employees;
//    @JoinColumn(name = "empno")


}
