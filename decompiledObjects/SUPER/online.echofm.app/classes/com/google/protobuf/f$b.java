package com.google.protobuf;

import java.util.Comparator;
import java.util.Iterator;

public class f$b
  implements Comparator
{
  public int a(f paramf1, f paramf2)
  {
    f.g localg1 = paramf1.D();
    f.g localg2 = paramf2.D();
    while ((localg1.hasNext()) && (localg2.hasNext()))
    {
      int i = Integer.valueOf(f.a(localg1.c())).compareTo(Integer.valueOf(f.a(localg2.c())));
      if (i != 0) {
        return i;
      }
    }
    return Integer.valueOf(paramf1.size()).compareTo(Integer.valueOf(paramf2.size()));
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.f.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */