package I3;

import H3.n;
import M3.g;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import t0.f;

public class i
{
  public final d a;
  public final n b;
  public String c;
  public final a d = new a(false);
  public final a e = new a(true);
  public final AtomicMarkableReference f = new AtomicMarkableReference(null, false);
  
  public i(String paramString, g paramg, n paramn)
  {
    c = paramString;
    a = new d(paramg);
    b = paramn;
  }
  
  public static i i(String paramString, g paramg, n paramn)
  {
    d locald = new d(paramg);
    paramg = new i(paramString, paramg, paramn);
    ((b)d.a.getReference()).e(locald.g(paramString, false));
    ((b)e.a.getReference()).e(locald.g(paramString, true));
    f.set(locald.h(paramString), false);
    return paramg;
  }
  
  public static String j(String paramString, g paramg)
  {
    return new d(paramg).h(paramString);
  }
  
  public Map e()
  {
    return d.b();
  }
  
  public Map f()
  {
    return e.b();
  }
  
  public String g()
  {
    return (String)f.getReference();
  }
  
  public final void k()
  {
    int i;
    synchronized (f)
    {
      boolean bool = f.isMarked();
      i = 0;
      if (bool)
      {
        String str1 = g();
        f.set(str1, false);
        i = 1;
      }
    }
    str2 = null;
    if (i != 0) {
      a.n(c, str2);
    }
  }
  
  public boolean l(String paramString1, String paramString2)
  {
    return d.f(paramString1, paramString2);
  }
  
  public boolean m(String paramString1, String paramString2)
  {
    return e.f(paramString1, paramString2);
  }
  
  public void n(String paramString)
  {
    Map localMap;
    synchronized (c)
    {
      c = paramString;
      localMap = d.b();
      if (g() != null) {
        a.n(paramString, g());
      }
    }
    if (!localMap.isEmpty()) {
      a.l(paramString, localMap);
    }
  }
  
  public void o(String arg1)
  {
    String str = b.c(???, 1024);
    synchronized (f)
    {
      if (H3.i.z(str, (String)f.getReference())) {
        return;
      }
    }
  }
  
  public class a
  {
    public final AtomicMarkableReference a;
    public final AtomicReference b = new AtomicReference(null);
    public final boolean c;
    
    public a(boolean paramBoolean)
    {
      c = paramBoolean;
      int i;
      if (paramBoolean) {
        i = 8192;
      } else {
        i = 1024;
      }
      a = new AtomicMarkableReference(new b(64, i), false);
    }
    
    public Map b()
    {
      return ((b)a.getReference()).a();
    }
    
    public final void d()
    {
      h localh = new h(this);
      if (f.a(b, null, localh)) {
        i.b(i.this).h(localh);
      }
    }
    
    public final void e()
    {
      try
      {
        if (a.isMarked())
        {
          Map localMap1 = ((b)a.getReference()).a();
          AtomicMarkableReference localAtomicMarkableReference = a;
          localAtomicMarkableReference.set((b)localAtomicMarkableReference.getReference(), false);
        }
      }
      finally
      {
        break label81;
      }
      Map localMap2 = null;
      if (localMap2 != null) {
        i.d(i.this).m(i.c(i.this), localMap2, c);
      }
      return;
      label81:
      throw localMap2;
    }
    
    public boolean f(String paramString1, String paramString2)
    {
      label53:
      try
      {
        if (!((b)a.getReference()).d(paramString1, paramString2)) {
          return false;
        }
      }
      finally
      {
        break label53;
        paramString1 = a;
        paramString1.set((b)paramString1.getReference(), true);
        d();
        return true;
      }
    }
  }
}

/* Location:
 * Qualified Name:     I3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */