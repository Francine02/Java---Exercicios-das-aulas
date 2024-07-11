package composicao.trabalho.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import composicao.trabalho.entities.enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }
    
    public void addContract(HourContract contract) { //Adiciona um contrato na lista
        contracts.add(contract); 
    }

    public void removeContract(HourContract contract) { //Remove contrato da lista
        contracts.remove(contract);
    }

    public Double income(int year, int month) {
        double sum = baseSalary; //Inicializa com o baseSalary
        Calendar calendar = Calendar.getInstance(); //Extrai o ano e mês de cada contrato

        for(HourContract c : contracts) { //Para cada contrato na lista, verifica se o mês e ano correspondem aos parâmetros year e month passados
            calendar.setTime(c.getDate());
            int c_year = calendar.get(Calendar.YEAR);
			int c_month = 1 + calendar.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue(); //Caso seja verdadeiro, é somado ao sum
			}
        }

        return sum;
    }
}
