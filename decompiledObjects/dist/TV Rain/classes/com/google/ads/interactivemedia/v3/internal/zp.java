package com.google.ads.interactivemedia.v3.internal;

public final class zp
{
  private static final int a;
  
  static
  {
    String str = System.getProperty("java.version");
    int i = a(str);
    int j = i;
    if (i == -1) {
      j = b(str);
    }
    i = j;
    if (j == -1) {
      i = 6;
    }
    a = i;
  }
  
  public static int a()
  {
    return a;
  }
  
  private static int a(String paramString)
  {
    try
    {
      paramString = paramString.split("[._]");
      int i = Integer.parseInt(paramString[0]);
      if ((i == 1) && (paramString.length > 1))
      {
        i = Integer.parseInt(paramString[1]);
        return i;
      }
      return i;
    }
    catch (NumberFormatException paramString) {}
    return -1;
  }
  
  private static int b(String paramString)
  {
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      for (int i = 0; i < paramString.length(); i++)
      {
        char c = paramString.charAt(i);
        if (!Character.isDigit(c)) {
          break;
        }
        localStringBuilder.append(c);
      }
      i = Integer.parseInt(localStringBuilder.toString());
      return i;
    }
    catch (NumberFormatException paramString) {}
    return -1;
  }
  
  public static boolean b()
  {
    return a >= 9;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.zp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */