package com.task2-maven;


import com.task2-maven.models.chocolate.DairyMilk;

import com.task2-maven.models.chocolate.MilkyBar;


import com.task2-maven.models.chocolate.sweets.QubaniKaMeetha;

import com.task2-maven.models.sweets.KajuKatli;

import com.task2-maven.models.sweets.MaWaBati;


public class App {
  
  public static void main(String[] args) {
     
   	MaWaBati mb = new MaWaBati(90,70,5);
    
    	mb.setName("Mawa Bati");
   
     	System.out.println("Sweets Name : "+" "+mb.getName()+" Sugar Content :"+mb.getSugarPercent()+"% "+" Sweet Content :"+mb.getsweetContent()+"% "+" Weight :"+mb.getWeight()+"gm");



    
   	KajuKatli kaju = new KajuKatli(60,40,10);
  
      	kaju.setName("KajuKatli");
     
   	System.out.println("Sweets Name : "+" "+ kaju.getSweetname()+" Sugar Content :"+ kaju.getSugarPercent()+"% "+" Sweet Content :"+ kaju.getsweetContent()+"% "+" Weight :"+ kaju.getWeight()+"gm");


  
   	QubaniKaMeetha meetha = new QubaniKaMeetha(90,60,20);
      
  	meetha.setName("Qubani Ka Meetha");
      
  	System.out.println("Sweets Name : "+" "+meetha.getSweetname()+" Sugar Content :"+meetha.getSugarPercent()+"% "+" Sweet Content :"+meetha.getsweetContent()+"% "+" Weight :"+meetha.getWeight()+"gm");


     
 	 System.out.println(mb.isSweet("Mawa Bati"));
      
  	System.out.println("KajuKatli : "+ kaju.isSweet(40,55));


     
 	  DairyMilk silk = new DairyMilk(80,20);
     
  	 silk.setName("Silk Redvelvet");
      
 	 System.out.println("Chocolate : "+" "+silk.getName()+" "+"Chocolate Content :"+silk.getcocoaContent()+"% "+" "+"Milk Content: "+silk.getmilkContent()+"%");


      
 	 MilkyBar bar = new MilkyBar(40,60);
   
    	 bar.setName("Milky Bar");
   
     	System.out.println("Chocolate : "+" "+bar.getName()+" "+"Chocolate Content :"+bar.getcocoaContent()+"% "+" "+"Milk Content: "+bar.getmilkContent()+"%");

     
   	//Sorting the order of chocolates based on  cocoaContent as there are 2 items in the pre determined gift chocolates
     
   	//finding the Candies in the gift box
      
	if (silk.getcocoaContent()>bar.getcocoaContent()){
     
       	System.out.println("Candies in the box : "+bar.getName());
     
       	System.out.println("Items in the gift Box : "+bar.getName()+ ", "+silk.getName()+ ", "+mb.getName()+ ", "+ kaju.getSweetname()+ ", "+meetha.getSweetname());
  
      }
	else
	{
         
   		System.out.println("Candies in the box : "+silk.getName());
     
       		System.out.println("Items in the gift Box : "+silk.getName() + ", "+bar.getName()+ ", "+mb.getName()+ ", "+ kaju.getSweetname()+ ", "+meetha.getSweetname());
     
  	}

        
	int chowt = mb.getWeight()+ kaju.getWeight()+meetha.getWeight();
       
 	System.out.println("Weight of the Gift is : "+getGiftWeight(chowt,50)+"gm");

 
  }

   
 public static int getGiftWeight(int chocolateswght,int sweetswght){
   
     return chocolateswght+sweetswght;
 
   }
}
