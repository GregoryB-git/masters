package com.yandex.metrica;

import java.util.HashMap;
import java.util.Map;

public class PreloadInfo$Builder
{
  private String a;
  private Map<String, String> b;
  
  private PreloadInfo$Builder(String paramString)
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

/* Location:
 * Qualified Name:     com.yandex.metrica.PreloadInfo.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */