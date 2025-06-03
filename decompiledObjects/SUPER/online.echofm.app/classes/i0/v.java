package i0;

import android.text.TextUtils;
import g0.a;
import g0.o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class v
{
  public static final Pattern a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
  public static final Pattern b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");
  
  public static String a(long paramLong1, long paramLong2)
  {
    if ((paramLong1 == 0L) && (paramLong2 == -1L)) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("bytes=");
    localStringBuilder.append(paramLong1);
    localStringBuilder.append("-");
    if (paramLong2 != -1L) {
      localStringBuilder.append(paramLong1 + paramLong2 - 1L);
    }
    return localStringBuilder.toString();
  }
  
  public static long b(String paramString1, String paramString2)
  {
    long l1;
    Object localObject;
    if (!TextUtils.isEmpty(paramString1)) {
      try
      {
        l1 = Long.parseLong(paramString1);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unexpected Content-Length [");
        ((StringBuilder)localObject).append(paramString1);
        ((StringBuilder)localObject).append("]");
        o.c("HttpUtil", ((StringBuilder)localObject).toString());
      }
    } else {
      l1 = -1L;
    }
    long l2 = l1;
    if (!TextUtils.isEmpty(paramString2))
    {
      localObject = a.matcher(paramString2);
      l2 = l1;
      if (((Matcher)localObject).matches()) {
        try
        {
          long l3 = Long.parseLong((String)a.e(((Matcher)localObject).group(2))) - Long.parseLong((String)a.e(((Matcher)localObject).group(1))) + 1L;
          if (l1 < 0L)
          {
            l2 = l3;
          }
          else
          {
            l2 = l1;
            if (l1 != l3)
            {
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>();
              ((StringBuilder)localObject).append("Inconsistent headers [");
              ((StringBuilder)localObject).append(paramString1);
              ((StringBuilder)localObject).append("] [");
              ((StringBuilder)localObject).append(paramString2);
              ((StringBuilder)localObject).append("]");
              o.h("HttpUtil", ((StringBuilder)localObject).toString());
              l2 = Math.max(l1, l3);
            }
          }
        }
        catch (NumberFormatException paramString1)
        {
          paramString1 = new StringBuilder();
          paramString1.append("Unexpected Content-Range [");
          paramString1.append(paramString2);
          paramString1.append("]");
          o.c("HttpUtil", paramString1.toString());
          l2 = l1;
        }
      }
    }
    return l2;
  }
  
  public static long c(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    long l = -1L;
    if (bool) {
      return -1L;
    }
    paramString = b.matcher(paramString);
    if (paramString.matches()) {
      l = Long.parseLong((String)a.e(paramString.group(1)));
    }
    return l;
  }
}

/* Location:
 * Qualified Name:     i0.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */