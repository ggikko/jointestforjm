package me.ggikko.employee;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Park Ji Hong, ggikko.
 */

@Entity
@Getter
@Setter
@Table(name="employees")
public class Employees {

    @Id
    @Column(name = "emp_no", nullable = false)
    private int empno;
    @Column(name = "birth_date", nullable = false)
    private String birth_date;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "hire_date", nullable = false)
    private String hire_date;

    @OneToOne
    @JoinColumn(name="emp_no")
    private DepartmentEmployee departmentEmployee;

    @OneToMany(targetEntity = me.ggikko.employee.Salaries.class, mappedBy = "emp_no", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Salaries> salaries;

//    @Id
//    @Column(name = "EMP_NO", nullable = false)
//    private int emp_no;
//    @Column(name = "BIRTH_DATE", nullable = false)
//    private String birth_date;
//    @Column(name = "FIRST_NAME", nullable = false)
//    private String firstName;
//    @Column(name = "LAST_NAME", nullable = false)
//    private String lastName;
//    @Column(name = "GENDER", nullable = false)
//    private String gender;
//    @Column(name = "HIRE_DATE", nullable = false)
//    private String hire_date;
//
//    @OneToMany(mappedBy = "employee")
//    private List<Salaries> salaries = new ArrayList<Salaries>();

}
