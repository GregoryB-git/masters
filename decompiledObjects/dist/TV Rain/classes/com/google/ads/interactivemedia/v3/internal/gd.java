package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;

public final class gd
{
  private final vy a = new vy(10);
  
  public final kd a(fz paramfz, ky paramky)
    throws IOException, InterruptedException
  {
    Object localObject = null;
    int i = 0;
    try
    {
      for (;;)
      {
        paramfz.c(a.a, 0, 10);
        a.c(0);
        if (a.i() != 4801587) {
          break;
        }
        a.d(3);
        int j = a.o();
        int k = j + 10;
        if (localObject == null)
        {
          localObject = new byte[k];
          System.arraycopy(a.a, 0, localObject, 0, 10);
          paramfz.c((byte[])localObject, 10, j);
          localObject = new kz(paramky).a((byte[])localObject, k);
        }
        else
        {
          paramfz.c(j);
        }
        i += k;
      }
    }
    catch (EOFException paramky)
    {
      for (;;) {}
    }
    paramfz.a();
    paramfz.c(i);
    return (kd)localObject;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.gd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */