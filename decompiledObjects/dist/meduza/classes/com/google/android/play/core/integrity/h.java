package com.google.android.play.core.integrity;

import f;
import g;

final class h
  extends StandardIntegrityManager.StandardIntegrityTokenRequest
{
  private final String a;
  
  public final String a()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    boolean bool1 = paramObject instanceof StandardIntegrityManager.StandardIntegrityTokenRequest;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      Object localObject = (StandardIntegrityManager.StandardIntegrityTokenRequest)paramObject;
      paramObject = a;
      localObject = ((StandardIntegrityManager.StandardIntegrityTokenRequest)localObject).a();
      if (paramObject == null)
      {
        if (localObject != null) {
          bool3 = bool2;
        } else {
          return true;
        }
      }
      else {
        bool3 = ((String)paramObject).equals(localObject);
      }
    }
    return bool3;
  }
  
  public final int hashCode()
  {
    String str = a;
    int i;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    }
    return i ^ 0xF4243;
  }
  
  public final String toString()
  {
    return g.f(f.l("StandardIntegrityTokenRequest{requestHash="), a, "}");
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */