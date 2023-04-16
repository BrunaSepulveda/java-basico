package entities;

public class UpDownCasting {
  
  static void test(){
    // Account acc = new Account();
    BusinessAccount bacc = new BusinessAccount();
    SavingsAccount sacc = new SavingsAccount();
    //up perde suas especificações
    Account acc1 = bacc;

    // donw
    // BusinessAccount bacc2 = (BusinessAccount) acc;

    /*
     Erro em tempo de execução
     BusinessAccount bacc3 = (BusinessAccount) sacc;
     instanceof checa a classe
    */
  }
}
