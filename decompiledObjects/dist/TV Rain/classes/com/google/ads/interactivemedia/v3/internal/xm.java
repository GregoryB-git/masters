package com.google.ads.interactivemedia.v3.internal;

public enum xm
  implements xr
{
  static
  {
    xl localxl = new xl("IDENTITY", 0);
    a = localxl;
    xo localxo = new xo("UPPER_CAMEL_CASE", 1);
    b = localxo;
    xn localxn = new xn("UPPER_CAMEL_CASE_WITH_SPACES", 2);
    c = localxn;
    xq localxq = new xq("LOWER_CASE_WITH_UNDERSCORES", 3);
    d = localxq;
    xp localxp = new xp("LOWER_CASE_WITH_DASHES", 4);
    e = localxp;
    xs localxs = new xs("LOWER_CASE_WITH_DOTS", 5);
    f = localxs;
    g = new xm[] { localxl, localxo, localxn, localxq, localxp, localxs };
  }
  
  private xm() {}
  
  public static String a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    char c1 = paramString.charAt(0);
    int j = paramString.length();
    for (char c2 = c1; (i < j - 1) && (!Character.isLetter(c2)); c2 = c1)
    {
      localStringBuilder.append(c2);
      i++;
      c1 = paramString.charAt(i);
    }
    Object localObject = paramString;
    if (!Character.isUpperCase(c2))
    {
      c2 = Character.toUpperCase(c2);
      i++;
      if (i < paramString.length())
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(c2);
        ((StringBuilder)localObject).append(paramString.substring(i));
        paramString = ((StringBuilder)localObject).toString();
      }
      else
      {
        paramString = String.valueOf(c2);
      }
      localStringBuilder.append(paramString);
      localObject = localStringBuilder.toString();
    }
    return (String)localObject;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramString1.length();
    for (int j = 0; j < i; j++)
    {
      char c1 = paramString1.charAt(j);
      if ((Character.isUpperCase(c1)) && (localStringBuilder.length() != 0)) {
        localStringBuilder.append(paramString2);
      }
      localStringBuilder.append(c1);
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.xm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */