package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

final class acs
  extends yn<AtomicInteger>
{
  private static AtomicInteger a(ada paramada)
    throws IOException
  {
    try
    {
      paramada = new AtomicInteger(paramada.m());
      return paramada;
    }
    catch (NumberFormatException paramada)
    {
      throw new yl(paramada);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.acs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */