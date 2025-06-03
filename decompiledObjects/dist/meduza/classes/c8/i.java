package c8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import b8.c1;
import b8.h0;
import b8.l0;
import b8.o0;
import b8.r;
import b8.s;
import b8.t0;
import b8.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m6.j;
import u7.f;

public final class i
  extends r
{
  public static final Parcelable.Creator<i> CREATOR = new h();
  public com.google.android.gms.internal.firebase-auth-api.zzagw a;
  public e b;
  public String c;
  public String d;
  public List<e> e;
  public List<String> f;
  public String o;
  public Boolean p;
  public k q;
  public boolean r;
  public c1 s;
  public e0 t;
  public List<t0> u;
  
  public i(com.google.android.gms.internal.firebase-auth-api.zzagw paramzzagw, e parame, String paramString1, String paramString2, ArrayList paramArrayList1, ArrayList paramArrayList2, String paramString3, Boolean paramBoolean, k paramk, boolean paramBoolean1, c1 paramc1, e0 parame0, ArrayList paramArrayList3)
  {
    a = paramzzagw;
    b = parame;
    c = paramString1;
    d = paramString2;
    e = paramArrayList1;
    f = paramArrayList2;
    o = paramString3;
    p = paramBoolean;
    q = paramk;
    r = paramBoolean1;
    s = paramc1;
    t = parame0;
    u = paramArrayList3;
  }
  
  public i(f paramf, ArrayList paramArrayList)
  {
    j.i(paramf);
    paramf.a();
    c = b;
    d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
    o = "2";
    J(paramArrayList);
  }
  
  public final String A()
  {
    return b.f;
  }
  
  public final k D()
  {
    return q;
  }
  
  public final List<? extends o0> F()
  {
    return e;
  }
  
  public final String G()
  {
    Object localObject1 = a;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    if (localObject1 != null)
    {
      localObject3 = localObject2;
      if (((com.google.android.gms.internal.firebase_auth_api.zzagw)localObject1).zzc() != null)
      {
        localObject1 = (Map)aa.zzc()).b.get("firebase");
        localObject3 = localObject2;
        if (localObject1 != null) {
          localObject3 = (String)((Map)localObject1).get("tenant");
        }
      }
    }
    return (String)localObject3;
  }
  
  public final boolean H()
  {
    Object localObject = p;
    if ((localObject == null) || (((Boolean)localObject).booleanValue()))
    {
      localObject = a;
      if (localObject != null)
      {
        localObject = (Map)azzcb.get("firebase");
        if (localObject != null) {
          localObject = (String)((Map)localObject).get("sign_in_provider");
        } else {
          localObject = null;
        }
      }
      else
      {
        localObject = "";
      }
      int i = e.size();
      boolean bool1 = true;
      if (i <= 1)
      {
        bool2 = bool1;
        if (localObject == null) {
          break label115;
        }
        if (!((String)localObject).equals("custom"))
        {
          bool2 = bool1;
          break label115;
        }
      }
      boolean bool2 = false;
      label115:
      p = Boolean.valueOf(bool2);
    }
    return p.booleanValue();
  }
  
  public final i J(List paramList)
  {
    try
    {
      j.i(paramList);
      Object localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>(paramList.size());
      e = ((List)localObject);
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>(paramList.size());
      f = ((List)localObject);
      for (int i = 0; i < paramList.size(); i++)
      {
        localObject = (o0)paramList.get(i);
        if (((o0)localObject).q().equals("firebase")) {
          b = ((e)localObject);
        } else {
          f.add(((o0)localObject).q());
        }
        e.add((e)localObject);
      }
      if (b == null) {
        b = ((e)e.get(0));
      }
      return this;
    }
    finally {}
  }
  
  public final f K()
  {
    return f.f(c);
  }
  
  public final void L(com.google.android.gms.internal.firebase-auth-api.zzagw paramzzagw)
  {
    j.i(paramzzagw);
    a = paramzzagw;
  }
  
  public final void N(List<t0> paramList)
  {
    Object localObject = paramList;
    if (paramList == null) {
      localObject = new ArrayList();
    }
    u = ((List)localObject);
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzagw O()
  {
    return a;
  }
  
  public final void P(List<x> paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (x)localIterator.next();
        if ((paramList instanceof h0)) {
          localArrayList1.add((h0)paramList);
        } else if ((paramList instanceof l0)) {
          localArrayList2.add((l0)paramList);
        }
      }
      paramList = new e0(localArrayList1, localArrayList2);
    }
    else
    {
      paramList = null;
    }
    t = paramList;
  }
  
  public final List<t0> Q()
  {
    return u;
  }
  
  public final String a()
  {
    return b.a;
  }
  
  public final Uri h()
  {
    return b.h();
  }
  
  public final boolean k()
  {
    return b.p;
  }
  
  public final String m()
  {
    return b.o;
  }
  
  public final String o()
  {
    return b.c;
  }
  
  public final String q()
  {
    return b.b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.E(paramParcel, 1, a, paramInt, false);
    z.E(paramParcel, 2, b, paramInt, false);
    z.F(paramParcel, 3, c, false);
    z.F(paramParcel, 4, d, false);
    z.I(paramParcel, 5, e, false);
    z.G(paramParcel, 6, f);
    z.F(paramParcel, 7, o, false);
    z.u(paramParcel, 8, Boolean.valueOf(H()));
    z.E(paramParcel, 9, q, paramInt, false);
    z.t(paramParcel, 10, r);
    z.E(paramParcel, 11, s, paramInt, false);
    z.E(paramParcel, 12, t, paramInt, false);
    z.I(paramParcel, 13, u, false);
    z.L(i, paramParcel);
  }
  
  public final String zzd()
  {
    return a.zzc();
  }
  
  public final String zze()
  {
    return a.zzf();
  }
  
  public final List<String> zzg()
  {
    return f;
  }
}

/* Location:
 * Qualified Name:     c8.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */