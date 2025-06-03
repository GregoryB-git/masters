package com.yandex.metrica;

import com.yandex.metrica.impl.ob.A2;
import java.util.HashMap;
import java.util.Map;

public class PreloadInfo
{
  private String a;
  private Map<String, String> b;
  
  private PreloadInfo(Builder paramBuilder)
  {
    a = Builder.a(paramBuilder);
    b = A2.d(Builder.b(paramBuilder));
  }
  
  public static Builder newBuilder(String paramString)
  {
    return new Builder(paramString, null);
  }
  
  public Map<String, String> getAdditionalParams()
  {
    return b;
  }
  
  public String getTrackingId()
  {
    return a;
  }
  
  public static class Builder
  {
    private String a;
    private Map<String, String> b;
    
    private Builder(String paramString)
    {
      a = paramString;
      b = new HashMap();
    }
    
    public PreloadInfo build()
    {
      return new PreloadInfo(this, null);
    }
    
    public Builder setAdditionalParams(String paramString1, String paramString2)
    {
      if ((paramString1 != null) && (paramString2 != null)) {
        b.put(paramString1, paramString2);
      }
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.PreloadInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */