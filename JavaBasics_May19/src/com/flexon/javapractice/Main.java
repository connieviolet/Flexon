package com.flexon.javapractice;
import people.*;
// Demonstration of Threads

class Main 
{ public static void main(String[] x) throws Exception
  { Person connie = new Person("Connie", "Black", "Brown", "Yellow", 5.5, 176);
    Person tony = new Mutant("Tony", "Brown", "Brown", "White", 6.1, 225, "Armor Suit");
    PPThread pConnieThread = new PPThread(connie,1000);
    PPThread pTonyThread = new PPThread(tony,1500);
    pConnieThread.start();
    pTonyThread.start();
  }
}
class PPThread extends Thread
{ private Person p;
  private int pause;
  public PPThread(Person p, int pause)
  { super();
    this.p = p;
    this.pause = pause;
  }
  public void run()
  { for (int j=0; j<10; j++)
    { p.print();
      try {sleep(pause);} catch (InterruptedException ie) {}
    }
  }
}
