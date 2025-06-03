package com.google.ads.interactivemedia.v3.impl.data;

import a;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.ahf;
import com.google.ads.interactivemedia.v3.internal.yn;
import z2;

public final class al
  implements UiElement
{
  public static final yn<al> GSON_TYPE_ADAPTER = new an();
  private final String name;
  
  public al(String paramString)
  {
    name = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof al)) {
      return false;
    }
    paramObject = (al)paramObject;
    return name.equals(name);
  }
  
  public final String getName()
  {
    return name;
  }
  
  public final int hashCode()
  {
    return ahf.a(new Object[] { name });
  }
  
  public final String toString()
  {
    String str = name;
    return z2.l(a.b(str, 20), "UiElementImpl[name=", str, "]");
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.al
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */