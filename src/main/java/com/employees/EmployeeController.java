
package com.employees;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation;


public class EmployeeController {
    @RequestMapping("/api")
    @Autowired
    public Methods methods;

    @RequestMapping(value = "/HighestSalary", method = RequestMethod.GET)
    public Integer HighestSalary() {
        return methods.HighestSalary();
    }

    @RequestMapping(value = "/LowestSalary", method = RequestMethod.GET)
    public Integer LowestSalary() {
        return methods.LowestSalary();
    }

    @RequestMapping(value = "/AverageSalary", method = RequestMethod.GET)
    public double AverageSalary() {
        return methods.AverageSalary();
    }

    @RequestMapping(value = "/SalaryLessThanAvg", method = RequestMethod.GET)
    public List<Integer> SalaryLessThanAvg() {
        return methods.SalaryLessThanAvg();
    }

    @RequestMapping(value = "/SalGreaterThanAvgSalary", method = RequestMethod.GET)
    public List<Integer> SalGreaterThanAvgSalary() {
        return methods.SalGreaterThanAvgSalary();
    }

    @RequestMapping(value = "/AgeGreaterThan30", method = RequestMethod.GET)
    public List<String> AgeGreaterThan30(@RequestParam int age) {
        return methods.AgeGreaterThan30(age);
    }

    @RequestMapping(value = "/SameRegion", method = RequestMethod.GET)
    public List<String> SameRegion() {
        return methods.SameRegion();
    }

    @RequestMapping(value = "/StartingWithJ", method = RequestMethod.GET)
    public List<String> StartingWithJ() {
        return methods.StartingWithJ();
    }

    @RequestMapping(value = "/AgeAndRegion", method = RequestMethod.GET)
    public List<String> AgeAndRegion() {
        return methods.AgeAndRegion();
    }

    @RequestMapping(value = "/lengthMoreThan5", method = RequestMethod.GET)
    public List<String> lengthMoreThan5() {
        return methods.lengthMoreThan5();
    }

    @RequestMapping(value = "/SalaryMorethan11000", method = RequestMethod.GET)
    public List<String> SalaryMorethan11000() {
        return methods.SalaryMorethan11000();
    }

    @RequestMapping(value = "/SecondCharacter", method = RequestMethod.GET)
    public List<Character> SecondCharacter() {
        return methods.SecondCharacter();
    }
}


