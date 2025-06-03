package a9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import y8.d;
import y8.f;
import y8.g;

public final class e
  implements z8.a<e>
{
  public static final a e = new a(0);
  public static final b f = new b();
  public static final c g = new c();
  public static final a h = new a();
  public final HashMap a;
  public final HashMap b;
  public a c;
  public boolean d;
  
  public e()
  {
    HashMap localHashMap1 = new HashMap();
    a = localHashMap1;
    HashMap localHashMap2 = new HashMap();
    b = localHashMap2;
    c = e;
    d = false;
    localHashMap2.put(String.class, f);
    localHashMap1.remove(String.class);
    localHashMap2.put(Boolean.class, g);
    localHashMap1.remove(Boolean.class);
    localHashMap2.put(Date.class, h);
    localHashMap1.remove(Date.class);
  }
  
  public final z8.a a(Class paramClass, d paramd)
  {
    a.put(paramClass, paramd);
    b.remove(paramClass);
    return this;
  }
  
  public static final class a
    implements f<Date>
  {
    public static final SimpleDateFormat a;
    
    static
    {
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
      a = localSimpleDateFormat;
      localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
    
    public final void a(Object paramObject1, Object paramObject2)
    {
      paramObject1 = (Date)paramObject1;
      ((g)paramObject2).f(a.format((Date)paramObject1));
    }
  }
}

/* Location:
 * Qualified Name:     a9.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */