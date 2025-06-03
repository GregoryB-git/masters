package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
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

final class DashMediaSource$Iso8601Parser
  implements ParsingLoadable.Parser<Long>
{
  private static final Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");
  
  public Long parse(Uri paramUri, InputStream paramInputStream)
    throws IOException
  {
    paramInputStream = new BufferedReader(new InputStreamReader(paramInputStream, Charset.forName("UTF-8"))).readLine();
    try
    {
      paramUri = TIMESTAMP_WITH_TIMEZONE_PATTERN.matcher(paramInputStream);
      if (paramUri.matches())
      {
        localObject = paramUri.group(1);
        paramInputStream = new java/text/SimpleDateFormat;
        paramInputStream.<init>("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        paramInputStream.setTimeZone(TimeZone.getTimeZone("UTC"));
        long l1 = paramInputStream.parse((String)localObject).getTime();
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
      paramUri = new com/google/android/exoplayer2/ParserException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("Couldn't parse timestamp: ");
      ((StringBuilder)localObject).append(paramInputStream);
      paramUri.<init>(((StringBuilder)localObject).toString());
      throw paramUri;
    }
    catch (ParseException paramUri)
    {
      throw new ParserException(paramUri);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource.Iso8601Parser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */