package com.google.ads.interactivemedia.v3.impl.data;

import a;
import com.google.ads.interactivemedia.v3.api.UniversalAdId;
import com.google.ads.interactivemedia.v3.internal.aje;
import com.google.ads.interactivemedia.v3.internal.ajg;

public final class am
  implements UniversalAdId
{
  private String adIdRegistry = "unknown";
  private String adIdValue = "unknown";
  
  public final boolean equals(Object paramObject)
  {
    return aje.a(this, paramObject, new String[0]);
  }
  
  public final String getAdIdRegistry()
  {
    return adIdRegistry;
  }
  
  public final String getAdIdValue()
  {
    return adIdValue;
  }
  
  public final int hashCode()
  {
    return ajg.a(this, new String[0]);
  }
  
  public final void setAdIdRegistry(String paramString)
  {
    adIdRegistry = paramString;
  }
  
  public final void setAdIdValue(String paramString)
  {
    adIdValue = paramString;
  }
  
  public final String toString()
  {
    Object localObject = adIdValue;
    String str = adIdRegistry;
    localObject = a.q(a.b(str, a.b((String)localObject, 41)), "UniversalAdId [adIdValue=", (String)localObject, ", adIdRegistry=", str);
    ((StringBuilder)localObject).append("]");
    return ((StringBuilder)localObject).toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.am
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */