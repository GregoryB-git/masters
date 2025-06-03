package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class abj
  extends yn<Number>
{
  private static Number a(ada paramada)
    throws IOException
  {
    if (paramada.f() == adc.i)
    {
      paramada.j();
      return null;
    }
    try
    {
      long l = paramada.l();
      return Long.valueOf(l);
    }
    catch (NumberFormatException paramada)
    {
      throw new yl(paramada);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.abj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */