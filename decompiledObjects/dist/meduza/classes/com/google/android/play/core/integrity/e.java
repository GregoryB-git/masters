package com.google.android.play.core.integrity;

import f;

final class e
  extends StandardIntegrityManager.PrepareIntegrityTokenRequest
{
  private final long a;
  
  public final int a()
  {
    return 0;
  }
  
  public final long b()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest))
    {
      paramObject = (StandardIntegrityManager.PrepareIntegrityTokenRequest)paramObject;
      if (a == ((StandardIntegrityManager.PrepareIntegrityTokenRequest)paramObject).b())
      {
        ((StandardIntegrityManager.PrepareIntegrityTokenRequest)paramObject).a();
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    long l = a;
    return ((int)(l ^ l >>> 32) ^ 0xF4243) * 1000003;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("PrepareIntegrityTokenRequest{cloudProjectNumber=");
    localStringBuilder.append(a);
    localStringBuilder.append(", webViewRequestMode=0}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */