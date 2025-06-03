package k3;

import java.util.HashMap;
import java.util.Map;

public abstract class n
{
  public final String a(String paramString)
  {
    String str = (String)b().get(paramString);
    paramString = str;
    if (str == null) {
      paramString = "";
    }
    return paramString;
  }
  
  public abstract Map<String, String> b();
  
  public abstract Integer c();
  
  public abstract m d();
  
  public abstract long e();
  
  public abstract byte[] f();
  
  public abstract byte[] g();
  
  public final int h(String paramString)
  {
    paramString = (String)b().get(paramString);
    int i;
    if (paramString == null) {
      i = 0;
    } else {
      i = Integer.valueOf(paramString).intValue();
    }
    return i;
  }
  
  public abstract Integer i();
  
  public abstract String j();
  
  public abstract String k();
  
  public abstract long l();
  
  public final h.a m()
  {
    h.a locala = new h.a();
    locala.d(k());
    b = c();
    g = i();
    h = j();
    i = f();
    j = g();
    locala.c(d());
    d = Long.valueOf(e());
    e = Long.valueOf(l());
    f = new HashMap(b());
    return locala;
  }
  
  public static abstract class a
  {
    public final void a(String paramString1, String paramString2)
    {
      Map localMap = f;
      if (localMap != null)
      {
        localMap.put(paramString1, paramString2);
        return;
      }
      throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }
  }
}

/* Location:
 * Qualified Name:     k3.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */