package s4;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u4.d;
import w4.a;
import w4.b;

public final class q
{
  public static final long b = TimeUnit.HOURS.toSeconds(1L);
  public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
  public static q d;
  public final a a;
  
  public q(a parama)
  {
    a = parama;
  }
  
  public static q c()
  {
    return d(b.b());
  }
  
  public static q d(a parama)
  {
    if (d == null) {
      d = new q(parama);
    }
    return d;
  }
  
  public static boolean g(String paramString)
  {
    return c.matcher(paramString).matches();
  }
  
  public static boolean h(String paramString)
  {
    return paramString.contains(":");
  }
  
  public long a()
  {
    return a.a();
  }
  
  public long b()
  {
    return TimeUnit.MILLISECONDS.toSeconds(a());
  }
  
  public long e()
  {
    return (Math.random() * 1000.0D);
  }
  
  public boolean f(d paramd)
  {
    if (TextUtils.isEmpty(paramd.b())) {
      return true;
    }
    return paramd.h() + paramd.c() < b() + b;
  }
}

/* Location:
 * Qualified Name:     s4.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */