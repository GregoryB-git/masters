package i0;

import android.content.Context;
import android.net.Uri;
import d0.i;
import g0.M;
import g0.o;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class l
  implements g
{
  public final Context a;
  public final List b;
  public final g c;
  public g d;
  public g e;
  public g f;
  public g g;
  public g h;
  public g i;
  public g j;
  public g k;
  
  public l(Context paramContext, g paramg)
  {
    a = paramContext.getApplicationContext();
    c = ((g)g0.a.e(paramg));
    b = new ArrayList();
  }
  
  public void c(y paramy)
  {
    g0.a.e(paramy);
    c.c(paramy);
    b.add(paramy);
    y(d, paramy);
    y(e, paramy);
    y(f, paramy);
    y(g, paramy);
    y(h, paramy);
    y(i, paramy);
    y(j, paramy);
  }
  
  /* Error */
  public void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 78	i0/l:k	Li0/g;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull +25 -> 31
    //   9: aload_1
    //   10: invokeinterface 80 1 0
    //   15: aload_0
    //   16: aconst_null
    //   17: putfield 78	i0/l:k	Li0/g;
    //   20: goto +11 -> 31
    //   23: astore_1
    //   24: aload_0
    //   25: aconst_null
    //   26: putfield 78	i0/l:k	Li0/g;
    //   29: aload_1
    //   30: athrow
    //   31: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	32	0	this	l
    //   4	6	1	localg	g
    //   23	7	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	15	23	finally
  }
  
  public long e(k paramk)
  {
    boolean bool;
    if (k == null) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.f(bool);
    Object localObject = a.getScheme();
    if (M.D0(a))
    {
      localObject = a.getPath();
      if ((localObject == null) || (!((String)localObject).startsWith("/android_asset/")))
      {
        localObject = u();
        break label82;
      }
    }
    else
    {
      if (!"asset".equals(localObject)) {
        break label90;
      }
    }
    localObject = r();
    for (;;)
    {
      label82:
      k = ((g)localObject);
      break;
      label90:
      if ("content".equals(localObject)) {
        localObject = s();
      } else if ("rtmp".equals(localObject)) {
        localObject = w();
      } else if ("udp".equals(localObject)) {
        localObject = x();
      } else if ("data".equals(localObject)) {
        localObject = t();
      } else if ((!"rawresource".equals(localObject)) && (!"android.resource".equals(localObject))) {
        localObject = c;
      } else {
        localObject = v();
      }
    }
    return k.e(paramk);
  }
  
  public Map g()
  {
    Object localObject = k;
    if (localObject == null) {
      localObject = Collections.emptyMap();
    } else {
      localObject = ((g)localObject).g();
    }
    return (Map)localObject;
  }
  
  public Uri k()
  {
    Object localObject = k;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((g)localObject).k();
    }
    return (Uri)localObject;
  }
  
  public final void q(g paramg)
  {
    for (int m = 0; m < b.size(); m++) {
      paramg.c((y)b.get(m));
    }
  }
  
  public final g r()
  {
    if (e == null)
    {
      a locala = new a(a);
      e = locala;
      q(locala);
    }
    return e;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return ((g)g0.a.e(k)).read(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final g s()
  {
    if (f == null)
    {
      d locald = new d(a);
      f = locald;
      q(locald);
    }
    return f;
  }
  
  public final g t()
  {
    if (i == null)
    {
      e locale = new e();
      i = locale;
      q(locale);
    }
    return i;
  }
  
  public final g u()
  {
    if (d == null)
    {
      p localp = new p();
      d = localp;
      q(localp);
    }
    return d;
  }
  
  public final g v()
  {
    if (j == null)
    {
      w localw = new w(a);
      j = localw;
      q(localw);
    }
    return j;
  }
  
  public final g w()
  {
    if (g == null)
    {
      try
      {
        g localg = (g)Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
        g = localg;
        q(localg);
      }
      catch (Exception localException)
      {
        throw new RuntimeException("Error instantiating RTMP extension", localException);
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        o.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
      }
      if (g == null) {
        g = c;
      }
    }
    return g;
  }
  
  public final g x()
  {
    if (h == null)
    {
      z localz = new z();
      h = localz;
      q(localz);
    }
    return h;
  }
  
  public final void y(g paramg, y paramy)
  {
    if (paramg != null) {
      paramg.c(paramy);
    }
  }
  
  public static final class a
    implements g.a
  {
    public final Context a;
    public final g.a b;
    public y c;
    
    public a(Context paramContext)
    {
      this(paramContext, new m.b());
    }
    
    public a(Context paramContext, g.a parama)
    {
      a = paramContext.getApplicationContext();
      b = parama;
    }
    
    public l b()
    {
      l locall = new l(a, b.a());
      y localy = c;
      if (localy != null) {
        locall.c(localy);
      }
      return locall;
    }
  }
}

/* Location:
 * Qualified Name:     i0.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */