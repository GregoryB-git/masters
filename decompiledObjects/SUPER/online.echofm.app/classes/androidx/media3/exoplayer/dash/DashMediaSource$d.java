package androidx.media3.exoplayer.dash;

import B0.p.a;
import W2.e;
import android.net.Uri;
import android.text.TextUtils;
import d0.A;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DashMediaSource$d
  implements p.a
{
  public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");
  
  public Long b(Uri paramUri, InputStream paramInputStream)
  {
    paramInputStream = new BufferedReader(new InputStreamReader(paramInputStream, e.c)).readLine();
    try
    {
      paramUri = a.matcher(paramInputStream);
      if (paramUri.matches())
      {
        paramInputStream = paramUri.group(1);
        SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
        localSimpleDateFormat.<init>("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        long l1 = localSimpleDateFormat.parse(paramInputStream).getTime();
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
          l2 = l1 - l2 * ((l3 * 60L + l4) * 60000L);
        }
        return Long.valueOf(l2);
      }
    }
    catch (ParseException paramUri)
    {
      break label216;
      paramUri = new java/lang/StringBuilder;
      paramUri.<init>();
      paramUri.append("Couldn't parse timestamp: ");
      paramUri.append(paramInputStream);
      throw A.c(paramUri.toString(), null);
      label216:
      throw A.c(null, paramUri);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media3.exoplayer.dash.DashMediaSource.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */