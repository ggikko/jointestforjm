package me.ggikko.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Park Ji Hong, ggikko.
 */
@RestController
public class EmpController {

    @Autowired
    EmployeesRepository repository;

    @Autowired
    SalaryRepository salaryRepository;

    @RequestMapping(value = "test/{name}", method = GET)
    public void getSalariesForSpecificEmployee(@PathVariable("name") String name) {

        Employees employees = repository.findByEmpno(Integer.valueOf(name));
        System.out.printf(employees.getBirth_date());

        List<Salaries> salaries = employees.getSalaries();
        System.out.printf(salaries.get(1).getSalary());

//        Salaries sal = salaryRepository.findByEmpno(Integer.valueOf(name));
//        System.out.println(sal.getSalary());


//        if (!sararies.isEmpty()) {
//            System.out.printf(sararies.get(0).getSalary());
//        } else {
//            System.out.printf("success");
//        }

//        for(Salaries temp  : salaries ){
//            System.out.printf(temp.getSalary());
//        }
//
//        return salaries;
    }
}
