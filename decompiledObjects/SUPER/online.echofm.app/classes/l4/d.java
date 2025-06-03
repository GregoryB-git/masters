package l4;

import j4.f;
import j4.g;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class d
  implements k4.b
{
  public static final j4.d e = new a();
  public static final f f = new b();
  public static final f g = new c();
  public static final b h = new b(null);
  public final Map a = new HashMap();
  public final Map b = new HashMap();
  public j4.d c = e;
  public boolean d = false;
  
  public d()
  {
    p(String.class, f);
    p(Boolean.class, g);
    p(Date.class, h);
  }
  
  public j4.a i()
  {
    return new a();
  }
  
  public d j(k4.a parama)
  {
    parama.a(this);
    return this;
  }
  
  public d k(boolean paramBoolean)
  {
    d = paramBoolean;
    return this;
  }
  
  public d o(Class paramClass, j4.d paramd)
  {
    a.put(paramClass, paramd);
    b.remove(paramClass);
    return this;
  }
  
  public d p(Class paramClass, f paramf)
  {
    b.put(paramClass, paramf);
    a.remove(paramClass);
    return this;
  }
  
  public class a
    implements j4.a
  {
    public a() {}
    
    public String a(Object paramObject)
    {
      StringWriter localStringWriter = new StringWriter();
      try
      {
        b(paramObject, localStringWriter);
        return localStringWriter.toString();
      }
      catch (IOException paramObject)
      {
        for (;;) {}
      }
    }
    
    public void b(Object paramObject, Writer paramWriter)
    {
      paramWriter = new e(paramWriter, d.e(d.this), d.f(d.this), d.g(d.this), d.h(d.this));
      paramWriter.k(paramObject, false);
      paramWriter.u();
    }
  }
  
  public static final class b
    implements f
  {
    public static final DateFormat a;
    
    static
    {
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
      a = localSimpleDateFormat;
      localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
    
    public void b(Date paramDate, g paramg)
    {
      paramg.d(a.format(paramDate));
    }
  }
}

/* Location:
 * Qualified Name:     l4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */