package com.nishant.algorithms.BitManipulation;

import com.nishant.algorithms.BitManipulation.MissingNumber.MissingNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberTest {

  private int[] arr;

  @Before
  public void setup() {
    arr = new int[]{0, 5, 2, 3, 4};
  }

  @Test
  public void resultTest() {
    assertEquals(1, MissingNumber.missingNumber(arr));
  }
}
