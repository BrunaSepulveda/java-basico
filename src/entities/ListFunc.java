package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListFunc {
  //<Integer> generics
  private List<String> listStr = new ArrayList<>();

  public void addList(String element){
    listStr.add(element);
  }

  public void addByPosition(int position, String element){
    listStr.add(position, element);
  }

  public void removeValueByComparisonOfValues(String element){
    listStr.remove(element);
  }

  public void removeByPosition(int position){
    listStr.remove(position);
  }

  public void removeByConditional(Predicate<? super String> filter){
    listStr.removeIf(filter);
  }

  public int findPositionEl(String el){
    //if not found returns -1
    return listStr.indexOf(el);
  }

  public List<String> filterWithStreamAndCast(Predicate<? super String> filter){
    List<String> newList = listStr.stream().filter(filter).collect(Collectors.toList());
    return newList;
  }

  public String findFirstOrNull(List<String> list){
    return list.stream().findFirst().orElse(null);
  }

  public String findFirstOrNull(){
    return listStr.stream().findFirst().orElse(null);
  }

  public void printAllList(){
    for (String integer : listStr) {
      System.out.println(integer);
    }
  }
}
