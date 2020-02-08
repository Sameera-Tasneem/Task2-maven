package com.task2-maven.models.sweets;


import com.task2-maven.models.sweets.Sweet;


public class KajuKatli extends Sweet {
  
  private String Sweetname;

 
   public KajuKatli(int sugar, int sweet, int weight) {
   
     super(sugar, sweet, weight);
  
  }

    
public void setName(String name) {
  
      Sweetname = name;
   
 }

   
 public String getSweetname() {
   
     return Sweetname;
   
 }
}