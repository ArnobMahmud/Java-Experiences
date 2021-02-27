package w3Resources;

public class breakState {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        break;
      }
      System.out.println(i);
    }
  }
}


// Java Break
// You have already seen the break statement used in an earlier chapter of this tutorial. It was used to "jump out" of a switch statement.

// The break statement can also be used to jump out of a loop.

// This example jumps out of the loop when i is equal to 4: