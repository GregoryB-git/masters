package com.google.firebase.firestore;

import d9.u0;
import f;
import j9.g;
import j9.i;
import j9.n;
import java.util.HashMap;
import java.util.Map;
import ka.d0;
import ka.u;

public class d
{
  public final FirebaseFirestore a;
  public final i b;
  public final g c;
  public final u0 d;
  
  public d(FirebaseFirestore paramFirebaseFirestore, i parami, g paramg, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramFirebaseFirestore.getClass();
    a = paramFirebaseFirestore;
    parami.getClass();
    b = parami;
    c = paramg;
    d = new u0(paramBoolean2, paramBoolean1);
  }
  
  public HashMap a(a parama)
  {
    if (parama != null)
    {
      m localm = new m(a, parama);
      parama = c;
      if (parama == null) {
        parama = null;
      } else {
        parama = localm.a(parama.getData().b().Y().J());
      }
      return parama;
    }
    throw new NullPointerException("Provided serverTimestampBehavior value must not be null.");
  }
  
  public Map<String, Object> b()
  {
    return a(a.a);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof d)) {
      return false;
    }
    paramObject = (d)paramObject;
    if ((a.equals(a)) && (b.equals(b)) && (d.equals(d)))
    {
      g localg = c;
      if (localg == null ? c != null : (c != null) && (localg.getData().equals(c.getData()))) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    g localg = c;
    int k = 0;
    int m;
    if (localg != null) {
      m = localg.getKey().hashCode();
    } else {
      m = 0;
    }
    localg = c;
    if (localg != null) {
      k = localg.getData().hashCode();
    }
    return d.hashCode() + (((j + i * 31) * 31 + m) * 31 + k) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("DocumentSnapshot{key=");
    localStringBuilder.append(b);
    localStringBuilder.append(", metadata=");
    localStringBuilder.append(d);
    localStringBuilder.append(", doc=");
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static enum a
  {
    static
    {
      a locala1 = new a("NONE", 0);
      a = locala1;
      a locala2 = new a("ESTIMATE", 1);
      b = locala2;
      a locala3 = new a("PREVIOUS", 2);
      c = locala3;
      d = new a[] { locala1, locala2, locala3 };
    }
    
    public a() {}
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */