package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class hw
{
  private static final int[] a = { 1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153 };
  
  public static boolean a(fz paramfz)
    throws IOException, InterruptedException
  {
    return a(paramfz, true);
  }
  
  private static boolean a(fz paramfz, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    long l1 = paramfz.d();
    boolean bool1 = l1 < -1L;
    long l2 = 4096L;
    long l3 = l2;
    if (bool1) {
      if (l1 > 4096L) {
        l3 = l2;
      } else {
        l3 = l1;
      }
    }
    int i = (int)l3;
    vy localvy = new vy(64);
    int j = 0;
    int k = j;
    while (j < i)
    {
      localvy.a(8);
      paramfz.c(a, 0, 8);
      l2 = localvy.j();
      int m = localvy.l();
      int n = 16;
      if (l2 == 1L)
      {
        paramfz.c(a, 8, 8);
        localvy.b(16);
        l3 = localvy.m();
      }
      else
      {
        l3 = l2;
        if (l2 == 0L)
        {
          long l4 = paramfz.d();
          l3 = l2;
          if (l4 != -1L) {
            l3 = l4 - paramfz.b() + 8L;
          }
        }
        n = 8;
      }
      if ((bool1) && (j + l3 > l1)) {
        return false;
      }
      l2 = n;
      if (l3 < l2) {
        return false;
      }
      n = j + n;
      if (m == 1836019574)
      {
        i += (int)l3;
        j = i;
        if (bool1)
        {
          j = i;
          if (i > l1) {
            j = (int)l1;
          }
        }
        i = j;
        j = n;
      }
      else if ((m != 1836019558) && (m != 1836475768))
      {
        if (n + l3 - l2 < i)
        {
          j = (int)(l3 - l2);
          int i1 = n + j;
          if (m == 1718909296)
          {
            if (j < 8) {
              return false;
            }
            localvy.a(j);
            paramfz.c(a, 0, j);
            m = j / 4;
            for (n = 0;; n++)
            {
              j = k;
              if (n >= m) {
                break;
              }
              if (n == 1)
              {
                localvy.d(4);
              }
              else
              {
                int i2 = localvy.l();
                if (i2 >>> 8 == 3368816)
                {
                  j = 1;
                }
                else
                {
                  int[] arrayOfInt = a;
                  int i3 = arrayOfInt.length;
                  for (j = 0;; j++)
                  {
                    if (j >= i3) {
                      break label466;
                    }
                    if (arrayOfInt[j] == i2) {
                      break;
                    }
                  }
                  label466:
                  j = 0;
                }
                if (j != 0)
                {
                  j = 1;
                  break;
                }
              }
            }
            n = j;
            if (j == 0) {
              return false;
            }
          }
          else
          {
            n = k;
            if (j != 0)
            {
              paramfz.c(j);
              n = k;
            }
          }
          j = i1;
          k = n;
        }
      }
      else
      {
        bool2 = true;
        break label536;
      }
    }
    boolean bool2 = false;
    label536:
    return (k != 0) && (paramBoolean == bool2);
  }
  
  public static boolean b(fz paramfz)
    throws IOException, InterruptedException
  {
    return a(paramfz, false);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.hw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */