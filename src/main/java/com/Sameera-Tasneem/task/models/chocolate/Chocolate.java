package com.task2-maven.models.chocolate;


import com.task2-maven.interfaces.Chocolates;


public class Chocolate implements Chocolates {
  
  private int cocoaContent, milkContent;

   
 public Chocolate(int cocoa, int milk) {
      
  this.cocoaContent = cocoa;
      
  this.milkContent = milk;
   
 }

  
  public int getcocoaContent()
 {
    
    return cocoaContent;
    
}

   
 public int getmilkContent() {
    
    return milkContent;
   
 }

  
  public boolean isDarkChocolate(int cocoaContent) {
    
    return (cocoaContent >= 80);

  
  }

 
   public boolean isDarkChocolate(int cocoaContent, int milkContent) {
    
    return !((cocoaContent >= 80) && (milkContent > 60));

  
  }

}

