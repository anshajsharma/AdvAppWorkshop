package com.sih.codeforcesanalysis.Classes;

import java.util.Comparator;

public class SortByTime implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o2.getRegistrationTimeSeconds().compareTo(o1.getRegistrationTimeSeconds());
    }
}
///                                 WAY TO IMPLEMENT

//    ArrayList<Employee> employees = new ArrayList<>();
//
//        employees.add(new Employee(1l, "Alex", LocalDate.of(2018, Month.APRIL, 21)));
//                employees.add(new Employee(4l, "Brian", LocalDate.of(2018, Month.APRIL, 22)));
//                employees.add(new Employee(3l, "David", LocalDate.of(2018, Month.APRIL, 25)));
//                employees.add(new Employee(5l, "Charles", LocalDate.of(2018, Month.APRIL, 23)));
//                employees.add(new Employee(2l, "Edwin", LocalDate.of(2018, Month.APRIL, 24)));
//
//                employees.sort(new SortByTime());