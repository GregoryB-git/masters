package gb;

import g;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class n1
{
  public static final long a = TimeUnit.SECONDS.toNanos(1L);
  
  public static void a(List paramList)
  {
    int i = 0;
    while (i < paramList.size()) {
      if ((paramList.get(i) instanceof Map)) {
        i++;
      } else {
        throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", new Object[] { paramList.get(i), Integer.valueOf(i), paramList }));
      }
    }
  }
  
  public static Boolean b(String paramString, Map paramMap)
  {
    if (!paramMap.containsKey(paramString)) {
      return null;
    }
    Object localObject = paramMap.get(paramString);
    if ((localObject instanceof Boolean)) {
      return (Boolean)localObject;
    }
    throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", new Object[] { localObject, paramString, paramMap }));
  }
  
  public static List c(String paramString, Map paramMap)
  {
    if (!paramMap.containsKey(paramString)) {
      return null;
    }
    Object localObject = paramMap.get(paramString);
    if ((localObject instanceof List)) {
      return (List)localObject;
    }
    throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", new Object[] { localObject, paramString, paramMap }));
  }
  
  public static List d(String paramString, Map paramMap)
  {
    paramString = c(paramString, paramMap);
    if (paramString == null) {
      return null;
    }
    int i = 0;
    while (i < paramString.size()) {
      if ((paramString.get(i) instanceof String)) {
        i++;
      } else {
        throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", new Object[] { paramString.get(i), Integer.valueOf(i), paramString }));
      }
    }
    return paramString;
  }
  
  public static Double e(String paramString, Map paramMap)
  {
    if (!paramMap.containsKey(paramString)) {
      return null;
    }
    Object localObject = paramMap.get(paramString);
    if ((localObject instanceof Double)) {
      return (Double)localObject;
    }
    if ((localObject instanceof String)) {
      try
      {
        double d = Double.parseDouble((String)localObject);
        return Double.valueOf(d);
      }
      catch (NumberFormatException paramMap)
      {
        throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", new Object[] { localObject, paramString }));
      }
    }
    throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", new Object[] { localObject, paramString, paramMap }));
  }
  
  public static Integer f(String paramString, Map paramMap)
  {
    if (!paramMap.containsKey(paramString)) {
      return null;
    }
    Object localObject = paramMap.get(paramString);
    int i;
    if ((localObject instanceof Double))
    {
      paramMap = (Double)localObject;
      i = paramMap.intValue();
      if (i == paramMap.doubleValue()) {
        return Integer.valueOf(i);
      }
      paramString = new StringBuilder();
      paramString.append("Number expected to be integer: ");
      paramString.append(paramMap);
      throw new ClassCastException(paramString.toString());
    }
    if ((localObject instanceof String)) {
      try
      {
        i = Integer.parseInt((String)localObject);
        return Integer.valueOf(i);
      }
      catch (NumberFormatException paramMap)
      {
        throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", new Object[] { localObject, paramString }));
      }
    }
    throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", new Object[] { localObject, paramString }));
  }
  
  public static Map g(String paramString, Map paramMap)
  {
    if (!paramMap.containsKey(paramString)) {
      return null;
    }
    Object localObject = paramMap.get(paramString);
    if ((localObject instanceof Map)) {
      return (Map)localObject;
    }
    throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", new Object[] { localObject, paramString, paramMap }));
  }
  
  public static String h(String paramString, Map paramMap)
  {
    if (!paramMap.containsKey(paramString)) {
      return null;
    }
    Object localObject = paramMap.get(paramString);
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", new Object[] { localObject, paramString, paramMap }));
  }
  
  public static Long i(String paramString, Map paramMap)
  {
    paramString = h(paramString, paramMap);
    if (paramString == null) {
      return null;
    }
    try
    {
      long l = k(paramString);
      return Long.valueOf(l);
    }
    catch (ParseException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  public static long j(int paramInt, long paramLong)
  {
    long l1 = paramInt;
    long l2 = a;
    long l3 = -l2;
    int i = 0;
    long l4;
    if ((l1 > l3) && (l1 < l2))
    {
      j = paramInt;
      l3 = paramLong;
    }
    else
    {
      l4 = l1 / l2;
      l3 = paramLong + l4;
      if ((paramLong ^ l4) < 0L) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if ((paramLong ^ l3) >= 0L) {
        j = 1;
      } else {
        j = 0;
      }
      if ((paramInt | j) == 0) {
        break label364;
      }
      j = (int)(l1 % l2);
    }
    paramInt = j;
    paramLong = l3;
    if (l3 > 0L)
    {
      paramInt = j;
      paramLong = l3;
      if (j < 0)
      {
        paramInt = (int)(j + l2);
        paramLong = l3 - 1L;
      }
    }
    int j = paramInt;
    l3 = paramLong;
    if (paramLong < 0L)
    {
      j = paramInt;
      l3 = paramLong;
      if (paramInt > 0)
      {
        j = (int)(paramInt - l2);
        l3 = paramLong + 1L;
      }
    }
    if ((l3 >= -315576000000L) && (l3 <= 315576000000L))
    {
      paramLong = j;
      if ((paramLong >= -999999999L) && (paramLong < l2))
      {
        paramInt = l3 < 0L;
        if (((paramInt >= 0) && (j >= 0)) || ((paramInt <= 0) && (j <= 0)))
        {
          paramInt = 1;
          break label250;
        }
      }
    }
    paramInt = 0;
    label250:
    if (paramInt != 0)
    {
      l3 = TimeUnit.SECONDS.toNanos(l3);
      l2 = j;
      paramLong = l3 + l2;
      if ((l2 ^ l3) < 0L) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      j = i;
      if ((l3 ^ paramLong) >= 0L) {
        j = 1;
      }
      if ((paramInt | j) == 0) {
        paramLong = (1L ^ paramLong >>> 63) + Long.MAX_VALUE;
      }
      return paramLong;
    }
    throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", new Object[] { Long.valueOf(l3), Integer.valueOf(j) }));
    label364:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("overflow: ");
    localStringBuilder.append("checkedAdd");
    localStringBuilder.append("(");
    localStringBuilder.append(paramLong);
    localStringBuilder.append(", ");
    localStringBuilder.append(l4);
    localStringBuilder.append(")");
    throw new ArithmeticException(localStringBuilder.toString());
  }
  
  public static long k(String paramString)
  {
    if ((!paramString.isEmpty()) && (paramString.charAt(paramString.length() - 1) == 's'))
    {
      int i;
      if (paramString.charAt(0) == '-')
      {
        paramString = paramString.substring(1);
        i = 1;
      }
      else
      {
        i = 0;
      }
      String str1 = paramString.substring(0, paramString.length() - 1);
      int j = str1.indexOf('.');
      String str2;
      if (j != -1)
      {
        str2 = str1.substring(j + 1);
        str1 = str1.substring(0, j);
      }
      else
      {
        str2 = "";
      }
      long l1 = Long.parseLong(str1);
      int m;
      if (str2.isEmpty())
      {
        j = 0;
      }
      else
      {
        int k = 0;
        for (m = k;; m = j)
        {
          j = m;
          if (k >= 9) {
            break;
          }
          m *= 10;
          j = m;
          if (k < str2.length()) {
            if ((str2.charAt(k) >= '0') && (str2.charAt(k) <= '9')) {
              j = str2.charAt(k) - '0' + m;
            } else {
              throw new ParseException("Invalid nanoseconds.", 0);
            }
          }
          k++;
        }
      }
      if (l1 >= 0L)
      {
        long l2 = l1;
        m = j;
        if (i != 0)
        {
          l2 = -l1;
          m = -j;
        }
        try
        {
          l2 = j(m, l2);
          return l2;
        }
        catch (IllegalArgumentException paramString)
        {
          throw new ParseException("Duration value is out of range.", 0);
        }
      }
      throw new ParseException(g.d("Invalid duration string: ", paramString), 0);
    }
    throw new ParseException(g.d("Invalid duration string: ", paramString), 0);
  }
}

/* Location:
 * Qualified Name:     gb.n1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */