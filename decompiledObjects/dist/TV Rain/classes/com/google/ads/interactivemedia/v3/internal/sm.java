package com.google.ads.interactivemedia.v3.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class sm
{
  private static final Pattern a = Pattern.compile("^NOTE(( |\t).*)?$");
  
  public static long a(String paramString)
    throws NumberFormatException
  {
    String[] arrayOfString = wl.b(paramString, "\\.");
    int i = 0;
    paramString = wl.a(arrayOfString[0], ":");
    int j = paramString.length;
    long l1 = 0L;
    while (i < j)
    {
      l1 = l1 * 60L + Long.parseLong(paramString[i]);
      i++;
    }
    long l2 = l1 * 1000L;
    l1 = l2;
    if (arrayOfString.length == 2) {
      l1 = l2 + Long.parseLong(arrayOfString[1]);
    }
    return l1 * 1000L;
  }
  
  public static void a(vy paramvy)
    throws ce
  {
    int i = paramvy.d();
    if (!b(paramvy))
    {
      paramvy.c(i);
      paramvy = String.valueOf(paramvy.s());
      if (paramvy.length() != 0) {
        paramvy = "Expected WEBVTT. Got ".concat(paramvy);
      } else {
        paramvy = new String("Expected WEBVTT. Got ");
      }
      throw new ce(paramvy);
    }
  }
  
  public static boolean b(vy paramvy)
  {
    paramvy = paramvy.s();
    return (paramvy != null) && (paramvy.startsWith("WEBVTT"));
  }
  
  public static Matcher c(vy paramvy)
  {
    Object localObject;
    do
    {
      localObject = paramvy.s();
      if (localObject == null) {
        break;
      }
      if (a.matcher((CharSequence)localObject).matches()) {
        for (;;)
        {
          localObject = paramvy.s();
          if ((localObject == null) || (((String)localObject).isEmpty())) {
            break;
          }
        }
      }
      localObject = sj.a.matcher((CharSequence)localObject);
    } while (!((Matcher)localObject).matches());
    return (Matcher)localObject;
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.sm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */