/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import entities.enums.WorkerLevel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author RAFAEL
 */
public class Worker {
    
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    
    private Departments departaments;
    private List<HourContract> contracts = new ArrayList<>(); 

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departments departaments) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departaments = departaments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departments getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Departments departaments) {
        this.departaments = departaments;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

   
    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    
    }
    
    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if(year == c_year && month == c_month ){
            sum += c.totalValue();
        
     }
    }
        return sum;
   }
   
    
    
    
    
}
