package com.google.android.gms.internal.measurement;

import W2.m;
import W2.s;
import X2.x;

public final class d3
{
  public final boolean a;
  
  public d3(h3 paramh3)
  {
    m.k(paramh3, "BuildInfo must be non-null");
    a = (paramh3.a() ^ true);
  }
  
  public final boolean a(String paramString)
  {
    m.k(paramString, "flagName must not be null");
    if (!a) {
      return true;
    }
    return ((x)g3.a.get()).b(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.d3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */