package y2;

import A2.c.c;
import A2.c.e;
import A2.i;
import A2.n;
import android.content.Context;
import android.os.Looper;
import java.util.Set;
import z2.j;

public final class a
{
  public final a a;
  public final g b;
  public final String c;
  
  public a(String paramString, a parama, g paramg)
  {
    n.j(parama, "Cannot construct an Api with a null ClientBuilder");
    n.j(paramg, "Cannot construct an Api with a null ClientKey");
    c = paramString;
    a = parama;
    b = paramg;
  }
  
  public final a a()
  {
    return a;
  }
  
  public final String b()
  {
    return c;
  }
  
  public static abstract class a
    extends a.e
  {
    public a.f a(Context paramContext, Looper paramLooper, A2.d paramd, Object paramObject, e.a parama, e.b paramb)
    {
      return b(paramContext, paramLooper, paramd, paramObject, parama, paramb);
    }
    
    public a.f b(Context paramContext, Looper paramLooper, A2.d paramd, Object paramObject, z2.d paramd1, j paramj)
    {
      throw new UnsupportedOperationException("buildClient must be implemented");
    }
  }
  
  public static abstract interface b {}
  
  public static abstract class c {}
  
  public static abstract interface d {}
  
  public static abstract class e {}
  
  public static abstract interface f
    extends a.b
  {
    public abstract boolean a();
    
    public abstract void b(c.e parame);
    
    public abstract void c();
    
    public abstract Set e();
    
    public abstract void f(String paramString);
    
    public abstract boolean g();
    
    public abstract int h();
    
    public abstract boolean i();
    
    public abstract x2.d[] j();
    
    public abstract String k();
    
    public abstract String l();
    
    public abstract boolean m();
    
    public abstract void o(i parami, Set paramSet);
    
    public abstract void p(c.c paramc);
  }
  
  public static final class g
    extends a.c
  {}
}

/* Location:
 * Qualified Name:     y2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */