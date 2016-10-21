package org.example.buck;

import java.io.IOException;
import java.util.Collections;
import java.util.SortedSet;

public class Main {

  private void mainImpl() throws IOException {
    SortedSet<String> s = Collections.emptySortedSet();
    System.out.println("s " + s.size());
  }

  public static void main(String[] args) throws IOException {
    new Main().mainImpl();
  }
}
