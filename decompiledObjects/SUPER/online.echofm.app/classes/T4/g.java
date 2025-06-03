package T4;

import S.a;
import S.d.a;
import V5.o;
import V5.t;
import Z5.k;
import android.util.Log;
import g6.p;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import p6.I;

public final class g
{
  public static final b c = new b(null);
  public static final d.a d = S.f.a("firebase_sessions_enabled");
  public static final d.a e = S.f.b("firebase_sessions_sampling_rate");
  public static final d.a f = S.f.d("firebase_sessions_restart_timeout");
  public static final d.a g = S.f.d("firebase_sessions_cache_duration");
  public static final d.a h = S.f.e("firebase_sessions_cache_updated_time");
  public final P.f a;
  public e b;
  
  public g(P.f paramf)
  {
    a = paramf;
    p6.g.f(null, new a(this, null), 1, null);
  }
  
  public final boolean d()
  {
    Object localObject1 = b;
    Object localObject2 = null;
    Object localObject3 = localObject1;
    if (localObject1 == null)
    {
      Intrinsics.n("sessionConfigs");
      localObject3 = null;
    }
    localObject1 = ((e)localObject3).b();
    localObject3 = b;
    if (localObject3 == null)
    {
      Intrinsics.n("sessionConfigs");
      localObject3 = localObject2;
    }
    localObject3 = ((e)localObject3).a();
    return (localObject1 == null) || (localObject3 == null) || ((System.currentTimeMillis() - ((Long)localObject1).longValue()) / 'Ϩ' >= ((Integer)localObject3).intValue());
  }
  
  public final Integer e()
  {
    e locale1 = b;
    e locale2 = locale1;
    if (locale1 == null)
    {
      Intrinsics.n("sessionConfigs");
      locale2 = null;
    }
    return locale2.d();
  }
  
  public final Double f()
  {
    e locale1 = b;
    e locale2 = locale1;
    if (locale1 == null)
    {
      Intrinsics.n("sessionConfigs");
      locale2 = null;
    }
    return locale2.e();
  }
  
  public final Boolean g()
  {
    e locale1 = b;
    e locale2 = locale1;
    if (locale1 == null)
    {
      Intrinsics.n("sessionConfigs");
      locale2 = null;
    }
    return locale2.c();
  }
  
  public final Object h(d.a parama, Object paramObject, X5.d paramd)
  {
    if ((paramd instanceof c))
    {
      localObject1 = (c)paramd;
      i = q;
      if ((i & 0x80000000) != 0)
      {
        q = (i + Integer.MIN_VALUE);
        paramd = (X5.d)localObject1;
        break label54;
      }
    }
    paramd = new c(this, paramd);
    label54:
    Object localObject2 = o;
    Object localObject1 = Y5.b.c();
    int i = q;
    if (i != 0)
    {
      if (i == 1) {
        try
        {
          o.b(localObject2);
        }
        catch (IOException parama)
        {
          break label152;
        }
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      o.b(localObject2);
      localObject2 = a;
      d locald = new T4/g$d;
      locald.<init>(paramObject, parama, this, null);
      q = 1;
      parama = S.g.a((P.f)localObject2, locald, paramd);
      if (parama != localObject1) {
        break label183;
      }
      return localObject1;
    }
    label152:
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("Failed to update cache config value: ");
    ((StringBuilder)paramObject).append(parama);
    Log.w("SettingsCache", ((StringBuilder)paramObject).toString());
    label183:
    return t.a;
  }
  
  public final Object i(Double paramDouble, X5.d paramd)
  {
    paramDouble = h(e, paramDouble, paramd);
    if (paramDouble == Y5.b.c()) {
      return paramDouble;
    }
    return t.a;
  }
  
  public final Object j(Integer paramInteger, X5.d paramd)
  {
    paramInteger = h(g, paramInteger, paramd);
    if (paramInteger == Y5.b.c()) {
      return paramInteger;
    }
    return t.a;
  }
  
  public final Object k(Long paramLong, X5.d paramd)
  {
    paramLong = h(h, paramLong, paramd);
    if (paramLong == Y5.b.c()) {
      return paramLong;
    }
    return t.a;
  }
  
  public final void l(S.d paramd)
  {
    b = new e((Boolean)paramd.b(d), (Double)paramd.b(e), (Integer)paramd.b(f), (Integer)paramd.b(g), (Long)paramd.b(h));
  }
  
  public final Object m(Integer paramInteger, X5.d paramd)
  {
    paramInteger = h(f, paramInteger, paramd);
    if (paramInteger == Y5.b.c()) {
      return paramInteger;
    }
    return t.a;
  }
  
  public final Object n(Boolean paramBoolean, X5.d paramd)
  {
    paramBoolean = h(d, paramBoolean, paramd);
    if (paramBoolean == Y5.b.c()) {
      return paramBoolean;
    }
    return t.a;
  }
  
  public static final class a
    extends k
    implements p
  {
    public Object o;
    public int p;
    
    public a(g paramg, X5.d paramd)
    {
      super(paramd);
    }
    
    public final X5.d create(Object paramObject, X5.d paramd)
    {
      return new a(q, paramd);
    }
    
    public final Object invoke(I paramI, X5.d paramd)
    {
      return ((a)create(paramI, paramd)).invokeSuspend(t.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Object localObject1 = Y5.b.c();
      int i = p;
      Object localObject2;
      if (i != 0)
      {
        if (i == 1)
        {
          localObject1 = (g)o;
          o.b(paramObject);
          localObject2 = paramObject;
        }
        else
        {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        o.b(paramObject);
        paramObject = q;
        localObject2 = g.a((g)paramObject).b();
        o = paramObject;
        p = 1;
        localObject2 = s6.d.d((s6.b)localObject2, this);
        if (localObject2 == localObject1) {
          return localObject1;
        }
        localObject1 = paramObject;
      }
      g.c((g)localObject1, ((S.d)localObject2).d());
      return t.a;
    }
  }
  
  public static final class b {}
  
  public static final class c
    extends Z5.d
  {
    public int q;
    
    public c(g paramg, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      o = paramObject;
      q |= 0x80000000;
      return g.b(p, null, null, this);
    }
  }
  
  public static final class d
    extends k
    implements p
  {
    public int o;
    
    public d(Object paramObject, d.a parama, g paramg, X5.d paramd)
    {
      super(paramd);
    }
    
    public final Object a(a parama, X5.d paramd)
    {
      return ((d)create(parama, paramd)).invokeSuspend(t.a);
    }
    
    public final X5.d create(Object paramObject, X5.d paramd)
    {
      paramd = new d(q, r, s, paramd);
      p = paramObject;
      return paramd;
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Y5.b.c();
      if (o == 0)
      {
        o.b(paramObject);
        paramObject = (a)p;
        Object localObject = q;
        if (localObject != null) {
          ((a)paramObject).i(r, localObject);
        } else {
          ((a)paramObject).h(r);
        }
        g.c(s, (S.d)paramObject);
        return t.a;
      }
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
  }
}

/* Location:
 * Qualified Name:     T4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */