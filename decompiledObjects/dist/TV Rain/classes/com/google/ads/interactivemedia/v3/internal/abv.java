package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

final class abv
  extends yn<URI>
{
  private static URI a(ada paramada)
    throws IOException
  {
    if (paramada.f() == adc.i)
    {
      paramada.j();
      return null;
    }
    try
    {
      paramada = paramada.h();
      if ("null".equals(paramada)) {
        return null;
      }
      paramada = new URI(paramada);
      return paramada;
    }
    catch (URISyntaxException paramada)
    {
      throw new yg(paramada);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.abv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */