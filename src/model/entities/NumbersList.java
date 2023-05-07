package model.entities;

public class NumbersList {
  int[] numbers;

  public NumbersList(int length){
    numbers = new int[length];
  }

  public int size(){
    return this.numbers.length;
  }

  public void setNumbers(int number, int position) {
    numbers[position] = number;
  }

  public String nativeNumbers(){
    int[] negatives = new int[0];
    for(int n: numbers){
      if (n < 0) {
        if(negatives.length == 0) {
          negatives = new int[1];
          negatives[0] = n;
        } else {
          int[] newNegatives = new int[negatives.length + 1];
          for(int i = 0; i < negatives.length; i++){
            newNegatives[i] = negatives[i];
          }
          newNegatives[newNegatives.length - 1] = n;
          negatives = newNegatives;
        }
      }
    }

    String negativesString = "";
    for(int n: negatives) {
      negativesString += n+", ";
    }

    return negativesString;
  }

}
