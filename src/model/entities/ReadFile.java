package model.entities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public void read(String path){
    File file = new File(path);
    Scanner sc = null;
    
    try {
      sc = new Scanner(file);
      while(sc.hasNextLine()){
        System.out.println(sc.nextLine());
      }
    } catch (FileNotFoundException e) {
      System.out.println("Erro ao tentar abrir arquivo: " + e.getMessage());
    } finally {
      if(sc != null) {
        System.out.println("fanally executado");
        sc.close();
      }
    }
  }
}