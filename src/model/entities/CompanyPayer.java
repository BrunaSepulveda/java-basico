package model.entities;

public class CompanyPayer extends TaxPayer {

  private Integer numberOfEmployees;

  public CompanyPayer() {
    super();
  }

  public CompanyPayer(String name, Double anualIncome, Integer numberOfEmployees) {
    super(name, anualIncome);
    this.numberOfEmployees = numberOfEmployees;
  }

  public Integer getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(Integer numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  @Override
  public double tax() {
    if (numberOfEmployees > 10) {
      return getAnualIncome() * 0.14;
    } else {
      return getAnualIncome() * 0.16;
    }
  }
  
}
