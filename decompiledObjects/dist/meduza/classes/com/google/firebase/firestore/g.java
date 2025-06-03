package com.google.firebase.firestore;

import d9.e0;
import d9.f0;
import d9.i0;
import d9.l0;
import f;
import java.util.Objects;

public final class g
{
  public final String a;
  public final boolean b;
  public final boolean c;
  public final long d;
  public e0 e;
  
  public g(a parama)
  {
    a = a;
    b = b;
    c = c;
    d = d;
    e = e;
  }
  
  @Deprecated
  public final long a()
  {
    Object localObject = e;
    if (localObject != null)
    {
      if ((localObject instanceof l0)) {
        return a;
      }
      localObject = a;
      if ((localObject instanceof i0))
      {
        ((i0)localObject).getClass();
        return 0L;
      }
      return -1L;
    }
    return d;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (g.class == paramObject.getClass()))
    {
      paramObject = (g)paramObject;
      if (b != b) {
        return false;
      }
      if (c != c) {
        return false;
      }
      if (d != d) {
        return false;
      }
      if (!a.equals(a)) {
        return false;
      }
      return Objects.equals(e, e);
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b;
    int k = c;
    long l = d;
    int m = (int)(l ^ l >>> 32);
    e0 locale0 = e;
    int n;
    if (locale0 != null) {
      n = locale0.hashCode();
    } else {
      n = 0;
    }
    return (((i * 31 + j) * 31 + k) * 31 + m) * 31 + n;
  }
  
  public final String toString()
  {
    Object localObject = f.l("FirebaseFirestoreSettings{host=");
    ((StringBuilder)localObject).append(a);
    ((StringBuilder)localObject).append(", sslEnabled=");
    ((StringBuilder)localObject).append(b);
    ((StringBuilder)localObject).append(", persistenceEnabled=");
    ((StringBuilder)localObject).append(c);
    ((StringBuilder)localObject).append(", cacheSizeBytes=");
    ((StringBuilder)localObject).append(d);
    ((StringBuilder)localObject).append(", cacheSettings=");
    ((StringBuilder)localObject).append(e);
    if (((StringBuilder)localObject).toString() == null)
    {
      localObject = "null";
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(e.toString());
      ((StringBuilder)localObject).append("}");
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  public static final class a
  {
    public String a = "firestore.googleapis.com";
    public boolean b = true;
    public boolean c = true;
    public long d = 104857600L;
    public e0 e;
    public boolean f = false;
    
    public final g a()
    {
      if ((!b) && (a.equals("firestore.googleapis.com"))) {
        throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
      }
      return new g(this);
    }
    
    public final void b(e0 parame0)
    {
      if (!f)
      {
        if ((!(parame0 instanceof f0)) && (!(parame0 instanceof l0))) {
          throw new IllegalArgumentException("Only MemoryCacheSettings and PersistentCacheSettings are accepted");
        }
        e = parame0;
        return;
      }
      throw new IllegalStateException("Deprecated setPersistenceEnabled() or setCacheSizeBytes() is already used, remove those first.");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */