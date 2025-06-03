package P4;

import C3.z;
import Q4.l;
import android.content.Context;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.b.b;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t3.a;

public class m
{
  public static final byte[] m = new byte[0];
  public final Context a;
  public final s3.e b;
  public final t3.c c;
  public final Executor d;
  public final Q4.e e;
  public final Q4.e f;
  public final Q4.e g;
  public final com.google.firebase.remoteconfig.internal.c h;
  public final l i;
  public final com.google.firebase.remoteconfig.internal.d j;
  public final s4.i k;
  public final Q4.m l;
  
  public m(Context paramContext, s3.e parame, s4.i parami, t3.c paramc, Executor paramExecutor, Q4.e parame1, Q4.e parame2, Q4.e parame3, com.google.firebase.remoteconfig.internal.c paramc1, l paraml, com.google.firebase.remoteconfig.internal.d paramd, Q4.m paramm)
  {
    a = paramContext;
    b = parame;
    k = parami;
    c = paramc;
    d = paramExecutor;
    e = parame1;
    f = parame2;
    g = parame3;
    h = paramc1;
    i = paraml;
    j = paramd;
    l = paramm;
  }
  
  public static List C(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    for (int n = 0; n < paramJSONArray.length(); n++)
    {
      HashMap localHashMap = new HashMap();
      JSONObject localJSONObject = paramJSONArray.getJSONObject(n);
      Iterator localIterator = localJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localHashMap.put(str, localJSONObject.getString(str));
      }
      localArrayList.add(localHashMap);
    }
    return localArrayList;
  }
  
  public static m o(s3.e parame)
  {
    return ((x)parame.k(x.class)).f();
  }
  
  public static boolean p(b paramb1, b paramb2)
  {
    boolean bool;
    if ((paramb2 != null) && (paramb1.g().equals(paramb2.g()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final V2.j A(Map paramMap)
  {
    try
    {
      paramMap = b.j().b(paramMap).a();
      return g.k(paramMap).p(z.a(), new g());
    }
    catch (JSONException paramMap)
    {
      Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", paramMap);
    }
    return V2.m.e(null);
  }
  
  public void B()
  {
    f.e();
    g.e();
    e.e();
  }
  
  public void D(JSONArray paramJSONArray)
  {
    if (c == null) {
      return;
    }
    try
    {
      paramJSONArray = C(paramJSONArray);
      c.m(paramJSONArray);
    }
    catch (a paramJSONArray) {}catch (JSONException paramJSONArray)
    {
      break label44;
    }
    Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", paramJSONArray);
    return;
    label44:
    Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", paramJSONArray);
  }
  
  public V2.j h()
  {
    V2.j localj1 = e.e();
    V2.j localj2 = f.e();
    return V2.m.i(new V2.j[] { localj1, localj2 }).h(d, new f(this, localj1, localj2));
  }
  
  public d i(c paramc)
  {
    return l.b(paramc);
  }
  
  public V2.j j()
  {
    V2.j localj1 = f.e();
    V2.j localj2 = g.e();
    V2.j localj3 = e.e();
    V2.j localj4 = V2.m.c(d, new i(this));
    return V2.m.i(new V2.j[] { localj1, localj2, localj3, localj4, k.a(), k.b(false) }).g(d, new j(localj4));
  }
  
  public V2.j k()
  {
    return h.i().p(z.a(), new k());
  }
  
  public V2.j l()
  {
    return k().p(d, new e(this));
  }
  
  public Map m()
  {
    return i.d();
  }
  
  public q n()
  {
    return j.c();
  }
  
  public final boolean w(V2.j paramj)
  {
    if (paramj.n())
    {
      e.d();
      if (paramj.j() != null) {
        D(((b)paramj.j()).d());
      } else {
        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
      }
      return true;
    }
    return false;
  }
  
  public V2.j x(s params)
  {
    return V2.m.c(d, new h(this, params));
  }
  
  public void y(boolean paramBoolean)
  {
    l.e(paramBoolean);
  }
  
  public V2.j z(Map paramMap)
  {
    HashMap localHashMap = new HashMap();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject1 = (Map.Entry)paramMap.next();
      Object localObject2 = ((Map.Entry)localObject1).getValue();
      boolean bool = localObject2 instanceof byte[];
      localObject1 = (String)((Map.Entry)localObject1).getKey();
      if (bool) {
        localHashMap.put(localObject1, new String((byte[])localObject2));
      } else {
        localHashMap.put(localObject1, localObject2.toString());
      }
    }
    return A(localHashMap);
  }
}

/* Location:
 * Qualified Name:     P4.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */