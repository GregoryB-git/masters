package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class pj
  implements uy<Long>
{
  private static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");
  
  private static Long a(InputStream paramInputStream)
    throws IOException
  {
    String str = new BufferedReader(new InputStreamReader(paramInputStream, Charset.forName("UTF-8"))).readLine();
    try
    {
      paramInputStream = a.matcher(str);
      if (!paramInputStream.matches())
      {
        localObject = new com/google/ads/interactivemedia/v3/internal/ce;
        paramInputStream = String.valueOf(str);
        if (paramInputStream.length() != 0) {
          paramInputStream = "Couldn't parse timestamp: ".concat(paramInputStream);
        } else {
          paramInputStream = new String("Couldn't parse timestamp: ");
        }
        ((ce)localObject).<init>(paramInputStream);
        throw ((Throwable)localObject);
      }
      str = paramInputStream.group(1);
      Object localObject = new java/text/SimpleDateFormat;
      ((SimpleDateFormat)localObject).<init>("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
      ((DateFormat)localObject).setTimeZone(TimeZone.getTimeZone("UTC"));
      long l1 = ((DateFormat)localObject).parse(str).getTime();
      long l2 = l1;
      if (!"Z".equals(paramInputStream.group(2)))
      {
        if ("+".equals(paramInputStream.group(4))) {
          l2 = 1L;
        } else {
          l2 = -1L;
        }
        long l3 = Long.parseLong(paramInputStream.group(5));
        paramInputStream = paramInputStream.group(7);
        long l4;
        if (TextUtils.isEmpty(paramInputStream)) {
          l4 = 0L;
        } else {
          l4 = Long.parseLong(paramInputStream);
        }
        l2 = l1 - (l3 * 60L + l4) * 60L * 1000L * l2;
      }
      return Long.valueOf(l2);
    }
    catch (ParseException paramInputStream)
    {
      throw new ce(paramInputStream);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.pj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */