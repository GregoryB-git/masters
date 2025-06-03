package ga;

import android.util.Log;
import dc.p;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import nc.d0;
import r0.d;
import r0.d.a;
import rb.f;
import rb.h;
import wb.c;
import x6.b;

public final class i
{
  public static final d.a<Boolean> c = b.j("firebase_sessions_enabled");
  public static final d.a<Double> d = new d.a("firebase_sessions_sampling_rate");
  public static final d.a<Integer> e = new d.a("firebase_sessions_restart_timeout");
  public static final d.a<Integer> f = new d.a("firebase_sessions_cache_duration");
  public static final d.a<Long> g = new d.a("firebase_sessions_cache_updated_time");
  public final o0.i<d> a;
  public g b;
  
  public i(o0.i<d> parami)
  {
    a = parami;
    b.p0(new a(this, null));
  }
  
  public static final void a(i parami, r0.a parama)
  {
    parami.getClass();
    b = new g((Boolean)parama.b(c), (Double)parama.b(d), (Integer)parama.b(e), (Integer)parama.b(f), (Long)parama.b(g));
  }
  
  public final boolean b()
  {
    Object localObject = b;
    if (localObject != null)
    {
      Long localLong = e;
      if (localObject != null)
      {
        localObject = d;
        return (localLong == null) || (localObject == null) || ((System.currentTimeMillis() - localLong.longValue()) / 'Ϩ' >= ((Integer)localObject).intValue());
      }
      ec.i.i("sessionConfigs");
      throw null;
    }
    ec.i.i("sessionConfigs");
    throw null;
  }
  
  public final <T> Object c(d.a<T> parama, T paramT, ub.e<? super h> parame)
  {
    if ((parame instanceof b))
    {
      localObject1 = (b)parame;
      i = c;
      if ((i & 0x80000000) != 0)
      {
        c = (i + Integer.MIN_VALUE);
        parame = (ub.e<? super h>)localObject1;
        break label54;
      }
    }
    parame = new b(this, parame);
    label54:
    Object localObject2 = a;
    Object localObject1 = vb.a.a;
    int i = c;
    if (i != 0)
    {
      if (i == 1) {
        try
        {
          f.b(localObject2);
        }
        catch (IOException paramT)
        {
          break label152;
        }
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject2);
      o0.i locali = a;
      localObject2 = new ga/i$c;
      ((c)localObject2).<init>(parama, this, paramT, null);
      c = 1;
      parama = r0.e.a(locali, (p)localObject2, parame);
      if (parama != localObject1) {
        break label183;
      }
      return localObject1;
    }
    label152:
    parama = new StringBuilder();
    parama.append("Failed to update cache config value: ");
    parama.append(paramT);
    Log.w("SettingsCache", parama.toString());
    label183:
    return h.a;
  }
  
  @wb.e(c="com.google.firebase.sessions.settings.SettingsCache$1", f="SettingsCache.kt", l={46}, m="invokeSuspend")
  public static final class a
    extends wb.i
    implements p<d0, ub.e<? super h>, Object>
  {
    public i a;
    public int b;
    
    public a(i parami, ub.e<? super a> parame)
    {
      super(parame);
    }
    
    public final ub.e<h> create(Object paramObject, ub.e<?> parame)
    {
      return new a(c, parame);
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      vb.a locala = vb.a.a;
      int i = b;
      i locali;
      if (i != 0)
      {
        if (i == 1)
        {
          locali = a;
          f.b(paramObject);
        }
        else
        {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        f.b(paramObject);
        locali = c;
        paramObject = a.getData();
        a = locali;
        b = 1;
        paramObject = b.U((qc.e)paramObject, this);
        if (paramObject == locala) {
          return locala;
        }
      }
      paramObject = ((d)paramObject).a();
      ec.i.e(paramObject, "<this>");
      i.a(locali, new r0.a(new LinkedHashMap((Map)paramObject), true));
      return h.a;
    }
  }
  
  @wb.e(c="com.google.firebase.sessions.settings.SettingsCache", f="SettingsCache.kt", l={119}, m="updateConfigValue")
  public static final class b<T>
    extends c
  {
    public int c;
    
    public b(i parami, ub.e<? super b> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      a = paramObject;
      c |= 0x80000000;
      i locali = b;
      paramObject = i.c;
      return locali.c(null, null, this);
    }
  }
  
  @wb.e(c="com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f="SettingsCache.kt", l={}, m="invokeSuspend")
  public static final class c
    extends wb.i
    implements p<r0.a, ub.e<? super h>, Object>
  {
    public c(d.a parama, i parami, Object paramObject, ub.e parame)
    {
      super(parame);
    }
    
    public final ub.e<h> create(Object paramObject, ub.e<?> parame)
    {
      Object localObject = b;
      parame = new c(c, d, localObject, parame);
      a = paramObject;
      return parame;
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((c)create((r0.a)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Object localObject = vb.a.a;
      f.b(paramObject);
      paramObject = (r0.a)a;
      localObject = b;
      if (localObject != null)
      {
        ((r0.a)paramObject).d(c, localObject);
      }
      else
      {
        localObject = c;
        paramObject.getClass();
        ec.i.e(localObject, "key");
        ((r0.a)paramObject).c();
        a.remove(localObject);
      }
      i.a(d, (r0.a)paramObject);
      return h.a;
    }
  }
}

/* Location:
 * Qualified Name:     ga.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */