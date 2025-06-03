package com.google.ads.interactivemedia.v3.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ga
{
  private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
  public int a = -1;
  public int b = -1;
  
  private final boolean a(String paramString)
  {
    paramString = c.matcher(paramString);
    if (paramString.find()) {}
    try
    {
      int i = Integer.parseInt(paramString.group(1), 16);
      int j = Integer.parseInt(paramString.group(2), 16);
      if ((i > 0) || (j > 0))
      {
        a = i;
        b = j;
        return true;
      }
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    return false;
  }
  
  public final boolean a()
  {
    return (a != -1) && (b != -1);
  }
  
  public final boolean a(kd paramkd)
  {
    for (int i = 0; i < paramkd.a(); i++)
    {
      Object localObject = paramkd.a(i);
      if ((localObject instanceof kv))
      {
        localObject = (kv)localObject;
        if (("iTunSMPB".equals(a)) && (a(b))) {
          return true;
        }
      }
      else if ((localObject instanceof ld))
      {
        localObject = (ld)localObject;
        if (("com.apple.iTunes".equals(a)) && ("iTunSMPB".equals(b)) && (a(d))) {
          return true;
        }
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ga
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */