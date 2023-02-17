package org.example.employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeDemo {

    public static void main(String args[]){

        List<Employee> listEmployee = new ArrayList<>();

        Employee e1 = new Employee(new BigDecimal("10000000.98"),"Raj","Adam");
        Employee e2 = new Employee(new BigDecimal("187590.90"),"Ram","Adam");
        Employee e3 = new Employee(new BigDecimal("107590.69"),"Rajat","Adam");
        Employee e4 = new Employee(new BigDecimal("190090.54"),"Rajesh","Adam");

        Employee e5 = new Employee(new BigDecimal("147590.98"),"Tat","Ben");
        Employee e6 = new Employee(new BigDecimal("157590.12"),"Tan","Ben");
        Employee e7 = new Employee(new BigDecimal("117590.21"),"Tab","Ben");
        Employee e8 = new Employee(new BigDecimal("130090.82"),"Tag","Ben");

        Employee e9 = new Employee(new BigDecimal("132790.92"),"Anand","Pappu");
        Employee e10 = new Employee(new BigDecimal("119190.12"),"Ashish","Pappu");
        Employee e11 = new Employee(new BigDecimal("127590.21"),"Asha","Pappu");

        Employee e12 = new Employee(new BigDecimal("160090.82"),"Indu","Harry");
        Employee e13 = new Employee(new BigDecimal("107590.98"),"Indra","Harry");

        Employee e14 = new Employee(new BigDecimal("63004.12"),"Puru","Jenny");
        Employee e15 = new Employee(new BigDecimal("83082.21"),"Piyush","Jenny");
        Employee e16 = new Employee(new BigDecimal("130090.82"),"Priya","Jenny");

        Employee e17= new Employee(new BigDecimal("87590.98"),"Raj","Adam");


        listEmployee.add(e1);
        listEmployee.add(e2);
        listEmployee.add(e3);
        listEmployee.add(e4);

        listEmployee.add(e5);
        listEmployee.add(e6);
        listEmployee.add(e7);
        listEmployee.add(e8);


        listEmployee.add(e9);
        listEmployee.add(e10);
        listEmployee.add(e11);

        listEmployee.add(e12);
        listEmployee.add(e13);

        listEmployee.add(e14);
        listEmployee.add(e15);
        listEmployee.add(e16);
        listEmployee.add(e17);


//

//        Map<String,List<Employee>> listMap = listEmployee.stream().collect(Collectors.groupingBy(a-> a.getGetEmployeeManagerName(), Collectors.toList()));

        Map<String,List<Employee>> listMap = listEmployee.stream().filter(a->a.getSalary().doubleValue()>10000000).collect(Collectors.groupingBy(a-> a.getGetEmployeeManagerName(), Collectors.toList()));



        System.out.println(listMap);


//        "abcabcabcd".chars().mapToObj(c->(char)c).collect(Collectors.toList())
//                    .stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                    .entrySet().stream().filter(m->m.getValue()>2).collect(Collectors.toList());

    }
}
