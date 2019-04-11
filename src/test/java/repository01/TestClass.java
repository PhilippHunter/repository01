package repository01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository01.LinkedList.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClass {
  private LinkedList<Integer> testList = new LinkedList<>();

  @BeforeEach
  void Setup() {
    testList.add(1);
    testList.add(2);
    testList.add(3);
    testList.add(4);
  }

  @Test
  void testAddElements() {
    int counter = 0;
    for(int i : testList) {
      counter++;
    }
    assertEquals(4, counter);
  }
}
