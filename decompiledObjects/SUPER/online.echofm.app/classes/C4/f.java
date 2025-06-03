package C4;

import A4.a;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class f
  extends v
{
  public static f a;
  public static final Map b = Collections.unmodifiableMap(new a());
  
  public static f e()
  {
    try
    {
      if (a == null)
      {
        f localf1 = new C4/f;
        localf1.<init>();
        a = localf1;
      }
    }
    finally
    {
      break label37;
    }
    f localf2 = a;
    return localf2;
    label37:
    throw localf2;
  }
  
  public static String f(long paramLong)
  {
    return (String)b.get(Long.valueOf(paramLong));
  }
  
  public static boolean g(long paramLong)
  {
    return b.containsKey(Long.valueOf(paramLong));
  }
  
  public String a()
  {
    return "com.google.firebase.perf.LogSourceName";
  }
  
  public String c()
  {
    return "fpr_log_source";
  }
  
  public String d()
  {
    return a.c;
  }
  
  public class a
    extends HashMap
  {
    public a()
    {
      put(Long.valueOf(461L), "FIREPERF_AUTOPUSH");
      put(Long.valueOf(462L), "FIREPERF");
      put(Long.valueOf(675L), "FIREPERF_INTERNAL_LOW");
      put(Long.valueOf(676L), "FIREPERF_INTERNAL_HIGH");
    }
  }
}

/* Location:
 * Qualified Name:     C4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */