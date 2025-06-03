package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;
import java.util.Map;

public class HttpAuthenticationChallenge
  extends URLAuthenticationChallenge
{
  private int previousFailureCount;
  public URLCredential proposedCredential;
  
  public HttpAuthenticationChallenge(URLProtectionSpace paramURLProtectionSpace, int paramInt, URLCredential paramURLCredential)
  {
    super(paramURLProtectionSpace);
    previousFailureCount = paramInt;
    proposedCredential = paramURLCredential;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      if (!super.equals(paramObject)) {
        return false;
      }
      Object localObject = (HttpAuthenticationChallenge)paramObject;
      if (previousFailureCount != previousFailureCount) {
        return false;
      }
      paramObject = proposedCredential;
      localObject = proposedCredential;
      if (paramObject != null) {
        bool = ((URLCredential)paramObject).equals(localObject);
      } else if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int getPreviousFailureCount()
  {
    return previousFailureCount;
  }
  
  public URLCredential getProposedCredential()
  {
    return proposedCredential;
  }
  
  public int hashCode()
  {
    int i = super.hashCode();
    int j = previousFailureCount;
    URLCredential localURLCredential = proposedCredential;
    int k;
    if (localURLCredential != null) {
      k = localURLCredential.hashCode();
    } else {
      k = 0;
    }
    return (i * 31 + j) * 31 + k;
  }
  
  public void setPreviousFailureCount(int paramInt)
  {
    previousFailureCount = paramInt;
  }
  
  public void setProposedCredential(URLCredential paramURLCredential)
  {
    proposedCredential = paramURLCredential;
  }
  
  public Map<String, Object> toMap()
  {
    Map localMap = super.toMap();
    localMap.put("previousFailureCount", Integer.valueOf(previousFailureCount));
    Object localObject = proposedCredential;
    if (localObject != null) {
      localObject = ((URLCredential)localObject).toMap();
    } else {
      localObject = null;
    }
    localMap.put("proposedCredential", localObject);
    localMap.put("failureResponse", null);
    localMap.put("error", null);
    return localMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("HttpAuthenticationChallenge{previousFailureCount=");
    localStringBuilder.append(previousFailureCount);
    localStringBuilder.append(", proposedCredential=");
    localStringBuilder.append(proposedCredential);
    localStringBuilder.append("} ");
    localStringBuilder.append(super.toString());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthenticationChallenge
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */