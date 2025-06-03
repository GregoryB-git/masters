package com.google.firebase.firestore;

import d9.n;
import g9.l.a;
import java.util.List;
import java.util.Objects;
import q0.g;

public class e
{
  public static final class a
    extends e
  {
    public final List<e> a;
    public final int b;
    
    public a(List<e> paramList, Object paramObject)
    {
      a = paramList;
      b = paramObject;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (a.class == paramObject.getClass()))
      {
        paramObject = (a)paramObject;
        if ((b != b) || (!Objects.equals(a, a))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      List localList = a;
      int i = 0;
      int j;
      if (localList != null) {
        j = localList.hashCode();
      } else {
        j = 0;
      }
      int k = b;
      if (k != 0) {
        i = g.c(k);
      }
      return j * 31 + i;
    }
  }
  
  public static final class b
    extends e
  {
    public final n a;
    public final l.a b;
    public final Object c;
    
    public b(n paramn, l.a parama, Object paramObject)
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
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */