package com.practice.employees;

import java.text.NumberFormat;

import java.util.*;
import java.util.regex.Matcher;

public class Main {

    private static Set<IEmployee> employees;
    private static Map<String, Integer> salaryMap;

    public static void main(String[] args) {
        String peopleText = """
            Flinstone, Fred, 1/1/1900, Programmer, {locpd=2500,yoe=10,iq=140}
            Flinstone, Fred, 1/1/1900, Programmer, {locpd=4000,yoe=10,iq=140}
            Flinstone, Fred, 1/1/1900, Programmer, {locpd=5000,yoe=10,iq=140}
            Flinstone, Fred, 1/1/1900, Programmer, {locpd=6000,yoe=10,iq=140}
            Flinstone, Fred, 1/1/1900, Programmer, {locpd=7000,yoe=10,iq=140}
            Flinstone, Fred, 1/1/1900, Programmer, {locpd=9000,yoe=10,iq=140}
            Flinstone, Fred, 1/1/1900, Programmerzzzzz, {locpd=10000,yoe=10,iq=140}
            Flinstone2, Fred2, 1/1/1900, Programmer, {locpd=1300,yoe=14,iq=100}
            Flinstone3, Fred3, 1/1/1900, Programmer, {locpd=2300,yoe=8,iq=105}
            Flinstone4, Fred4, 1/1/1900, Programmer, {locpd=1630,yoe=3,iq=115}
            Flinstone5, Fred5, 1/1/1900, Programmer, {locpd=5,yoe=10,iq=100}
            Rubble, Barney, 2/2/1905, Manager, {orgSize=300,dr=10}
            Rubble2, Barney2, 2/2/1905, Manager, {orgSize=100,dr=4}
            Rubble3, Barney3, 2/2/1905, Manager, {orgSize=200,dr=2}
            Rubble4, Barney4, 2/2/1905, Manager, {orgSize=500,dr=8}
            Rubble5, Barney5, 2/2/1905, Manager, {orgSize=175,dr=20}
            Flinstone, Wilma, 3/3/1910, Analyst, {projectCount=3}
            Flinstone2, Wilma2, 3/3/1910, Analyst, {projectCount=4}
            Flinstone3, Wilma3, 3/3/1910, Analyst, {projectCount=5}
            Flinstone4, Wilma4, 3/3/1910, Analyst, {projectCount=6}
            Flinstone5, Wilma5, 3/3/1910, Analyst, {projectCount=9}
            Rubble, Betty, 4/4/1915, CEO, {avgStockPrice=300}
            """;



        Matcher mat = Employee.PAT.matcher(peopleText);

        int totalSalaries = 0;
        IEmployee employee = null;
        employees = new TreeSet<>((e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary()));
        salaryMap = new LinkedHashMap<>();
        while (mat.find()) {
            employee = Employee.createEmployee(mat.group());
            Employee emp = (Employee) employee;
            boolean add = employees.add(employee);
            salaryMap.put(emp.firstName, emp.getSalary());
        }

//        IEmployee myEmployee = employees.get(2);
//        System.out.println("First: " + employees.contains(myEmployee));
//
//        IEmployee employee1 = Employee.createEmployee("Smith3, Fred, 1/1/1979, Programmer, {locpd=2300, yoe=8, iq=105}");
//        System.out.println("Second: " + employees.contains(employee1));
//
//        System.out.println("Third: " + myEmployee.equals(employee1));
//
//        Collections.sort(employees, Comparator.naturalOrder());
//
//        Collections.sort(employees, (o1, o2) -> {
//            if(o1 instanceof Employee emp1 && o2 instanceof Employee emp2){
//                int lastNameResult = emp2.lastName.compareTo(emp1.lastName);
//                return lastNameResult != 0 ? lastNameResult : Integer.compare(emp1.getSalary(),emp2.getSalary());
//            }
//            return 0;
//        });
//
//        employees.sort((o1, o2) -> {
//            if(o1 instanceof Employee emp1 && o2 instanceof Employee emp2){
//                int lastNameResult = emp2.lastName.compareTo(emp1.lastName);
//                return lastNameResult != 0 ? lastNameResult : Integer.compare(emp1.getSalary(),emp2.getSalary());
//            }
//            return 0;
//        });

//        List<String> removalNames = new ArrayList<>(List.of("Smith2", "Flintstone2", "McGuire2"));
//        removalNames.sort(Comparator.naturalOrder());
//        System.out.println(removalNames);

//      For loop to iterate over a collection
        for (IEmployee worker : employees){
                System.out.println(worker.toString());
                totalSalaries += worker.getSalary();
            }



            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
            System.out.printf("The total payout should be %s%n", currencyInstance.format(totalSalaries));
            System.out.println(employees.size());
            System.out.println(salaryMap.values());
            System.out.println(salaryMap.keySet());
            System.out.println(salaryMap.entrySet()); // Useful for iterating over entries
            System.out.println(salaryMap.containsKey("Fred3"));
            System.out.println(salaryMap.containsValue(7500));

        for(Map.Entry<String, Integer> entry: salaryMap.entrySet()){
            System.out.printf("Key: %s, Value = %s%n", entry.getKey(), entry.getValue());
        }
//
//    private static void removeUndesirables(List<IEmployee> employees, List<String> removalNames) {
//        for(Iterator<IEmployee> iterator = employees.iterator(); iterator.hasNext();){
//            IEmployee worker = iterator.next();
//            if(worker instanceof Employee tempWorker){
//                if(removalNames.contains(tempWorker.lastName)){
//                    iterator.remove();
//                }
//            }
//        }
    }

    public int getSalary(String firstName) {
//       return salaryMap.get(firstName);
        return salaryMap.getOrDefault(firstName, -1);
    }
}