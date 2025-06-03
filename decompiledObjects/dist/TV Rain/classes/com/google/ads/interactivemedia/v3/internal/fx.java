package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;

public final class fx
  implements gi
{
  public final int a(fz paramfz, int paramInt, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    paramInt = paramfz.a(paramInt);
    if (paramInt == -1)
    {
      if (paramBoolean) {
        return -1;
      }
      throw new EOFException();
    }
    return paramInt;
  }
  
  public final void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, gl paramgl) {}
  
  public final void a(bw parambw) {}
  
  public final void a(vy paramvy, int paramInt)
  {
    paramvy.d(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.fx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */