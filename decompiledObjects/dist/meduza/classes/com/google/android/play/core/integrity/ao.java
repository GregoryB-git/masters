package com.google.android.play.core.integrity;

import f;

final class ao
  extends IntegrityTokenRequest
{
  private final String a;
  private final Long b;
  private final Object c;
  
  private static boolean a()
  {
    return true;
  }
  
  public final Long cloudProjectNumber()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof IntegrityTokenRequest))
    {
      Object localObject = (IntegrityTokenRequest)paramObject;
      if (a.equals(((IntegrityTokenRequest)localObject).nonce()))
      {
        Long localLong = b;
        localObject = ((IntegrityTokenRequest)localObject).cloudProjectNumber();
        if (localLong == null ? localObject == null : localLong.equals(localObject))
        {
          bool2 = true;
          break label76;
        }
      }
    }
    boolean bool2 = false;
    label76:
    if (((paramObject instanceof ao)) && (a()))
    {
      paramObject = (ao)paramObject;
      if (bool2)
      {
        paramObject = c;
        bool2 = bool1;
      }
      else
      {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    Long localLong = b;
    if (localLong == null) {
      j = 0;
    } else {
      j = localLong.hashCode();
    }
    i = (i ^ 0xF4243) * 1000003 ^ j;
    int j = i;
    if (a()) {
      j = i * 1000003;
    }
    return j;
  }
  
  public final String nonce()
  {
    return a;
  }
  
  public final String toString()
  {
    Object localObject = f.l("IntegrityTokenRequest{nonce=");
    ((StringBuilder)localObject).append(a);
    ((StringBuilder)localObject).append(", cloudProjectNumber=");
    ((StringBuilder)localObject).append(b);
    String str = ((StringBuilder)localObject).toString();
    localObject = str;
    if (a()) {
      localObject = str.concat(", network=null");
    }
    return ((String)localObject).concat("}");
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.ao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */