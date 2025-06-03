package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayDeque;
import z2;

class gp
{
  private final byte[] a = new byte[8];
  private final ArrayDeque<gn> b = new ArrayDeque();
  private final gs c = new gs();
  private gm d;
  private int e;
  private int f;
  private long g;
  
  private long a(fz paramfz, int paramInt)
    throws IOException, InterruptedException
  {
    byte[] arrayOfByte = a;
    int i = 0;
    paramfz.b(arrayOfByte, 0, paramInt);
    long l = 0L;
    while (i < paramInt)
    {
      l = l << 8 | a[i] & 0xFF;
      i++;
    }
    return l;
  }
  
  private double b(fz paramfz, int paramInt)
    throws IOException, InterruptedException
  {
    long l = a(paramfz, paramInt);
    double d1;
    if (paramInt == 4) {
      d1 = Float.intBitsToFloat((int)l);
    } else {
      d1 = Double.longBitsToDouble(l);
    }
    return d1;
  }
  
  private long b(fz paramfz)
    throws IOException, InterruptedException
  {
    paramfz.a();
    for (;;)
    {
      paramfz.c(a, 0, 4);
      int i = gs.a(a[0]);
      if ((i != -1) && (i <= 4))
      {
        int j = (int)gs.a(a, i, false);
        if (d.b(j))
        {
          paramfz.b(i);
          return j;
        }
      }
      paramfz.b(1);
    }
  }
  
  private static String c(fz paramfz, int paramInt)
    throws IOException, InterruptedException
  {
    if (paramInt == 0) {
      return "";
    }
    byte[] arrayOfByte = new byte[paramInt];
    paramfz.b(arrayOfByte, 0, paramInt);
    while ((paramInt > 0) && (arrayOfByte[(paramInt - 1)] == 0)) {
      paramInt--;
    }
    return new String(arrayOfByte, 0, paramInt);
  }
  
  public void a()
  {
    e = 0;
    b.clear();
    c.a();
  }
  
  public void a(gm paramgm)
  {
    d = paramgm;
  }
  
  public boolean a(fz paramfz)
    throws IOException, InterruptedException
  {
    rp.a(d);
    for (;;)
    {
      if ((!b.isEmpty()) && (paramfz.c() >= gn.a((gn)b.peek())))
      {
        d.c(gn.b((gn)b.pop()));
        return true;
      }
      long l1;
      long l2;
      if (e == 0)
      {
        l1 = c.a(paramfz, true, false, 4);
        l2 = l1;
        if (l1 == -2L) {
          l2 = b(paramfz);
        }
        if (l2 == -1L) {
          return false;
        }
        f = ((int)l2);
        e = 1;
      }
      if (e == 1)
      {
        g = c.a(paramfz, false, true, 8);
        e = 2;
      }
      int i = d.a(f);
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i != 4)
              {
                if (i == 5)
                {
                  l2 = g;
                  if ((l2 != 4L) && (l2 != 8L))
                  {
                    l2 = g;
                    paramfz = new StringBuilder(40);
                    paramfz.append("Invalid float size: ");
                    paramfz.append(l2);
                    throw new ce(paramfz.toString());
                  }
                  d.a(f, b(paramfz, (int)l2));
                  e = 0;
                  return true;
                }
                throw new ce(z2.k(32, "Invalid element type ", i));
              }
              d.a(f, (int)g, paramfz);
              e = 0;
              return true;
            }
            l2 = g;
            if (l2 <= 2147483647L)
            {
              d.a(f, c(paramfz, (int)l2));
              e = 0;
              return true;
            }
            l2 = g;
            paramfz = new StringBuilder(41);
            paramfz.append("String element size: ");
            paramfz.append(l2);
            throw new ce(paramfz.toString());
          }
          l2 = g;
          if (l2 <= 8L)
          {
            d.a(f, a(paramfz, (int)l2));
            e = 0;
            return true;
          }
          l2 = g;
          paramfz = new StringBuilder(42);
          paramfz.append("Invalid integer size: ");
          paramfz.append(l2);
          throw new ce(paramfz.toString());
        }
        l1 = paramfz.c();
        l2 = g;
        b.push(new gn(f, l2 + l1, (byte)0));
        d.a(f, l1, g);
        e = 0;
        return true;
      }
      paramfz.b((int)g);
      e = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.gp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */