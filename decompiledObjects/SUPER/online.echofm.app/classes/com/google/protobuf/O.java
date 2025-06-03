package com.google.protobuf;

import android.support.v4.media.a;
import java.util.Iterator;
import java.util.Map.Entry;

public final class O
  implements Z
{
  public final K a;
  public final g0 b;
  public final boolean c;
  public final l d;
  
  public O(g0 paramg0, l paraml, K paramK)
  {
    b = paramg0;
    c = paraml.d(paramK);
    d = paraml;
    a = paramK;
  }
  
  private int i(g0 paramg0, Object paramObject)
  {
    return paramg0.c(paramg0.a(paramObject));
  }
  
  public static O j(g0 paramg0, l paraml, K paramK)
  {
    return new O(paramg0, paraml, paramK);
  }
  
  public void a(Object paramObject1, Object paramObject2)
  {
    b0.E(b, paramObject1, paramObject2);
    if (c) {
      b0.C(d, paramObject1, paramObject2);
    }
  }
  
  public void b(Object paramObject)
  {
    b.d(paramObject);
    d.e(paramObject);
  }
  
  public final boolean c(Object paramObject)
  {
    return d.b(paramObject).k();
  }
  
  public boolean d(Object paramObject1, Object paramObject2)
  {
    if (!b.a(paramObject1).equals(b.a(paramObject2))) {
      return false;
    }
    if (c) {
      return d.b(paramObject1).equals(d.b(paramObject2));
    }
    return true;
  }
  
  public int e(Object paramObject)
  {
    int i = i(b, paramObject);
    int j = i;
    if (c) {
      j = i + d.b(paramObject).f();
    }
    return j;
  }
  
  public Object f()
  {
    K localK = a;
    if ((localK instanceof r)) {
      return ((r)localK).P();
    }
    return localK.d().c();
  }
  
  public int g(Object paramObject)
  {
    int i = b.a(paramObject).hashCode();
    int j = i;
    if (c) {
      j = i * 53 + d.b(paramObject).hashCode();
    }
    return j;
  }
  
  public void h(Object paramObject, n0 paramn0)
  {
    Iterator localIterator = d.b(paramObject).n();
    if (!localIterator.hasNext())
    {
      k(b, paramObject, paramn0);
      return;
    }
    a.a(((Map.Entry)localIterator.next()).getKey());
    throw null;
  }
  
  public final void k(g0 paramg0, Object paramObject, n0 paramn0)
  {
    paramg0.g(paramg0.a(paramObject), paramn0);
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.O
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */