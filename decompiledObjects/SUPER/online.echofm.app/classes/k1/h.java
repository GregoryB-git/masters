package k1;

import d0.A;
import g0.M;
import g0.z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class h
{
  public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");
  
  public static Matcher a(z paramz)
  {
    Object localObject;
    do
    {
      localObject = paramz.r();
      if (localObject == null) {
        break;
      }
      if (a.matcher((CharSequence)localObject).matches()) {
        for (;;)
        {
          localObject = paramz.r();
          if ((localObject == null) || (((String)localObject).isEmpty())) {
            break;
          }
        }
      }
      localObject = e.a.matcher((CharSequence)localObject);
    } while (!((Matcher)localObject).matches());
    return (Matcher)localObject;
    return null;
  }
  
  public static boolean b(z paramz)
  {
    paramz = paramz.r();
    boolean bool;
    if ((paramz != null) && (paramz.startsWith("WEBVTT"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static float c(String paramString)
  {
    if (paramString.endsWith("%")) {
      return Float.parseFloat(paramString.substring(0, paramString.length() - 1)) / 100.0F;
    }
    throw new NumberFormatException("Percentages must end with %");
  }
  
  public static long d(String paramString)
  {
    String[] arrayOfString = M.c1(paramString, "\\.");
    int i = 0;
    paramString = M.b1(arrayOfString[0], ":");
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
  
  public static void e(z paramz)
  {
    int i = paramz.f();
    if (b(paramz)) {
      return;
    }
    paramz.T(i);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Expected WEBVTT. Got ");
    localStringBuilder.append(paramz.r());
    throw A.a(localStringBuilder.toString(), null);
  }
}

/* Location:
 * Qualified Name:     k1.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */