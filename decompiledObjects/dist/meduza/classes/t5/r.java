package t5;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v5.e0;
import v5.m;
import x6.b;

public final class r
  implements k
{
  public final Context a;
  public final ArrayList b;
  public final k c;
  public v d;
  public c e;
  public g f;
  public k g;
  public m0 h;
  public i i;
  public h0 j;
  public k k;
  
  public r(Context paramContext, k paramk)
  {
    a = paramContext.getApplicationContext();
    paramk.getClass();
    c = paramk;
    b = new ArrayList();
  }
  
  public static void q(k paramk, l0 paraml0)
  {
    if (paramk != null) {
      paramk.f(paraml0);
    }
  }
  
  public final long a(n paramn)
  {
    Object localObject1 = k;
    int m = 1;
    boolean bool;
    if (localObject1 == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
    localObject1 = a.getScheme();
    Object localObject3 = a;
    int n = e0.a;
    localObject3 = ((Uri)localObject3).getScheme();
    n = m;
    if (!TextUtils.isEmpty((CharSequence)localObject3)) {
      if ("file".equals(localObject3)) {
        n = m;
      } else {
        n = 0;
      }
    }
    if (n != 0)
    {
      localObject1 = a.getPath();
      if ((localObject1 == null) || (!((String)localObject1).startsWith("/android_asset/")))
      {
        if (d == null)
        {
          localObject1 = new v();
          d = ((v)localObject1);
          o((k)localObject1);
        }
        localObject1 = d;
        break label448;
      }
    }
    else
    {
      if (!"asset".equals(localObject1)) {
        break label160;
      }
    }
    localObject1 = p();
    break label448;
    label160:
    Object localObject2;
    if ("content".equals(localObject1))
    {
      if (f == null)
      {
        localObject1 = new g(a);
        f = ((g)localObject1);
        o((k)localObject1);
      }
      localObject1 = f;
    }
    else if ("rtmp".equals(localObject1))
    {
      if (g == null)
      {
        try
        {
          localObject1 = (k)Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
          g = ((k)localObject1);
          o((k)localObject1);
        }
        catch (Exception paramn)
        {
          throw new RuntimeException("Error instantiating RTMP extension", paramn);
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          m.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
        }
        if (g == null) {
          g = c;
        }
      }
      localObject2 = g;
    }
    else if ("udp".equals(localObject2))
    {
      if (h == null)
      {
        localObject2 = new m0();
        h = ((m0)localObject2);
        o((k)localObject2);
      }
      localObject2 = h;
    }
    else if ("data".equals(localObject2))
    {
      if (i == null)
      {
        localObject2 = new i();
        i = ((i)localObject2);
        o((k)localObject2);
      }
      localObject2 = i;
    }
    else if ((!"rawresource".equals(localObject2)) && (!"android.resource".equals(localObject2)))
    {
      localObject2 = c;
    }
    else
    {
      if (j == null)
      {
        localObject2 = new h0(a);
        j = ((h0)localObject2);
        o((k)localObject2);
      }
      localObject2 = j;
    }
    label448:
    k = ((k)localObject2);
    return ((k)localObject2).a(paramn);
  }
  
  /* Error */
  public final void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 65	t5/r:k	Lt5/k;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull +25 -> 31
    //   9: aload_1
    //   10: invokeinterface 200 1 0
    //   15: aload_0
    //   16: aconst_null
    //   17: putfield 65	t5/r:k	Lt5/k;
    //   20: goto +11 -> 31
    //   23: astore_1
    //   24: aload_0
    //   25: aconst_null
    //   26: putfield 65	t5/r:k	Lt5/k;
    //   29: aload_1
    //   30: athrow
    //   31: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	32	0	this	r
    //   4	6	1	localk	k
    //   23	7	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	15	23	finally
  }
  
  public final void f(l0 paraml0)
  {
    paraml0.getClass();
    c.f(paraml0);
    b.add(paraml0);
    q(d, paraml0);
    q(e, paraml0);
    q(f, paraml0);
    q(g, paraml0);
    q(h, paraml0);
    q(i, paraml0);
    q(j, paraml0);
  }
  
  public final Map<String, List<String>> h()
  {
    Object localObject = k;
    if (localObject == null) {
      localObject = Collections.emptyMap();
    } else {
      localObject = ((k)localObject).h();
    }
    return (Map<String, List<String>>)localObject;
  }
  
  public final Uri l()
  {
    Object localObject = k;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((k)localObject).l();
    }
    return (Uri)localObject;
  }
  
  public final void o(k paramk)
  {
    for (int m = 0; m < b.size(); m++) {
      paramk.f((l0)b.get(m));
    }
  }
  
  public final k p()
  {
    if (e == null)
    {
      c localc = new c(a);
      e = localc;
      o(localc);
    }
    return e;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    k localk = k;
    localk.getClass();
    return localk.read(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static final class a
    implements k.a
  {
    public final Context a;
    public final k.a b;
    public l0 c;
    
    public a(Context paramContext)
    {
      this(paramContext, new s.a());
    }
    
    public a(Context paramContext, k.a parama)
    {
      a = paramContext.getApplicationContext();
      b = parama;
    }
    
    public final r b()
    {
      r localr = new r(a, b.a());
      l0 locall0 = c;
      if (locall0 != null) {
        localr.f(locall0);
      }
      return localr;
    }
  }
}

/* Location:
 * Qualified Name:     t5.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */