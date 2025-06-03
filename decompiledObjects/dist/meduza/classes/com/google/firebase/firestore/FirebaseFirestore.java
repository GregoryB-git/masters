package com.google.firebase.firestore;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import d9.k0;
import d9.l0;
import d9.q;
import d9.s;
import d9.x;
import d9.y0;
import g9.f0;
import g9.u;
import j9.k;
import j9.k.b;
import j9.l;
import j9.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;
import m9.z;
import n9.a.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u7.j;
import x3.t;

public class FirebaseFirestore
{
  public final n9.i<g, g9.f> a;
  public final Context b;
  public final j9.f c;
  public final String d;
  public final e9.a e;
  public final e9.a f;
  public final u7.f g;
  public final y0 h;
  public final a i;
  public g j;
  public final x k;
  public final z l;
  public k0 m;
  
  public FirebaseFirestore(Context paramContext, j9.f paramf, String paramString, e9.d paramd, e9.b paramb, f paramf1, u7.f paramf2, h paramh, z paramz)
  {
    paramContext.getClass();
    b = paramContext;
    c = paramf;
    h = new y0(paramf);
    paramString.getClass();
    d = paramString;
    e = paramd;
    f = paramb;
    a = paramf1;
    k = new x(new e(this, 2));
    g = paramf2;
    i = paramh;
    l = paramz;
    j = new g.a().a();
  }
  
  public static FirebaseFirestore e(u7.f paramf, String paramString)
  {
    if (paramString != null)
    {
      h localh = (h)paramf.c(h.class);
      x6.b.B(localh, "Firestore component is not present.");
      try
      {
        FirebaseFirestore localFirebaseFirestore = (FirebaseFirestore)a.get(paramString);
        paramf = localFirebaseFirestore;
        if (localFirebaseFirestore == null)
        {
          paramf = f(c, b, d, e, paramString, localh, f);
          a.put(paramString, paramf);
        }
        return paramf;
      }
      finally {}
    }
    throw new NullPointerException("Provided database name must not be null.");
  }
  
  public static FirebaseFirestore f(Context paramContext, u7.f paramf, t9.a parama1, t9.a parama2, String paramString, h paramh, z paramz)
  {
    paramf.a();
    String str = c.g;
    if (str != null)
    {
      paramString = new j9.f(str, paramString);
      parama1 = new e9.d(parama1);
      parama2 = new e9.b(parama2);
      paramf.a();
      return new FirebaseFirestore(paramContext, paramString, b, parama1, parama2, new f(), paramf, paramh, paramz);
    }
    throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
  }
  
  public static void setClientLanguage(String paramString)
  {
    m9.v.j = paramString;
  }
  
  public final <T> T a(n9.i<u, T> parami)
  {
    return (T)k.a(parami);
  }
  
  public final Task<Void> b()
  {
    x localx = k;
    Object localObject1 = new s(this, 0);
    q localq = new q(1);
    try
    {
      t localt = new x3/t;
      localt.<init>(localx, 1);
      ??? = b;
      if (??? != null) {}
      Object localObject3;
      synchronized (d.a)
      {
        boolean bool = b;
        if (!bool) {
          localObject1 = localq.apply(localt);
        }
      }
      return (Task)localObject3;
    }
    finally {}
  }
  
  public final i c(String paramString)
  {
    if (paramString != null)
    {
      if (!paramString.contains("/"))
      {
        k.b();
        return new i(new f0(o.b, paramString), this);
      }
      throw new IllegalArgumentException(String.format("Invalid collectionId '%s'. Collection IDs must not contain '/'.", new Object[] { paramString }));
    }
    throw new NullPointerException("Provided collection ID must not be null.");
  }
  
  public final c d(String paramString)
  {
    if (paramString != null)
    {
      k.b();
      paramString = o.t(paramString);
      if (paramString.q() % 2 == 0) {
        return new c(new j9.i(paramString), this);
      }
      StringBuilder localStringBuilder = f.l("Invalid document reference. Document references must have an even number of segments, but ");
      localStringBuilder.append(paramString.h());
      localStringBuilder.append(" has ");
      localStringBuilder.append(paramString.q());
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    throw new NullPointerException("Provided document path must not be null.");
  }
  
  public final void g(g paramg)
  {
    if (paramg != null) {
      synchronized (c)
      {
        int n;
        if (k.b != null) {
          n = 1;
        } else {
          n = 0;
        }
        if ((n != 0) && (!j.equals(paramg)))
        {
          paramg = new java/lang/IllegalStateException;
          paramg.<init>("FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object.");
          throw paramg;
        }
        j = paramg;
        return;
      }
    }
    throw new NullPointerException("Provided settings must not be null.");
  }
  
  @Deprecated
  public final Task<Void> h(String paramString)
  {
    k.b();
    Object localObject1 = j;
    Object localObject2 = e;
    boolean bool;
    if (localObject2 != null) {
      bool = localObject2 instanceof l0;
    } else {
      bool = c;
    }
    if (bool)
    {
      localObject1 = new ArrayList();
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(paramString);
        if (((JSONObject)localObject2).has("indexes"))
        {
          JSONArray localJSONArray = ((JSONObject)localObject2).getJSONArray("indexes");
          for (int n = 0; n < localJSONArray.length(); n++)
          {
            paramString = localJSONArray.getJSONObject(n);
            localObject2 = paramString.getString("collectionGroup");
            ArrayList localArrayList = new java/util/ArrayList;
            localArrayList.<init>();
            Object localObject3 = paramString.optJSONArray("fields");
            for (int i1 = 0; (localObject3 != null) && (i1 < ((JSONArray)localObject3).length()); i1++)
            {
              paramString = ((JSONArray)localObject3).getJSONObject(i1);
              l locall = l.t(paramString.getString("fieldPath"));
              if ("CONTAINS".equals(paramString.optString("arrayConfig")))
              {
                paramString = new j9/d;
                paramString.<init>(locall, 3);
              }
              else if ("ASCENDING".equals(paramString.optString("order")))
              {
                paramString = new j9.d(locall, 1);
              }
              else
              {
                paramString = new j9.d(locall, 2);
              }
              localArrayList.add(paramString);
            }
            localObject3 = k.a;
            paramString = new j9/a;
            paramString.<init>(-1, (String)localObject2, localArrayList, (k.b)localObject3);
            ((ArrayList)localObject1).add(paramString);
          }
        }
        return (Task)k.a(new s(localObject1, 1));
      }
      catch (JSONException paramString)
      {
        throw new IllegalArgumentException("Failed to parse index configuration", paramString);
      }
    }
    throw new IllegalStateException("Cannot enable indexes when persistence is disabled");
  }
  
  public final Task<Void> i()
  {
    ??? = i;
    ??? = c.b;
    synchronized ((h)???)
    {
      a.remove(???);
      synchronized (k)
      {
        ((x)???).b();
        ??? = b.c();
        c.a.a.setCorePoolSize(0);
        return (Task<Void>)???;
      }
    }
  }
  
  public final void j(c paramc)
  {
    if (b == this) {
      return;
    }
    throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
  }
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.FirebaseFirestore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */