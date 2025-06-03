package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class acn
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
      byte b = (byte)paramada.m();
      return Byte.valueOf(b);
    }
    catch (NumberFormatException paramada)
    {
      throw new yl(paramada);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.acn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */