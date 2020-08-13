/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.util.*;
public class Quiz {

    /**
     * @param args the command line arguments
     */
     String question;
     char answer;
     int choiceA, choiceB, choiceC, choiceD;
 
     public Quiz(String ques, char ans, int cA, int cB, int cC, int cD)
    {
        this.question=ques;
        this.answer=ans;
        this.choiceA=cA;
        this.choiceB=cB;
        this.choiceC=cC;
        this.choiceD=cD;
       
    }
   
    public static void main(String[] args) {
    
         Scanner scn= new Scanner(System.in);
        boolean exit=false;
        int choice;
        int qq;
        Quiz []bm=new Quiz[3];
        bm[0]=new Quiz("11+11",'b',21, 22, 20, 23);
        bm[1]=new Quiz("50X40", 'd', 200, 100, 3000, 2000);
        bm[2]=new Quiz("30/10", 'a', 3, 10, 30, 33);

         do
       {
        System.out.println("");
        System.out.println("======MENU=======");
        System.out.println("[1] Manage Quiz");
        System.out.println("[2] Take quiz");
        System.out.println("[3] Exit");
        System.out.print("Enter choice:  "); 
        choice= scn.nextInt();
        switch (choice)
            {
                case 1: //manage quiz
                  int pili, pili1;
                  System.out.println("[1] Edit Question");
                  System.out.println("[2] View all");
                  
                    System.out.print("Select number from [1-2]: ");
                    pili=scn.nextInt();
                    
                    if (pili==1)
                    {
                        System.out.print("Select question you want to edit [0-2]: ");
                        pili1=scn.nextInt();
                         if (pili1==0)
                             {
                                bm[0].edit(bm[0]);
                             }
                          else if (pili1==1)
                            {
                                 bm[1].edit(bm[1]);
                            }
                             else if (pili1==2)
                             { 
                                  bm[2].edit(bm[2]);
                             }
                    }
                    else if (pili==2)
                    {
                        showAll(bm);
                    }
                    else if (pili==3)
                    { 
                        //balik main menu
                    }
               break;
                 
                case 2: //take quiz
                    
                take(bm);
               
                    
                break;
                case 3:
                    System.out.println("System Exit"); 
                    exit=true;
                break;
            }
            
       }while(!exit);
    }
    
    //edit question
     public void edit(Quiz x)
    {
        char newans;
        String nq;
        int cA, cB, cC, cD;
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter new question: ");
        nq=scn.next();
        this.question=nq;
       
        System.out.println("Enter choice: ");
        System.out.print("A:  ");
        cA=scn.nextInt();
        this.choiceA=cA;
       
        System.out.print("B:  ");
        cB=scn.nextInt();
        this.choiceB=cB;
       
        System.out.print("C:  ");
        cC=scn.nextInt();
        this.choiceC=cC;
       
        System.out.print("D:  ");
        cD=scn.nextInt();
        this.choiceD=cD;
       
        System.out.print("Enter correct answer: ");
        newans=scn.next().charAt(0);
        this.answer=newans;
       
        System.out.println("Question and choices successfully change! ");
    
    }
     
     //view all 
     public static void take(Quiz[] x)
    {
        int score=0;
     
      int i;
      char ansans1;
        Scanner scn= new Scanner(System.in);    
    for (i=0; i<3; i++)
        {
            System.out.println("Question# ["+i+"]: "+ x[i].question);
           System.out.println("A:  " + x[i].choiceA);
           System.out.println("B:  " +x[i].choiceB);
           System.out.println("C:  " +x[i].choiceC);
           System.out.println("D:  " +x[i].choiceD);
           System.out.print("Enter correct answer: ");
            ansans1=scn.next().charAt(0);
       
                if (x[i].answer==ansans1)
                 {
                     System.out.println("CORRECT!");
                     score++;
                 }
                else 
                 {
                     System.out.println("WRONG!!!");
                 } 
        }
    
      System.out.println("Your score is " + score);
     
      if (score==0)
      {
      System.out.println("Uh-oh! You should study more");
       System.out.println("rating: 0");
      }
       else if (score==1)
      {
        System.out.println("rating: 33%");
     
      }
         else if (score==2)
      {
        System.out.println("rating: 67%");
      }
     
       else
      {
       System.out.println("PERFECT!!!");
        System.out.println("rating: 100%");
      }
     
    }
     
    //view all question
     public static void showAll(Quiz[]x)
    {
    int i;

     System.out.println("(Q#)   (Question)(Answer)");
    for (i=0; i<3; i++)
        {
            System.out.println("bm ["+i+"]"+ "   "+ x[i].question + "    " + x[i].answer);
        }
    }
  
}
