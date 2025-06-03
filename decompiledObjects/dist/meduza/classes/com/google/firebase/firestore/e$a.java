package com.google.firebase.firestore;

import java.util.List;
import java.util.Objects;
import q0.g;

public final class e$a
  extends e
{
  public final List<e> a;
  public final int b;
  
  public e$a(List<e> paramList, Object paramObject)
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

/* Location:
 * Qualified Name:     com.google.firebase.firestore.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */