package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n7.d;
import t5.f0.a;
import t5.m;
import v3.a1;

public final class DashMediaSource$d
  implements f0.a<Long>
{
  public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");
  
  public final Object a(Uri paramUri, m paramm)
  {
    paramm = new BufferedReader(new InputStreamReader(paramm, d.c)).readLine();
    try
    {
      paramUri = a.matcher(paramm);
      if (paramUri.matches())
      {
        String str = paramUri.group(1);
        paramm = new java/text/SimpleDateFormat;
        paramm.<init>("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        paramm.setTimeZone(TimeZone.getTimeZone("UTC"));
        long l1 = paramm.parse(str).getTime();
        long l2;
        if ("Z".equals(paramUri.group(2)))
        {
          l2 = l1;
        }
        else
        {
          if ("+".equals(paramUri.group(4))) {
            l2 = 1L;
          } else {
            l2 = -1L;
          }
          long l3 = Long.parseLong(paramUri.group(5));
          paramUri = paramUri.group(7);
          long l4;
          if (TextUtils.isEmpty(paramUri)) {
            l4 = 0L;
          } else {
            l4 = Long.parseLong(paramUri);
          }
          l2 = l1 - (l3 * 60L + l4) * 60L * 1000L * l2;
        }
        return Long.valueOf(l2);
      }
      paramUri = new java/lang/StringBuilder;
      paramUri.<init>();
      paramUri.append("Couldn't parse timestamp: ");
      paramUri.append(paramm);
      throw a1.b(paramUri.toString(), null);
    }
    catch (ParseException paramUri)
    {
      throw a1.b(null, paramUri);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */