package mypkg;
public class TaxBean {
   private int income,age,tax;
    private boolean govEmp;

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
        processTax();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public boolean isGovEmp() {
        return govEmp;
    }

    public void setGovEmp(boolean govEmp) {
        this.govEmp = govEmp;
    }
    
    private void processTax(){
        if(income>=500000){
            tax=income*20/100;
        }else if(income>=300000){
        tax=income*10/100;
            
        }
    } 
}
