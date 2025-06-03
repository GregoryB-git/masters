package com.google.ads.interactivemedia.v3.impl.data;

import a;
import com.google.ads.interactivemedia.v3.internal.agz;

@agz(a=k.class)
public abstract class CompanionData
{
  private String companionId;
  
  private static CompanionData create(String paramString1, String paramString2, String paramString3, a parama)
  {
    return new k(paramString1, paramString2, paramString3, parama);
  }
  
  public static CompanionData create(String paramString1, String paramString2, String paramString3, String paramString4, a parama)
  {
    paramString2 = create(paramString2, paramString3, paramString4, parama);
    companionId = paramString1;
    return paramString2;
  }
  
  public abstract String clickThroughUrl();
  
  public String companionId()
  {
    return companionId;
  }
  
  public abstract String size();
  
  public abstract String src();
  
  public String toString()
  {
    String str1 = companionId();
    Object localObject = size();
    String str2 = src();
    String str3 = clickThroughUrl();
    String str4 = String.valueOf(type());
    int i = a.b(str3, a.b(str2, a.b((String)localObject, a.b(str1, 66))));
    localObject = a.q(str4.length() + i, "CompanionData [companionId=", str1, ", size=", (String)localObject);
    a.C((StringBuilder)localObject, ", src=", str2, ", clickThroughUrl=", str3);
    return a.p((StringBuilder)localObject, ", type=", str4, "]");
  }
  
  public abstract a type();
  
  public static enum a
  {
    static
    {
      a locala1 = new a("Html", 0);
      Html = locala1;
      a locala2 = new a("Static", 1);
      Static = locala2;
      a locala3 = new a("IFrame", 2);
      IFrame = locala3;
      $VALUES = new a[] { locala1, locala2, locala3 };
    }
    
    private a() {}
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.CompanionData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */