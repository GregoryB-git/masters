package com.google.crypto.tink.shaded.protobuf;

import java.util.Comparator;
import java.util.Iterator;

public class h$b
  implements Comparator
{
  public int a(h paramh1, h paramh2)
  {
    h.g localg1 = paramh1.S();
    h.g localg2 = paramh2.S();
    while ((localg1.hasNext()) && (localg2.hasNext()))
    {
      int i = Integer.valueOf(h.a(localg1.c())).compareTo(Integer.valueOf(h.a(localg2.c())));
      if (i != 0) {
        return i;
      }
    }
    return Integer.valueOf(paramh1.size()).compareTo(Integer.valueOf(paramh2.size()));
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */