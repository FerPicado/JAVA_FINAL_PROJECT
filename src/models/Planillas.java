package models;

public class Planillas {

    //atributos
    private String DNI;
    private String baseSalary;
    private String deductions;
    private String primerPago;
    private String segundoPago;
    private String salNeto;
    private String salBruto;
    private String date;

    public Planillas() {
    }

    public Planillas(String DNI, String baseSalary, String deductions, String primerPago, String segundoPago, String salNeto, String salBruto, String date) {
        this.DNI = DNI;
        this.baseSalary = baseSalary;
        this.deductions = deductions;
        this.primerPago = primerPago;
        this.segundoPago = segundoPago;
        this.salNeto = salNeto;
        this.date = date;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(String baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getDeductions() {
        return deductions;
    }

    public void setDeductions(String deductions) {
        this.deductions = deductions;
    }

    public String getPrimerPago() {
        return primerPago;
    }

    public void setPrimerPago(String primerPago) {
        this.primerPago = primerPago;
    }

    public String getSegundoPago() {
        return segundoPago;
    }

    public void setSegundoPago(String segundoPago) {
        this.segundoPago = segundoPago;
    }

    public String getSalNeto() {
        return salNeto;
    }

    public void setSalNeto(String salNeto) {
        this.salNeto = salNeto;
    }

    public String getSalBruto() {
        return salBruto;
    }

    public void setSalBruto(String salBruto) {
        this.salBruto = salBruto;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
