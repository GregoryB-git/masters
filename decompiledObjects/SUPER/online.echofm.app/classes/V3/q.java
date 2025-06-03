package V3;

import Q3.h;
import java.util.HashMap;
import java.util.Map;

public class q
{
  public static final q b = new q();
  public final Map a = new HashMap();
  
  public static m b(f paramf, p paramp, h paramh)
  {
    return b.a(paramf, paramp, paramh);
  }
  
  public static void c(m paramm)
  {
    paramm.i0(new a());
  }
  
  public static void d(m paramm)
  {
    paramm.i0(new b());
  }
  
  public final m a(f paramf, p paramp, h paramh)
  {
    paramf.k();
    ??? = new StringBuilder();
    ((StringBuilder)???).append("https://");
    ((StringBuilder)???).append(a);
    ((StringBuilder)???).append("/");
    ((StringBuilder)???).append(c);
    String str = ((StringBuilder)???).toString();
    synchronized (a)
    {
      if (!a.containsKey(paramf))
      {
        localObject2 = new java/util/HashMap;
        ((HashMap)localObject2).<init>();
        a.put(paramf, localObject2);
      }
    }
    Object localObject2 = (Map)a.get(paramf);
    if (!((Map)localObject2).containsKey(str))
    {
      m localm = new V3/m;
      localm.<init>(paramp, paramf, paramh);
      ((Map)localObject2).put(str, localm);
      return localm;
    }
    paramf = new java/lang/IllegalStateException;
    paramf.<init>("createLocalRepo() called for existing repo.");
    throw paramf;
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      P();
    }
  }
  
  public class b
    implements Runnable
  {
    public b() {}
    
    public void run()
    {
      f0();
    }
  }
}

/* Location:
 * Qualified Name:     V3.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */