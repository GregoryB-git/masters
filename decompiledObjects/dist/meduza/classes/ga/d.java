package ga;

import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import b.a0;
import dc.p;
import ea.b;
import ea.q;
import ea.q.a;
import ec.s;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p2.m0;

public final class d
  implements j
{
  public final ub.h a;
  public final u9.d b;
  public final b c;
  public final a d;
  public final rb.g e;
  public final vc.d f;
  
  public d(ub.h paramh, u9.d paramd, b paramb, f paramf, o0.i parami)
  {
    a = paramh;
    b = paramd;
    c = paramb;
    d = paramf;
    e = b.z.n(new c(parami));
    f = a0.e();
  }
  
  public static String f(String paramString)
  {
    Pattern localPattern = Pattern.compile("/");
    ec.i.d(localPattern, "compile(...)");
    paramString = localPattern.matcher(paramString).replaceAll("");
    ec.i.d(paramString, "replaceAll(...)");
    return paramString;
  }
  
  public final Boolean a()
  {
    g localg = eb;
    if (localg != null) {
      return a;
    }
    ec.i.i("sessionConfigs");
    throw null;
  }
  
  public final mc.a b()
  {
    Object localObject = eb;
    mc.a locala = null;
    if (localObject != null)
    {
      localObject = c;
      if (localObject != null)
      {
        int i = mc.a.d;
        locala = new mc.a(m0.c0(((Integer)localObject).intValue(), mc.c.d));
      }
      return locala;
    }
    ec.i.i("sessionConfigs");
    throw null;
  }
  
  public final Double c()
  {
    g localg = eb;
    if (localg != null) {
      return b;
    }
    ec.i.i("sessionConfigs");
    throw null;
  }
  
  public final Object d(ub.e<? super rb.h> parame)
  {
    if ((parame instanceof a))
    {
      locala = (a)parame;
      i = e;
      if ((i & 0x80000000) != 0)
      {
        e = (i + Integer.MIN_VALUE);
        break label45;
      }
    }
    a locala = new a(this, parame);
    label45:
    Object localObject1 = c;
    vb.a locala1 = vb.a.a;
    int i = e;
    Object localObject3;
    Object localObject5;
    if (i != 0) {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            vc.a locala2 = (vc.a)a;
            parame = locala2;
            try
            {
              rb.f.b(localObject1);
            }
            finally
            {
              break label808;
            }
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        localObject3 = b;
        localObject5 = (d)a;
        parame = (ub.e<? super rb.h>)localObject3;
      }
    }
    try
    {
      rb.f.b(localObject1);
      break label347;
      localObject3 = b;
      localObject5 = (d)a;
      rb.f.b(localObject1);
      break label232;
      rb.f.b(localObject1);
      if ((!f.e()) && (!e().b())) {
        return rb.h.a;
      }
      localObject3 = f;
      a = this;
      b = ((vc.a)localObject3);
      e = 1;
      if (((vc.d)localObject3).b(locala) == locala1) {
        return locala1;
      }
      localObject5 = this;
      label232:
      parame = (ub.e<? super rb.h>)localObject3;
      if (!((d)localObject5).e().b())
      {
        parame = (ub.e<? super rb.h>)localObject3;
        Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
        parame = (ub.e<? super rb.h>)localObject3;
        localObject5 = rb.h.a;
        ((vc.a)localObject3).a(null);
        return localObject5;
      }
      parame = (ub.e<? super rb.h>)localObject3;
      localObject1 = q.c;
      parame = (ub.e<? super rb.h>)localObject3;
      Object localObject6 = b;
      parame = (ub.e<? super rb.h>)localObject3;
      a = localObject5;
      parame = (ub.e<? super rb.h>)localObject3;
      b = ((vc.a)localObject3);
      parame = (ub.e<? super rb.h>)localObject3;
      e = 2;
      parame = (ub.e<? super rb.h>)localObject3;
      localObject6 = ((q.a)localObject1).a((u9.d)localObject6, locala);
      localObject1 = localObject6;
      if (localObject6 == locala1) {
        return locala1;
      }
      label347:
      parame = (ub.e<? super rb.h>)localObject3;
      localObject6 = a;
      parame = (ub.e<? super rb.h>)localObject3;
      if (ec.i.a(localObject6, ""))
      {
        parame = (ub.e<? super rb.h>)localObject3;
        Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
        parame = (ub.e<? super rb.h>)localObject3;
        localObject5 = rb.h.a;
        ((vc.a)localObject3).a(null);
        return localObject5;
      }
      parame = (ub.e<? super rb.h>)localObject3;
      localObject1 = new rb/d;
      parame = (ub.e<? super rb.h>)localObject3;
      ((rb.d)localObject1).<init>("X-Crashlytics-Installation-ID", localObject6);
      parame = (ub.e<? super rb.h>)localObject3;
      localObject6 = String.format("%s/%s", Arrays.copyOf(new Object[] { Build.MANUFACTURER, Build.MODEL }, 2));
      parame = (ub.e<? super rb.h>)localObject3;
      ec.i.d(localObject6, "format(format, *args)");
      parame = (ub.e<? super rb.h>)localObject3;
      localObject5.getClass();
      parame = (ub.e<? super rb.h>)localObject3;
      Object localObject7 = f((String)localObject6);
      parame = (ub.e<? super rb.h>)localObject3;
      localObject6 = new rb/d;
      parame = (ub.e<? super rb.h>)localObject3;
      ((rb.d)localObject6).<init>("X-Crashlytics-Device-Model", localObject7);
      parame = (ub.e<? super rb.h>)localObject3;
      localObject7 = Build.VERSION.INCREMENTAL;
      parame = (ub.e<? super rb.h>)localObject3;
      ec.i.d(localObject7, "INCREMENTAL");
      parame = (ub.e<? super rb.h>)localObject3;
      Object localObject8 = f((String)localObject7);
      parame = (ub.e<? super rb.h>)localObject3;
      localObject7 = new rb/d;
      parame = (ub.e<? super rb.h>)localObject3;
      ((rb.d)localObject7).<init>("X-Crashlytics-OS-Build-Version", localObject8);
      parame = (ub.e<? super rb.h>)localObject3;
      localObject8 = Build.VERSION.RELEASE;
      parame = (ub.e<? super rb.h>)localObject3;
      ec.i.d(localObject8, "RELEASE");
      parame = (ub.e<? super rb.h>)localObject3;
      Object localObject9 = f((String)localObject8);
      parame = (ub.e<? super rb.h>)localObject3;
      localObject8 = new rb/d;
      parame = (ub.e<? super rb.h>)localObject3;
      ((rb.d)localObject8).<init>("X-Crashlytics-OS-Display-Version", localObject9);
      parame = (ub.e<? super rb.h>)localObject3;
      String str = c.c;
      parame = (ub.e<? super rb.h>)localObject3;
      localObject9 = new rb/d;
      parame = (ub.e<? super rb.h>)localObject3;
      ((rb.d)localObject9).<init>("X-Crashlytics-API-Client-Version", str);
      parame = (ub.e<? super rb.h>)localObject3;
      localObject7 = sb.z.K0(new rb.d[] { localObject1, localObject6, localObject7, localObject8, localObject9 });
      parame = (ub.e<? super rb.h>)localObject3;
      Log.d("SessionConfigFetcher", "Fetching settings from server.");
      parame = (ub.e<? super rb.h>)localObject3;
      localObject1 = d;
      parame = (ub.e<? super rb.h>)localObject3;
      localObject6 = new ga/d$b;
      parame = (ub.e<? super rb.h>)localObject3;
      ((b)localObject6).<init>((d)localObject5, null);
      parame = (ub.e<? super rb.h>)localObject3;
      localObject5 = new ga/d$c;
      parame = (ub.e<? super rb.h>)localObject3;
      ((c)localObject5).<init>(null);
      parame = (ub.e<? super rb.h>)localObject3;
      a = localObject3;
      parame = (ub.e<? super rb.h>)localObject3;
      b = null;
      parame = (ub.e<? super rb.h>)localObject3;
      e = 3;
      parame = (ub.e<? super rb.h>)localObject3;
      localObject5 = ((a)localObject1).a((Map)localObject7, (b)localObject6, (c)localObject5, locala);
      if (localObject5 == locala1) {
        return locala1;
      }
      parame = (ub.e<? super rb.h>)localObject3;
      localObject5 = rb.h.a;
      ((vc.a)localObject3).a(null);
      return rb.h.a;
    }
    finally {}
    label808:
    parame.a(null);
    throw ((Throwable)localObject4);
  }
  
  public final i e()
  {
    return (i)e.getValue();
  }
  
  @wb.e(c="com.google.firebase.sessions.settings.RemoteSettings", f="RemoteSettings.kt", l={170, 76, 94}, m="updateSettings")
  public static final class a
    extends wb.c
  {
    public Object a;
    public vc.a b;
    public int e;
    
    public a(d paramd, ub.e<? super a> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      c = paramObject;
      e |= 0x80000000;
      return d.d(this);
    }
  }
  
  @wb.e(c="com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f="RemoteSettings.kt", l={125, 128, 131, 133, 134, 136}, m="invokeSuspend")
  public static final class b
    extends wb.i
    implements p<JSONObject, ub.e<? super rb.h>, Object>
  {
    public s a;
    public s b;
    public int c;
    
    public b(d paramd, ub.e<? super b> parame)
    {
      super(parame);
    }
    
    public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
    {
      parame = new b(e, parame);
      d = paramObject;
      return parame;
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((b)create((JSONObject)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      vb.a locala = vb.a.a;
      Object localObject1;
      Object localObject5;
      switch (c)
      {
      default: 
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      case 6: 
        rb.f.b(paramObject);
        break;
      case 5: 
        rb.f.b(paramObject);
        break;
      case 4: 
        rb.f.b(paramObject);
        break;
      case 3: 
        localObject1 = (s)d;
        rb.f.b(paramObject);
        break;
      case 2: 
        localObject1 = a;
        localObject3 = (s)d;
        rb.f.b(paramObject);
        paramObject = localObject1;
        break;
      case 1: 
        localObject3 = b;
        localObject1 = a;
        localObject4 = (s)d;
        rb.f.b(paramObject);
        paramObject = localObject4;
        break;
      case 0: 
        rb.f.b(paramObject);
        paramObject = (JSONObject)d;
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Fetched settings: ");
        ((StringBuilder)localObject1).append(paramObject);
        Log.d("SessionConfigFetcher", ((StringBuilder)localObject1).toString());
        localObject5 = new s();
        localObject4 = new s();
        localObject3 = new s();
        if (((JSONObject)paramObject).has("app_quality"))
        {
          paramObject = ((JSONObject)paramObject).get("app_quality");
          ec.i.c(paramObject, "null cannot be cast to non-null type org.json.JSONObject");
          JSONObject localJSONObject = (JSONObject)paramObject;
          try
          {
            if (localJSONObject.has("sessions_enabled")) {
              paramObject = (Boolean)localJSONObject.get("sessions_enabled");
            } else {
              paramObject = null;
            }
            try
            {
              if (localJSONObject.has("sampling_rate")) {
                a = ((Double)localJSONObject.get("sampling_rate"));
              }
              if (localJSONObject.has("session_timeout_seconds")) {
                a = ((Integer)localJSONObject.get("session_timeout_seconds"));
              }
              localObject1 = paramObject;
              if (!localJSONObject.has("cache_duration")) {
                break label380;
              }
              a = ((Integer)localJSONObject.get("cache_duration"));
              localObject1 = paramObject;
            }
            catch (JSONException localJSONException1) {}
            Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", localJSONException2);
          }
          catch (JSONException localJSONException2)
          {
            paramObject = null;
          }
          localObject2 = paramObject;
        }
        else
        {
          localObject2 = null;
        }
        label380:
        if (localObject2 == null) {
          break label468;
        }
        paramObject = e;
        ((Boolean)localObject2).booleanValue();
        paramObject = ((d)paramObject).e();
        d = localObject5;
        a = ((s)localObject4);
        b = ((s)localObject3);
        c = 1;
        paramObject = ((i)paramObject).c(i.c, localObject2, this);
        if (paramObject != vb.a.a) {
          paramObject = rb.h.a;
        }
        if (paramObject == locala) {
          return locala;
        }
        paramObject = localObject5;
        localObject2 = localObject4;
      }
      Object localObject4 = localObject2;
      Object localObject2 = localObject3;
      break label474;
      label468:
      paramObject = localObject5;
      localObject2 = localObject3;
      label474:
      Object localObject3 = (Integer)a;
      if (localObject3 != null)
      {
        localObject5 = e;
        ((Number)localObject3).intValue();
        localObject3 = ((d)localObject5).e();
        localObject4 = (Integer)a;
        d = paramObject;
        a = ((s)localObject2);
        b = null;
        c = 2;
        localObject3 = ((i)localObject3).c(i.e, localObject4, this);
        if (localObject3 != vb.a.a) {
          localObject3 = rb.h.a;
        }
        if (localObject3 == locala) {
          return locala;
        }
      }
      localObject3 = paramObject;
      paramObject = localObject2;
      localObject4 = (Double)a;
      localObject2 = paramObject;
      if (localObject4 != null)
      {
        localObject2 = e;
        ((Number)localObject4).doubleValue();
        localObject2 = ((d)localObject2).e();
        localObject3 = (Double)a;
        d = paramObject;
        a = null;
        b = null;
        c = 3;
        localObject3 = ((i)localObject2).c(i.d, localObject3, this);
        if (localObject3 != vb.a.a) {
          localObject3 = rb.h.a;
        }
        localObject2 = paramObject;
        if (localObject3 == locala) {
          return locala;
        }
      }
      paramObject = (Integer)a;
      if (paramObject != null)
      {
        localObject3 = e;
        ((Number)paramObject).intValue();
        paramObject = ((d)localObject3).e();
        localObject2 = (Integer)a;
        d = null;
        a = null;
        b = null;
        c = 4;
        paramObject = ((i)paramObject).c(i.f, localObject2, this);
        if (paramObject != vb.a.a) {
          paramObject = rb.h.a;
        }
        if (paramObject == locala) {
          return locala;
        }
        paramObject = rb.h.a;
      }
      else
      {
        paramObject = null;
      }
      if (paramObject == null)
      {
        paramObject = e.e();
        localObject2 = new Integer(86400);
        d = null;
        a = null;
        b = null;
        c = 5;
        paramObject = ((i)paramObject).c(i.f, localObject2, this);
        if (paramObject != vb.a.a) {
          paramObject = rb.h.a;
        }
        if (paramObject == locala) {
          return locala;
        }
      }
      localObject2 = e.e();
      paramObject = new Long(System.currentTimeMillis());
      d = null;
      a = null;
      b = null;
      c = 6;
      paramObject = ((i)localObject2).c(i.g, paramObject, this);
      if (paramObject != vb.a.a) {
        paramObject = rb.h.a;
      }
      if (paramObject == locala) {
        return locala;
      }
      return rb.h.a;
    }
  }
  
  @wb.e(c="com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f="RemoteSettings.kt", l={}, m="invokeSuspend")
  public static final class c
    extends wb.i
    implements p<String, ub.e<? super rb.h>, Object>
  {
    public c(ub.e<? super c> parame)
    {
      super(parame);
    }
    
    public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
    {
      parame = new c(parame);
      a = paramObject;
      return parame;
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((c)create((String)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Object localObject = vb.a.a;
      rb.f.b(paramObject);
      localObject = (String)a;
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("Error failing to fetch the remote configs: ");
      ((StringBuilder)paramObject).append((String)localObject);
      Log.e("SessionConfigFetcher", ((StringBuilder)paramObject).toString());
      return rb.h.a;
    }
  }
}

/* Location:
 * Qualified Name:     ga.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */