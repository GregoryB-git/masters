package e7;

import java.util.HashMap;

public final class u5
{
  public static final String[] b = { "GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID" };
  public final HashMap a;
  
  public u5(HashMap paramHashMap)
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.putAll(paramHashMap);
  }
  
  public final String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String[] arrayOfString = b;
    for (int i = 0; i < 6; i++)
    {
      String str = arrayOfString[i];
      if (a.containsKey(str))
      {
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append(";");
        }
        localStringBuilder.append(str);
        localStringBuilder.append("=");
        localStringBuilder.append((String)a.get(str));
      }
    }
    return localStringBuilder.toString();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof u5)) {
      return false;
    }
    paramObject = (u5)paramObject;
    return a().equalsIgnoreCase(((u5)paramObject).a());
  }
  
  public final int hashCode()
  {
    return a().hashCode();
  }
  
  public final String toString()
  {
    return a();
  }
}

/* Location:
 * Qualified Name:     e7.u5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */