package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  private int totalMoney = 0;

  @Override
  public void insertQuarter() {
    totalMoney += 25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {

    if (name.equals("ScottCola")) {
      if (totalMoney >= 75) {
        totalMoney -= 75;
        return new ScottCola();
      } else {
        throw new NotEnoughMoneyException();
      }
    } else if (name.equals("KarenTea")) {
      if (totalMoney >= 100) {
        totalMoney -= 100;
        return new KarenTea();
      } else {
        throw new NotEnoughMoneyException();
      }
    } else {
      throw new UnknownDrinkException();
    }
  }

  public static VendingMachineImpl getInstance() {
    return new VendingMachineImpl();
  }


}

