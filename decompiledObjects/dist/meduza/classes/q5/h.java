package q5;

import java.util.regex.Pattern;
import v3.a1;
import v5.e0;
import v5.u;

public final class h
{
  public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");
  
  public static boolean a(u paramu)
  {
    paramu = paramu.g();
    boolean bool;
    if ((paramu != null) && (paramu.startsWith("WEBVTT"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static float b(String paramString)
  {
    if (paramString.endsWith("%")) {
      return Float.parseFloat(paramString.substring(0, paramString.length() - 1)) / 100.0F;
    }
    throw new NumberFormatException("Percentages must end with %");
  }
  
  public static long c(String paramString)
  {
    int i = e0.a;
    paramString = paramString.split("\\.", 2);
    i = 0;
    String[] arrayOfString = paramString[0].split(":", -1);
    int j = arrayOfString.length;
    long l1 = 0L;
    while (i < j)
    {
      l1 = l1 * 60L + Long.parseLong(arrayOfString[i]);
      i++;
    }
    long l2 = l1 * 1000L;
    l1 = l2;
    if (paramString.length == 2) {
      l1 = l2 + Long.parseLong(paramString[1]);
    }
    return l1 * 1000L;
  }
  
  public static void d(u paramu)
  {
    int i = b;
    if (a(paramu)) {
      return;
    }
    paramu.G(i);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Expected WEBVTT. Got ");
    localStringBuilder.append(paramu.g());
    throw a1.a(localStringBuilder.toString(), null);
  }
}

/* Location:
 * Qualified Name:     q5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */