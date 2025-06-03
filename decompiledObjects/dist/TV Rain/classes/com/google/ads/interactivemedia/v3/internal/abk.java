package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

final class abk
  extends yn<AtomicIntegerArray>
{
  private static AtomicIntegerArray a(ada paramada)
    throws IOException
  {
    ArrayList localArrayList = new ArrayList();
    paramada.a();
    while (paramada.e()) {
      try
      {
        localArrayList.add(Integer.valueOf(paramada.m()));
      }
      catch (NumberFormatException paramada)
      {
        throw new yl(paramada);
      }
    }
    paramada.b();
    int i = localArrayList.size();
    paramada = new AtomicIntegerArray(i);
    for (int j = 0; j < i; j++) {
      paramada.set(j, ((Integer)localArrayList.get(j)).intValue());
    }
    return paramada;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.abk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */