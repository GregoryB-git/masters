package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import java.util.Iterator;
import java.util.Map.Entry;

public final class O4
  implements Z4
{
  public final I4 a;
  public final x5 b;
  public final boolean c;
  public final O3 d;
  
  public O4(x5 paramx5, O3 paramO3, I4 paramI4)
  {
    b = paramx5;
    c = paramO3.d(paramI4);
    d = paramO3;
    a = paramI4;
  }
  
  public static O4 j(x5 paramx5, O3 paramO3, I4 paramI4)
  {
    return new O4(paramx5, paramO3, paramI4);
  }
  
  public final Object a()
  {
    I4 localI4 = a;
    if ((localI4 instanceof Y3)) {
      return ((Y3)localI4).y();
    }
    return localI4.d().i();
  }
  
  public final int b(Object paramObject)
  {
    x5 localx5 = b;
    int i = localx5.e(localx5.k(paramObject));
    int j = i;
    if (c) {
      j = i + d.b(paramObject).a();
    }
    return j;
  }
  
  public final boolean c(Object paramObject)
  {
    return d.b(paramObject).n();
  }
  
  public final void d(Object paramObject1, Object paramObject2)
  {
    a5.n(b, paramObject1, paramObject2);
    if (c) {
      a5.l(d, paramObject1, paramObject2);
    }
  }
  
  public final void e(Object paramObject)
  {
    b.l(paramObject);
    d.f(paramObject);
  }
  
  public final int f(Object paramObject)
  {
    int i = b.k(paramObject).hashCode();
    int j = i;
    if (c) {
      j = i * 53 + d.b(paramObject).hashCode();
    }
    return j;
  }
  
  public final void g(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, p3 paramp3)
  {
    paramArrayOfByte = (Y3)paramObject;
    if (zzb == v5.k()) {
      zzb = v5.l();
    }
    a.a(paramObject);
    throw null;
  }
  
  public final boolean h(Object paramObject1, Object paramObject2)
  {
    if (!b.k(paramObject1).equals(b.k(paramObject2))) {
      return false;
    }
    if (c) {
      return d.b(paramObject1).equals(d.b(paramObject2));
    }
    return true;
  }
  
  public final void i(Object paramObject, T5 paramT5)
  {
    Object localObject = d.b(paramObject).l();
    if (!((Iterator)localObject).hasNext())
    {
      localObject = b;
      ((x5)localObject).d(((x5)localObject).k(paramObject), paramT5);
      return;
    }
    a.a(((Map.Entry)((Iterator)localObject).next()).getKey());
    throw null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.O4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */