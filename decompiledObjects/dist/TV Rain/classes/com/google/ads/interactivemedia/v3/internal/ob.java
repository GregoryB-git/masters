package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Random;

public class ob
{
  private final Random a;
  private final int[] b;
  private final int[] c;
  
  public ob(int paramInt)
  {
    this(0, new Random());
  }
  
  private ob(int paramInt, Random paramRandom)
  {
    this(a(paramInt, paramRandom), paramRandom);
  }
  
  private ob(int[] paramArrayOfInt, Random paramRandom)
  {
    b = paramArrayOfInt;
    a = paramRandom;
    c = new int[paramArrayOfInt.length];
    for (int i = 0; i < paramArrayOfInt.length; i++) {
      c[paramArrayOfInt[i]] = i;
    }
  }
  
  private static int[] a(int paramInt, Random paramRandom)
  {
    int[] arrayOfInt = new int[paramInt];
    int j;
    for (int i = 0; i < paramInt; i = j)
    {
      j = i + 1;
      int k = paramRandom.nextInt(j);
      arrayOfInt[i] = arrayOfInt[k];
      arrayOfInt[k] = i;
    }
    return arrayOfInt;
  }
  
  public int a()
  {
    return b.length;
  }
  
  public int a(int paramInt)
  {
    paramInt = c[paramInt] + 1;
    int[] arrayOfInt = b;
    if (paramInt < arrayOfInt.length) {
      return arrayOfInt[paramInt];
    }
    return -1;
  }
  
  public ob a(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt1 = new int[paramInt2];
    int[] arrayOfInt2 = new int[paramInt2];
    int i = 0;
    Object localObject;
    int m;
    for (int j = 0; j < paramInt2; j = k)
    {
      arrayOfInt1[j] = a.nextInt(b.length + 1);
      localObject = a;
      k = j + 1;
      m = ((Random)localObject).nextInt(k);
      arrayOfInt2[j] = arrayOfInt2[m];
      arrayOfInt2[m] = (j + paramInt1);
    }
    Arrays.sort(arrayOfInt1);
    int[] arrayOfInt3 = new int[b.length + paramInt2];
    int k = 0;
    j = k;
    for (;;)
    {
      localObject = b;
      if (i >= localObject.length + paramInt2) {
        break;
      }
      if ((k < paramInt2) && (j == arrayOfInt1[k]))
      {
        arrayOfInt3[i] = arrayOfInt2[k];
        k++;
      }
      else
      {
        m = localObject[j];
        arrayOfInt3[i] = m;
        if (m >= paramInt1) {
          arrayOfInt3[i] = (m + paramInt2);
        }
        j++;
      }
      i++;
    }
    return new ob(arrayOfInt3, new Random(a.nextLong()));
  }
  
  public int b()
  {
    int[] arrayOfInt = b;
    if (arrayOfInt.length > 0) {
      return arrayOfInt[(arrayOfInt.length - 1)];
    }
    return -1;
  }
  
  public int b(int paramInt)
  {
    paramInt = c[paramInt] - 1;
    if (paramInt >= 0) {
      return b[paramInt];
    }
    return -1;
  }
  
  public ob b(int paramInt1, int paramInt2)
  {
    int i = paramInt2 - paramInt1;
    int[] arrayOfInt1 = new int[b.length - i];
    int j = 0;
    int k = 0;
    for (;;)
    {
      int[] arrayOfInt2 = b;
      if (j >= arrayOfInt2.length) {
        break;
      }
      int m = arrayOfInt2[j];
      if ((m >= paramInt1) && (m < paramInt2))
      {
        k++;
      }
      else
      {
        int n = m;
        if (m >= paramInt1) {
          n = m - i;
        }
        arrayOfInt1[(j - k)] = n;
      }
      j++;
    }
    return new ob(arrayOfInt1, new Random(a.nextLong()));
  }
  
  public int c()
  {
    int[] arrayOfInt = b;
    if (arrayOfInt.length > 0) {
      return arrayOfInt[0];
    }
    return -1;
  }
  
  public ob d()
  {
    return new ob(0, new Random(a.nextLong()));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ob
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */