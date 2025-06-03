package com.google.firebase.firestore;

import d9.n;
import g9.l.a;
import java.util.Objects;

public final class e$b
  extends e
{
  public final n a;
  public final l.a b;
  public final Object c;
  
  public e$b(n paramn, l.a parama, Object paramObject)
  {
    a = paramn;
    b = parama;
    c = paramObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b.class == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      if ((b != b) || (!Objects.equals(a, a)) || (!Objects.equals(c, c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((n)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = b;
    int k;
    if (localObject != null) {
      k = localObject.hashCode();
    } else {
      k = 0;
    }
    localObject = c;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return (j * 31 + k) * 31 + i;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */