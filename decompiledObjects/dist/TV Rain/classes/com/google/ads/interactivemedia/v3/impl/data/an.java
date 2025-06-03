package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.ada;
import com.google.ads.interactivemedia.v3.internal.adb;
import com.google.ads.interactivemedia.v3.internal.adc;
import com.google.ads.interactivemedia.v3.internal.yn;
import java.io.IOException;

final class an
  extends yn<al>
{
  public final al read(ada paramada)
    throws IOException
  {
    if (paramada.f() == adc.i)
    {
      paramada.j();
      return null;
    }
    return new al(paramada.h());
  }
  
  public final void write(adb paramadb, al paramal)
    throws IOException
  {
    if (paramal == null)
    {
      paramadb.f();
      return;
    }
    paramadb.b(paramal.getName());
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.an
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */