package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ClientCertChallenge
  extends URLAuthenticationChallenge
{
  private String[] keyTypes;
  private Principal[] principals;
  
  public ClientCertChallenge(URLProtectionSpace paramURLProtectionSpace, Principal[] paramArrayOfPrincipal, String[] paramArrayOfString)
  {
    super(paramURLProtectionSpace);
    principals = paramArrayOfPrincipal;
    keyTypes = paramArrayOfString;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      if (!super.equals(paramObject)) {
        return false;
      }
      paramObject = (ClientCertChallenge)paramObject;
      if (!Arrays.equals(principals, principals)) {
        return false;
      }
      return Arrays.equals(keyTypes, keyTypes);
    }
    return false;
  }
  
  public String[] getKeyTypes()
  {
    return keyTypes;
  }
  
  public Principal[] getPrincipals()
  {
    return principals;
  }
  
  public int hashCode()
  {
    return (super.hashCode() * 31 + Arrays.hashCode(principals)) * 31 + Arrays.hashCode(keyTypes);
  }
  
  public void setKeyTypes(String[] paramArrayOfString)
  {
    keyTypes = paramArrayOfString;
  }
  
  public void setPrincipals(Principal[] paramArrayOfPrincipal)
  {
    principals = paramArrayOfPrincipal;
  }
  
  public Map<String, Object> toMap()
  {
    Object localObject1 = principals;
    Object localObject2 = null;
    if (localObject1 != null)
    {
      localObject3 = new ArrayList();
      localObject4 = principals;
      int i = localObject4.length;
      for (int j = 0;; j++)
      {
        localObject1 = localObject3;
        if (j >= i) {
          break;
        }
        ((ArrayList)localObject3).add(localObject4[j].getName());
      }
    }
    localObject1 = null;
    Object localObject3 = super.toMap();
    ((Map)localObject3).put("principals", localObject1);
    Object localObject4 = keyTypes;
    localObject1 = localObject2;
    if (localObject4 != null) {
      localObject1 = Arrays.asList((Object[])localObject4);
    }
    ((Map)localObject3).put("keyTypes", localObject1);
    return (Map<String, Object>)localObject3;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("ClientCertChallenge{principals=");
    localStringBuilder.append(Arrays.toString(principals));
    localStringBuilder.append(", keyTypes=");
    localStringBuilder.append(Arrays.toString(keyTypes));
    localStringBuilder.append("} ");
    localStringBuilder.append(super.toString());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertChallenge
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */