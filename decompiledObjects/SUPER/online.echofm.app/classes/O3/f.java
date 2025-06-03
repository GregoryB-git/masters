package O3;

import H3.C;
import H3.W;
import H3.x;
import H3.y;
import H3.z;
import V2.m;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class f
  implements i
{
  public final Context a;
  public final j b;
  public final g c;
  public final x d;
  public final a e;
  public final k f;
  public final y g;
  public final AtomicReference h;
  public final AtomicReference i;
  
  public f(Context paramContext, j paramj, x paramx, g paramg, a parama, k paramk, y paramy)
  {
    AtomicReference localAtomicReference = new AtomicReference();
    h = localAtomicReference;
    i = new AtomicReference(new V2.k());
    a = paramContext;
    b = paramj;
    d = paramx;
    c = paramg;
    e = parama;
    f = paramk;
    g = paramy;
    localAtomicReference.set(b.b(paramx));
  }
  
  public static f l(Context paramContext, String paramString1, C paramC, L3.b paramb, String paramString2, String paramString3, M3.g paramg, y paramy)
  {
    String str = paramC.g();
    W localW = new W();
    g localg = new g(localW);
    paramg = new a(paramg);
    paramb = new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[] { paramString1 }), paramb);
    return new f(paramContext, new j(paramString1, paramC.h(), paramC.i(), paramC.j(), paramC, H3.i.h(new String[] { H3.i.n(paramContext), paramString1, paramString3, paramString2 }), paramString3, paramString2, z.c(str).e()), localW, localg, paramg, paramb, paramy);
  }
  
  public V2.j a()
  {
    return ((V2.k)i.get()).a();
  }
  
  public d b()
  {
    return (d)h.get();
  }
  
  public boolean k()
  {
    return n().equals(b.f) ^ true;
  }
  
  public final d m(e parame)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localObject1;
    try
    {
      if (!e.p.equals(parame))
      {
        JSONObject localJSONObject = e.b();
        if (localJSONObject != null)
        {
          localObject3 = c.b(localJSONObject);
          if (localObject3 != null)
          {
            q(localJSONObject, "Loaded cached settings: ");
            long l = d.a();
            if ((!e.q.equals(parame)) && (((d)localObject3).a(l)))
            {
              E3.f.f().i("Cached settings have expired.");
              localObject3 = localObject1;
            }
          }
        }
      }
    }
    catch (Exception parame)
    {
      localObject3 = localObject2;
      break label154;
      try
      {
        E3.f.f().i("Returning cached settings.");
      }
      catch (Exception parame)
      {
        break label154;
      }
      E3.f.f().e("Failed to parse cached settings data.", null);
      localObject3 = localObject1;
      break label163;
      E3.f.f().b("No cached settings data found.");
      localObject3 = localObject1;
      break label163;
      label154:
      E3.f.f().e("Failed to get cached settings", parame);
    }
    label163:
    return (d)localObject3;
  }
  
  public final String n()
  {
    return H3.i.r(a).getString("existing_instance_identifier", "");
  }
  
  public V2.j o(e parame, Executor paramExecutor)
  {
    if (!k())
    {
      parame = m(parame);
      if (parame != null)
      {
        h.set(parame);
        ((V2.k)i.get()).e(parame);
        return m.e(null);
      }
    }
    parame = m(e.q);
    if (parame != null)
    {
      h.set(parame);
      ((V2.k)i.get()).e(parame);
    }
    return g.k(paramExecutor).p(paramExecutor, new a());
  }
  
  public V2.j p(Executor paramExecutor)
  {
    return o(e.o, paramExecutor);
  }
  
  public final void q(JSONObject paramJSONObject, String paramString)
  {
    E3.f localf = E3.f.f();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(paramJSONObject.toString());
    localf.b(localStringBuilder.toString());
  }
  
  public final boolean r(String paramString)
  {
    SharedPreferences.Editor localEditor = H3.i.r(a).edit();
    localEditor.putString("existing_instance_identifier", paramString);
    localEditor.apply();
    return true;
  }
  
  public class a
    implements V2.i
  {
    public a() {}
    
    public V2.j b(Void paramVoid)
    {
      Object localObject = f.d(f.this).a(f.c(f.this), true);
      if (localObject != null)
      {
        paramVoid = f.e(f.this).b((JSONObject)localObject);
        f.f(f.this).c(c, (JSONObject)localObject);
        f.g(f.this, (JSONObject)localObject, "Loaded settings: ");
        localObject = f.this;
        f.h((f)localObject, cf);
        f.i(f.this).set(paramVoid);
        ((V2.k)f.j(f.this).get()).e(paramVoid);
      }
      return m.e(null);
    }
  }
}

/* Location:
 * Qualified Name:     O3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */