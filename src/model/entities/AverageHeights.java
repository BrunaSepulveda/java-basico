package model.entities;

public class AverageHeights {
  private double[] heights;

  public AverageHeights(int length){
    heights = new double[length];
  }

  public int size(){
    return this.heights.length;
  }

  public void setHeights(double height, int position) {
    heights[position] = height;
  }

  public double avgHeights(){
    double totalVlaueHeight = 0;
    for(double h: heights) {
      totalVlaueHeight += h;
    }
    return totalVlaueHeight/size();
  }

}
