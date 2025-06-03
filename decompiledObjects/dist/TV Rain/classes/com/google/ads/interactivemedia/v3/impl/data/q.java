package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.ahw;
import java.util.List;

final class q
  extends ah
{
  private ahw<ak> obstructions;
  
  public final ai build()
  {
    ahw localahw = obstructions;
    String str = "";
    if (localahw == null) {
      str = "".concat(" obstructions");
    }
    if (!str.isEmpty())
    {
      if (str.length() != 0) {
        str = "Missing required properties:".concat(str);
      } else {
        str = new String("Missing required properties:");
      }
      throw new IllegalStateException(str);
    }
    return new n(obstructions, null);
  }
  
  public final ah obstructions(List<ak> paramList)
  {
    obstructions = ahw.a(paramList);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */