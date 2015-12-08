package me.ggikko.employee;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Park Ji Hong, ggikko.
 */
@RestController
public class EmpController {

    @Autowired
    EmployeesRepository repository;

//    @Autowired
//    SalaryRepository salaryRepository;

    @Autowired
    ModelMapper modelMapper;

    @RequestMapping(value = "test/{name}", method = GET)
    public ResponseEntity getSalariesForSpecificEmployee(@PathVariable("name") String name) {
//
        Employees employees = repository.findByEmpno(Integer.valueOf(name));
//        Employees employees = salaryRepository.findByEmpno(Integer.valueOf(name)).getEmployees();
//        System.out.printf(employees.getBirth_date());

//        List<Salaries> salaries = employees.getSalaries();
//        System.out.printf(salaries);

//        System.out.printf(String.valueOf(salaries.size()));

//        List<Salaries> salaries = salaryRepository.findAll();

//        Salaries one = salaryRepository.findOne(Integer.valueOf(name));
        return new ResponseEntity(employees, HttpStatus.OK);



//        Salaries sal = salaryRepository.findByEmpno(Integer.valueOf(name));
//        System.out.println(sal.getSalary());

//        return new ResponseEntity(sal.getEmployees(), HttpStatus.OK);


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
