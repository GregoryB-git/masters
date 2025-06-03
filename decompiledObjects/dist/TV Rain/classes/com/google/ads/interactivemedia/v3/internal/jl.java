package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;

public final class jl
{
  public final int a;
  public final String b;
  public final List<ji> c;
  public final byte[] d;
  
  public jl(int paramInt, String paramString, List<ji> paramList, byte[] paramArrayOfByte)
  {
    a = paramInt;
    b = paramString;
    if (paramList == null) {
      paramString = Collections.emptyList();
    } else {
      paramString = Collections.unmodifiableList(paramList);
    }
    c = paramString;
    d = paramArrayOfByte;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.jl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */