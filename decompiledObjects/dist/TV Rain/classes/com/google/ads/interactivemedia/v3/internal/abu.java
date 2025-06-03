package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.BitSet;

final class abu
  extends yn<BitSet>
{
  private static BitSet a(ada paramada)
    throws IOException
  {
    BitSet localBitSet = new BitSet();
    paramada.a();
    Object localObject = paramada.f();
    int i = 0;
    while (localObject != adc.b)
    {
      int j = ((Enum)localObject).ordinal();
      boolean bool = true;
      if (j != 5) {
        if (j != 6)
        {
          if (j == 7)
          {
            bool = paramada.i();
          }
          else
          {
            paramada = new StringBuilder("Invalid bitset value type: ");
            paramada.append(localObject);
            throw new yl(paramada.toString());
          }
        }
        else if (paramada.m() != 0) {}
      }
      for (;;)
      {
        bool = false;
        break label127;
        localObject = paramada.h();
        try
        {
          j = Integer.parseInt((String)localObject);
          if (j == 0) {}
        }
        catch (NumberFormatException paramada)
        {
          label127:
          paramada = new StringBuilder("Error: Expecting: bitset number value (1, 0), Found: ");
          paramada.append((String)localObject);
          throw new yl(paramada.toString());
        }
      }
      if (bool) {
        localBitSet.set(i);
      }
      i++;
      localObject = paramada.f();
    }
    paramada.b();
    return localBitSet;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.abu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */