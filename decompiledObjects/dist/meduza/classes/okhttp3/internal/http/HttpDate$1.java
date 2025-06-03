package okhttp3.internal.http;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import okhttp3.internal.Util;

class HttpDate$1
  extends ThreadLocal<DateFormat>
{
  public final Object initialValue()
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
    localSimpleDateFormat.setLenient(false);
    localSimpleDateFormat.setTimeZone(Util.n);
    return localSimpleDateFormat;
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http.HttpDate.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */