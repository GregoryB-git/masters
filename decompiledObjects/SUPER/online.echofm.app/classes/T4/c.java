package T4;

import P.f;
import V2.j;
import V5.m;
import V5.o;
import V5.q;
import V5.t;
import W5.C;
import Z5.k;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import g6.p;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;
import s4.i;

public final class c
  implements h
{
  public static final a g = new a(null);
  public final X5.g a;
  public final i b;
  public final R4.b c;
  public final a d;
  public final g e;
  public final y6.a f;
  
  public c(X5.g paramg, i parami, R4.b paramb, a parama, f paramf)
  {
    a = paramg;
    b = parami;
    c = paramb;
    d = parama;
    e = new g(paramf);
    f = y6.c.b(false, 1, null);
  }
  
  public Boolean a()
  {
    return e.g();
  }
  
  public Double b()
  {
    return e.f();
  }
  
  public Object c(X5.d paramd)
  {
    if ((paramd instanceof b))
    {
      localb = (b)paramd;
      i = s;
      if ((i & 0x80000000) != 0)
      {
        s = (i + Integer.MIN_VALUE);
        break label45;
      }
    }
    b localb = new b(this, paramd);
    label45:
    Object localObject2 = q;
    Object localObject3 = Y5.b.c();
    int i = s;
    Object localObject5;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            y6.a locala = (y6.a)o;
            paramd = locala;
            try
            {
              o.b(localObject2);
            }
            finally
            {
              break label685;
            }
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        paramd = (y6.a)p;
        localObject7 = (c)o;
        localObject5 = paramd;
        try
        {
          o.b(localObject2);
        }
        finally
        {
          paramd = (X5.d)localObject5;
          localObject5 = locald1;
          break label685;
        }
      }
      paramd = (y6.a)p;
      localObject5 = (c)o;
      o.b(localObject2);
    }
    else
    {
      o.b(localObject2);
      if ((!f.c()) && (!e.d())) {
        return t.a;
      }
      paramd = f;
      o = this;
      p = paramd;
      s = 1;
      if (paramd.a(null, locald1) == localObject3) {
        return localObject3;
      }
      localObject5 = this;
    }
    try
    {
      if (!e.d())
      {
        localObject5 = t.a;
        paramd.b(null);
        return localObject5;
      }
    }
    finally
    {
      break label685;
    }
    Object localObject7 = b.a();
    Intrinsics.checkNotNullExpressionValue(localObject7, "firebaseInstallationsApi.id");
    o = localObject6;
    p = paramd;
    s = 2;
    localObject2 = z6.b.a((j)localObject7, locald1);
    if (localObject2 == localObject3) {
      return localObject3;
    }
    localObject7 = localObject6;
    X5.d locald2 = paramd;
    localObject2 = (String)localObject2;
    if (localObject2 == null)
    {
      locald2 = paramd;
      Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
      locald2 = paramd;
      localObject1 = t.a;
      paramd.b(null);
      return localObject1;
    }
    locald2 = paramd;
    localObject2 = q.a("X-Crashlytics-Installation-ID", localObject2);
    locald2 = paramd;
    Object localObject8 = x.a;
    locald2 = paramd;
    localObject8 = String.format("%s/%s", Arrays.copyOf(new Object[] { Build.MANUFACTURER, Build.MODEL }, 2));
    locald2 = paramd;
    Intrinsics.checkNotNullExpressionValue(localObject8, "format(format, *args)");
    locald2 = paramd;
    localObject8 = q.a("X-Crashlytics-Device-Model", ((c)localObject7).f((String)localObject8));
    locald2 = paramd;
    Object localObject9 = Build.VERSION.INCREMENTAL;
    locald2 = paramd;
    Intrinsics.checkNotNullExpressionValue(localObject9, "INCREMENTAL");
    locald2 = paramd;
    m localm = q.a("X-Crashlytics-OS-Build-Version", ((c)localObject7).f((String)localObject9));
    locald2 = paramd;
    localObject9 = Build.VERSION.RELEASE;
    locald2 = paramd;
    Intrinsics.checkNotNullExpressionValue(localObject9, "RELEASE");
    locald2 = paramd;
    localObject2 = C.f(new m[] { localObject2, localObject8, localm, q.a("X-Crashlytics-OS-Display-Version", ((c)localObject7).f((String)localObject9)), q.a("X-Crashlytics-API-Client-Version", c.f()) });
    locald2 = paramd;
    localObject9 = d;
    locald2 = paramd;
    localObject8 = new T4/c$c;
    locald2 = paramd;
    ((c)localObject8).<init>((c)localObject7, null);
    locald2 = paramd;
    localObject7 = new T4/c$d;
    locald2 = paramd;
    ((d)localObject7).<init>(null);
    locald2 = paramd;
    o = paramd;
    locald2 = paramd;
    p = null;
    locald2 = paramd;
    s = 3;
    locald2 = paramd;
    Object localObject1 = ((a)localObject9).a((Map)localObject2, (p)localObject8, (p)localObject7, (X5.d)localObject1);
    if (localObject1 == localObject3) {
      return localObject3;
    }
    locald2 = paramd;
    paramd = locald2;
    localObject1 = t.a;
    locald2.b(null);
    return t.a;
    label685:
    paramd.b(null);
    throw locald2;
  }
  
  public o6.a d()
  {
    Integer localInteger = e.e();
    Object localObject;
    if (localInteger != null)
    {
      localObject = o6.a.p;
      localObject = o6.a.h(o6.c.o(localInteger.intValue(), o6.d.s));
    }
    else
    {
      localObject = null;
    }
    return (o6.a)localObject;
  }
  
  public final String f(String paramString)
  {
    return new Regex("/").replace(paramString, "");
  }
  
  public static final class a {}
  
  public static final class b
    extends Z5.d
  {
    public Object o;
    public Object p;
    public int s;
    
    public b(c paramc, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      q = paramObject;
      s |= 0x80000000;
      return r.c(this);
    }
  }
  
  public static final class c
    extends k
    implements p
  {
    public Object o;
    public Object p;
    public int q;
    
    public c(c paramc, X5.d paramd)
    {
      super(paramd);
    }
    
    public final Object a(JSONObject paramJSONObject, X5.d paramd)
    {
      return ((c)create(paramJSONObject, paramd)).invokeSuspend(t.a);
    }
    
    public final X5.d create(Object paramObject, X5.d paramd)
    {
      paramd = new c(s, paramd);
      r = paramObject;
      return paramd;
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Object localObject1 = Y5.b.c();
      u localu;
      Object localObject6;
      switch (q)
      {
      default: 
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      case 6: 
        o.b(paramObject);
        break;
      case 5: 
        o.b(paramObject);
        break;
      case 4: 
        o.b(paramObject);
        break;
      case 3: 
        localu = (u)r;
        o.b(paramObject);
        break;
      case 2: 
        localu = (u)o;
        localObject3 = (u)r;
        o.b(paramObject);
        paramObject = localu;
        break;
      case 1: 
        localObject4 = (u)p;
        localu = (u)o;
        localObject3 = (u)r;
        o.b(paramObject);
        paramObject = localObject3;
        break;
      case 0: 
        o.b(paramObject);
        paramObject = (JSONObject)r;
        localObject5 = new u();
        localObject4 = new u();
        localObject3 = new u();
        if (((JSONObject)paramObject).has("app_quality"))
        {
          paramObject = ((JSONObject)paramObject).get("app_quality");
          Intrinsics.c(paramObject, "null cannot be cast to non-null type org.json.JSONObject");
          localObject6 = (JSONObject)paramObject;
          try
          {
            if (((JSONObject)localObject6).has("sessions_enabled")) {
              paramObject = (Boolean)((JSONObject)localObject6).get("sessions_enabled");
            }
          }
          catch (JSONException localJSONException1)
          {
            paramObject = null;
            break label348;
          }
          paramObject = null;
          try
          {
            if (((JSONObject)localObject6).has("sampling_rate")) {
              o = ((Double)((JSONObject)localObject6).get("sampling_rate"));
            }
          }
          catch (JSONException localJSONException2)
          {
            break label348;
          }
          if (((JSONObject)localObject6).has("session_timeout_seconds")) {
            o = ((Integer)((JSONObject)localObject6).get("session_timeout_seconds"));
          }
          localObject2 = paramObject;
          if (((JSONObject)localObject6).has("cache_duration"))
          {
            o = ((Integer)((JSONObject)localObject6).get("cache_duration"));
            localObject2 = paramObject;
            break label364;
            label348:
            Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", (Throwable)localObject2);
            localObject2 = paramObject;
          }
        }
        else
        {
          localObject2 = null;
        }
        label364:
        if (localObject2 == null) {
          break label429;
        }
        paramObject = c.e(s);
        r = localObject5;
        o = localObject4;
        p = localObject3;
        q = 1;
        if (((g)paramObject).n((Boolean)localObject2, this) == localObject1) {
          return localObject1;
        }
        paramObject = localObject5;
        localObject2 = localObject4;
        localObject4 = localObject3;
      }
      Object localObject5 = localObject2;
      Object localObject2 = paramObject;
      break label440;
      label429:
      localObject2 = localObject5;
      localObject5 = localObject4;
      Object localObject4 = localObject3;
      label440:
      paramObject = localObject4;
      Object localObject3 = localObject2;
      if ((Integer)o != null)
      {
        localObject6 = c.e(s);
        localObject5 = (Integer)o;
        r = localObject2;
        o = localObject4;
        p = null;
        q = 2;
        paramObject = localObject4;
        localObject3 = localObject2;
        if (((g)localObject6).m((Integer)localObject5, this) == localObject1) {
          return localObject1;
        }
      }
      localObject2 = paramObject;
      if ((Double)o != null)
      {
        localObject4 = c.e(s);
        localObject3 = (Double)o;
        r = paramObject;
        o = null;
        p = null;
        q = 3;
        localObject2 = paramObject;
        if (((g)localObject4).i((Double)localObject3, this) == localObject1) {
          return localObject1;
        }
      }
      if ((Integer)o != null)
      {
        paramObject = c.e(s);
        localObject2 = (Integer)o;
        r = null;
        o = null;
        p = null;
        q = 4;
        if (((g)paramObject).j((Integer)localObject2, this) == localObject1) {
          return localObject1;
        }
        paramObject = t.a;
      }
      else
      {
        paramObject = null;
      }
      if (paramObject == null)
      {
        localObject2 = c.e(s);
        paramObject = Z5.b.b(86400);
        r = null;
        o = null;
        p = null;
        q = 5;
        if (((g)localObject2).j((Integer)paramObject, this) == localObject1) {
          return localObject1;
        }
      }
      paramObject = c.e(s);
      localObject2 = Z5.b.c(System.currentTimeMillis());
      r = null;
      o = null;
      p = null;
      q = 6;
      if (((g)paramObject).k((Long)localObject2, this) == localObject1) {
        return localObject1;
      }
      return t.a;
    }
  }
  
  public static final class d
    extends k
    implements p
  {
    public int o;
    
    public d(X5.d paramd)
    {
      super(paramd);
    }
    
    public final Object a(String paramString, X5.d paramd)
    {
      return ((d)create(paramString, paramd)).invokeSuspend(t.a);
    }
    
    public final X5.d create(Object paramObject, X5.d paramd)
    {
      paramd = new d(paramd);
      p = paramObject;
      return paramd;
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Y5.b.c();
      if (o == 0)
      {
        o.b(paramObject);
        String str = (String)p;
        paramObject = new StringBuilder();
        ((StringBuilder)paramObject).append("Error failing to fetch the remote configs: ");
        ((StringBuilder)paramObject).append(str);
        Log.e("SessionConfigFetcher", ((StringBuilder)paramObject).toString());
        return t.a;
      }
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
  }
}

/* Location:
 * Qualified Name:     T4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */