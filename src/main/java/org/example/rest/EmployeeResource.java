package org.example.rest;

import org.example.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeResource {

    @GetMapping(produces = "application/json")
    public List<Employee> findAll() {
        return List.of(
                new Employee("1", "name1", "position1"),
                new Employee("2", "name2", "position2"),
                new Employee("3", "name3", "position3")
        );
    }

    @PostMapping
    public void createEmployee(@RequestBody Employee employee) {
        System.out.println("Created employee: " + employee);
    }

    @PutMapping
    public void updateEmployee(@RequestBody Employee employee) {
        System.out.println("Updated employee " + employee);
    }

    @DeleteMapping
    public void deleteEmployee(@RequestBody Employee employee) {
        System.out.println("Deleted employee " + employee);
    }

}
