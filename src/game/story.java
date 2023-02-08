package game;

public class story {
    public static void printIntro(){
        gamelogic.clearconsole();
        gamelogic.heading("PRISON");
        System.out.println("You have been falsely sentenced to 15 years in prison. . .");
        System.out.println("The person who was guily is still out in the world. Your family and friends are all being threatened");
        System.out.println("All you want is revenge, you need break out of prison, to stop the terror and save your family");
        gamelogic.presstocontinue();

    }

    public static void printEnterance(){
        gamelogic.clearconsole();
        gamelogic.heading("ENTERING THE PRISON");
        System.out.println("A terrifying territory that you have never encountered before. . .");
        System.out.println("Everyone here is dangerous. . .");
        System.out.println("You must be cautious. . .");
    }
    public static void printjailCell(){
        gamelogic.clearconsole();
        gamelogic.heading("JAIL CELL #313");
        System.out.println("You are in a small jail cell, nothing but a sink, a bed, and a toilet.");
        System.out.println("You get called by one of the guards, they say someone is waiting to meet you. . .");
        System.out.println("Something is suspicious. . .");
        gamelogic.presstocontinue();

    }

    public static void printMeeting(){
        gamelogic.clearconsole();
        gamelogic.heading("MEETING");
        System.out.println("You are brought to the meeting.");
        System.out.println("Someone is standing there, someone you have never met before");
        System.out.println("He whispers into your ear, its my fault you are in this. . .");
    }

    public static void printOutside(){
        gamelogic.clearconsole();
        gamelogic.heading("OUTSIDE WORLD");
        System.out.println("For some reason you get a day out of the prison. . .");
        System.out.println("This seems weird. . .");
        System.out.println("It is a nice break. . .");
    }

    public static void printInside(){
        gamelogic.clearconsole();
        gamelogic.print(30);
        System.out.println("Time is over, you go into the prison. . .");
    }
    public static void printMeetingQuestions1(){
        gamelogic.clearconsole();
        gamelogic.print(30);
        System.out.println("who are you. . .");
    }
    public static void printMeetingQuestions2(){
        gamelogic.clearconsole();
        gamelogic.print(30);
        System.out.println("what do you want from me. . .");
    }
    public static void printMeetingQuestions3(){
        gamelogic.clearconsole();
        gamelogic.print(30);
        System.out.println(". . .");
    }

    public static void printAsylum(){
        gamelogic.clearconsole();
        gamelogic.heading("ASYLUM");
        System.out.println("You have arrived at the asylum. . .");
        System.out.println("You are immediately offered pills. . .");
    }

    public static void printExitAsylum(){
        gamelogic.clearconsole();
        gamelogic.print(30);
        System.out.println("At last, your time inside there is over");
        System.out.println("Luckily you have not taken any of those pills. . .");
        System.out.println("You would've stayed in there forever. . .");
    }
    public static void printCafeteria(){
        gamelogic.clearconsole();
        gamelogic.heading("CAFETERIA ");
        System.out.println("You enter the cafeteria. . .");
        System.out.println("The food looks disgusting. . . yet you see inmates eating it");
    }

    public static void printExitCafeteria(){
        gamelogic.clearconsole();
        gamelogic.print(30);
        System.out.println("The food there was quite terrible.");
        System.out.println("As you leave you figure out some of the food was poisoned");
        System.out.println("You are grateful as you come out with your life");
    }

    public static void printCourtyard(){
        gamelogic.clearconsole();
        gamelogic.heading("COURTYARD");
        System.out.println("Finally, you are outside");
        System.out.println("You can smell the fresh air, you can almost feel the freedom. . .");
        System.out.println("Yet it is still so far away. . .");
    }

    public static void printExitCourtyard(){
        gamelogic.clearconsole();
        gamelogic.print(30);
        System.out.println("Sadly it is time to come back in. . .");
        System.out.println("You now see the path to escape");
        System.out.println("You start planning your escape. . .");
    }
    public static void printHealthroom(){
        gamelogic.clearconsole();
        gamelogic.print(30);
        System.out.println("You notice yourself bleeding, you didnt feel it. . .");
        System.out.println("Everything is starting to fade out . . .");
        gamelogic.heading("HOSPITAL");
        System.out.println("You have entered the hospital");
        System.out.println("It is a very neat place. . .");
        System.out.println("Compared to the rest of the prison.");
    }

    public static void printExitHealthroom(){
        gamelogic.clearconsole();
        System.out.println("The doctors there were very nice. . .");
        System.out.println("You wish you could've stayed there.");
        System.out.println("However you have better things to do. . .");
    }
    public static void printShed(){
        gamelogic.clearconsole();
        gamelogic.heading("SHED");
        System.out.println("You entered the shed.");
        System.out.println("A very quiet place, where no one can see you. . .");
        System.out.println("full of materials. . . full of weapons. . .");
    }

    public static void printExitshed(){
        gamelogic.clearconsole();
        gamelogic.print(30);
        System.out.println("You exit the shed. . .");
        System.out.println("You have completed most of what is needed to be done");
        System.out.println("The time is near, its almost time to escape. . .");
    }

    public static void printEscape(){
        gamelogic.clearconsole();
        gamelogic.heading("ESCAPE THE PRISON");
        System.out.println("Tonight is the night. . .");
        System.out.println("Everything will be decided today. . .");
    }

    public static void printEscaped(){
        gamelogic.clearconsole();
        gamelogic.heading("ESCAPED");
        System.out.println("You have escaped the prison. . .");
        System.out.println("Free at last. . .");
        System.out.println("But are you truly free?");
        System.out.println("You wonder that as you hear sirens wailing in the background. . .");
    }

    public static void printEnding(){
        gamelogic.clearconsole();
        gamelogic.heading("ENDING");
        System.out.println("THE END");
        System.out.println("thank you for playing");
    }

}
