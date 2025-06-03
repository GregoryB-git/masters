package com.google.ads.interactivemedia.v3.internal;

import java.util.Map.Entry;
import java.util.Set;

public final class yi
  extends yd
{
  private final zu<String, yd> a = new zu();
  
  public final void a(String paramString, yd paramyd)
  {
    Object localObject = paramyd;
    if (paramyd == null) {
      localObject = yf.a;
    }
    a.put(paramString, localObject);
  }
  
  public final boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof yi)) && (a.equals(a)));
  }
  
  public final Set<Map.Entry<String, yd>> h()
  {
    return a.entrySet();
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.yi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */