package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class acz
  extends zs
{
  public final void a(ada paramada)
    throws IOException
  {
    if ((paramada instanceof aan))
    {
      ((aan)paramada).o();
      return;
    }
    int i = a;
    int j = i;
    if (i == 0) {
      j = paramada.r();
    }
    if (j == 13)
    {
      a = 9;
      return;
    }
    if (j == 12)
    {
      a = 8;
      return;
    }
    if (j == 14)
    {
      a = 10;
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("Expected a name but was ");
    localStringBuilder.append(paramada.f());
    localStringBuilder.append(paramada.s());
    throw new IllegalStateException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.acz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */