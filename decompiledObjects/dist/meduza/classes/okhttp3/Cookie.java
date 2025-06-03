package okhttp3;

import a0.j;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpDate;

public final class Cookie
{
  public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
  public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
  public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
  public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
  public final String a;
  public final String b;
  public final long c;
  public final String d;
  public final String e;
  public final boolean f;
  public final boolean g;
  public final boolean h;
  public final boolean i;
  
  public Cookie(String paramString1, String paramString2, long paramLong, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    a = paramString1;
    b = paramString2;
    c = paramLong;
    d = paramString3;
    e = paramString4;
    f = paramBoolean1;
    g = paramBoolean2;
    i = paramBoolean3;
    h = paramBoolean4;
  }
  
  public static int a(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    while (paramInt1 < paramInt2)
    {
      int n = paramString.charAt(paramInt1);
      if (((n >= 32) || (n == 9)) && (n < 127) && ((n < 48) || (n > 57)) && ((n < 97) || (n > 122)) && ((n < 65) || (n > 90)) && (n != 58)) {
        n = 0;
      } else {
        n = 1;
      }
      if (n == (paramBoolean ^ true)) {
        return paramInt1;
      }
      paramInt1++;
    }
    return paramInt2;
  }
  
  public static long b(int paramInt, String paramString)
  {
    int n = a(0, paramInt, paramString, false);
    Matcher localMatcher = m.matcher(paramString);
    int i1 = -1;
    int i2 = i1;
    int i3 = i2;
    int i4 = i3;
    int i5 = i4;
    int i6 = i5;
    int i7 = i2;
    i2 = i1;
    while (n < paramInt)
    {
      int i8 = a(n + 1, paramInt, paramString, true);
      localMatcher.region(n, i8);
      int i9;
      int i10;
      int i11;
      int i12;
      int i13;
      if ((i7 == -1) && (localMatcher.usePattern(m).matches()))
      {
        i9 = Integer.parseInt(localMatcher.group(1));
        i10 = Integer.parseInt(localMatcher.group(2));
        i11 = Integer.parseInt(localMatcher.group(3));
        i1 = i2;
        i12 = i3;
        i13 = i4;
      }
      else if ((i3 == -1) && (localMatcher.usePattern(l).matches()))
      {
        i12 = Integer.parseInt(localMatcher.group(1));
        i1 = i2;
        i9 = i7;
        i13 = i4;
        i10 = i5;
        i11 = i6;
      }
      else
      {
        if (i4 == -1)
        {
          Pattern localPattern = k;
          if (localMatcher.usePattern(localPattern).matches())
          {
            String str = localMatcher.group(1).toLowerCase(Locale.US);
            i13 = localPattern.pattern().indexOf(str) / 4;
            i1 = i2;
            i9 = i7;
            i12 = i3;
            i10 = i5;
            i11 = i6;
            break label357;
          }
        }
        i1 = i2;
        i9 = i7;
        i12 = i3;
        i13 = i4;
        i10 = i5;
        i11 = i6;
        if (i2 == -1)
        {
          i1 = i2;
          i9 = i7;
          i12 = i3;
          i13 = i4;
          i10 = i5;
          i11 = i6;
          if (localMatcher.usePattern(j).matches())
          {
            i1 = Integer.parseInt(localMatcher.group(1));
            i11 = i6;
            i10 = i5;
            i13 = i4;
            i12 = i3;
            i9 = i7;
          }
        }
      }
      label357:
      n = a(i8 + 1, paramInt, paramString, false);
      i2 = i1;
      i7 = i9;
      i3 = i12;
      i4 = i13;
      i5 = i10;
      i6 = i11;
    }
    paramInt = i2;
    if (i2 >= 70)
    {
      paramInt = i2;
      if (i2 <= 99) {
        paramInt = i2 + 1900;
      }
    }
    i2 = paramInt;
    if (paramInt >= 0)
    {
      i2 = paramInt;
      if (paramInt <= 69) {
        i2 = paramInt + 2000;
      }
    }
    if (i2 >= 1601)
    {
      if (i4 != -1)
      {
        if ((i3 >= 1) && (i3 <= 31))
        {
          if ((i7 >= 0) && (i7 <= 23))
          {
            if ((i5 >= 0) && (i5 <= 59))
            {
              if ((i6 >= 0) && (i6 <= 59))
              {
                paramString = new GregorianCalendar(Util.n);
                paramString.setLenient(false);
                paramString.set(1, i2);
                paramString.set(2, i4 - 1);
                paramString.set(5, i3);
                paramString.set(11, i7);
                paramString.set(12, i5);
                paramString.set(13, i6);
                paramString.set(14, 0);
                return paramString.getTimeInMillis();
              }
              throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
          }
          throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
      }
      throw new IllegalArgumentException();
    }
    throw new IllegalArgumentException();
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Cookie;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (Cookie)paramObject;
    bool1 = bool2;
    if (a.equals(a))
    {
      bool1 = bool2;
      if (b.equals(b))
      {
        bool1 = bool2;
        if (d.equals(d))
        {
          bool1 = bool2;
          if (e.equals(e))
          {
            bool1 = bool2;
            if (c == c)
            {
              bool1 = bool2;
              if (f == f)
              {
                bool1 = bool2;
                if (g == g)
                {
                  bool1 = bool2;
                  if (h == h)
                  {
                    bool1 = bool2;
                    if (i == i) {
                      bool1 = true;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    int n = j.e(a, 527, 31);
    n = j.e(b, n, 31);
    n = j.e(d, n, 31);
    n = j.e(e, n, 31);
    long l1 = c;
    return ((((n + (int)(l1 ^ l1 >>> 32)) * 31 + (f ^ true)) * 31 + (g ^ true)) * 31 + (h ^ true)) * 31 + (i ^ true);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append('=');
    localStringBuilder.append(b);
    if (h)
    {
      Object localObject;
      if (c == Long.MIN_VALUE)
      {
        localObject = "; max-age=0";
      }
      else
      {
        localStringBuilder.append("; expires=");
        localObject = new Date(c);
        localObject = ((DateFormat)HttpDate.a.get()).format((Date)localObject);
      }
      localStringBuilder.append((String)localObject);
    }
    if (!i)
    {
      localStringBuilder.append("; domain=");
      localStringBuilder.append(d);
    }
    localStringBuilder.append("; path=");
    localStringBuilder.append(e);
    if (f) {
      localStringBuilder.append("; secure");
    }
    if (g) {
      localStringBuilder.append("; httponly");
    }
    return localStringBuilder.toString();
  }
  
  public static final class Builder {}
}

/* Location:
 * Qualified Name:     okhttp3.Cookie
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */