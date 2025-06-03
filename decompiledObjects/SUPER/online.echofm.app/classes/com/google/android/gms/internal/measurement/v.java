package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class v
  implements s
{
  public final String o;
  public final ArrayList p;
  
  public v(String paramString, List paramList)
  {
    o = paramString;
    paramString = new ArrayList();
    p = paramString;
    paramString.addAll(paramList);
  }
  
  public final String a()
  {
    return o;
  }
  
  public final ArrayList b()
  {
    return p;
  }
  
  public final s c()
  {
    return this;
  }
  
  public final Boolean d()
  {
    throw new IllegalStateException("Statement cannot be cast as Boolean");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof v)) {
      return false;
    }
    paramObject = (v)paramObject;
    Object localObject = o;
    if (localObject != null ? !((String)localObject).equals(o) : o != null) {
      return false;
    }
    localObject = p;
    paramObject = p;
    if (localObject != null) {
      return ((ArrayList)localObject).equals(paramObject);
    }
    return paramObject == null;
  }
  
  public final Double f()
  {
    throw new IllegalStateException("Statement cannot be cast as Double");
  }
  
  public final String g()
  {
    throw new IllegalStateException("Statement cannot be cast as String");
  }
  
  public final int hashCode()
  {
    Object localObject = o;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = p;
    if (localObject != null) {
      i = ((ArrayList)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public final Iterator k()
  {
    return null;
  }
  
  public final s s(String paramString, f3 paramf3, List paramList)
  {
    throw new IllegalStateException("Statement is not an evaluated entity");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */