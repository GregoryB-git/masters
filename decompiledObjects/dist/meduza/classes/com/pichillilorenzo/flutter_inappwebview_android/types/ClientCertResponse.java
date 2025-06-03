package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import f;
import java.util.Map;

public class ClientCertResponse
{
  private Integer action;
  private String certificatePassword;
  private String certificatePath;
  private String keyStoreType;
  
  public ClientCertResponse(String paramString1, String paramString2, String paramString3, Integer paramInteger)
  {
    certificatePath = paramString1;
    certificatePassword = paramString2;
    keyStoreType = paramString3;
    action = paramInteger;
  }
  
  public static ClientCertResponse fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new ClientCertResponse((String)paramMap.get("certificatePath"), (String)paramMap.get("certificatePassword"), (String)paramMap.get("keyStoreType"), (Integer)paramMap.get("action"));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      Object localObject = (ClientCertResponse)paramObject;
      if (!certificatePath.equals(certificatePath)) {
        return false;
      }
      paramObject = certificatePassword;
      if (paramObject != null ? !((String)paramObject).equals(certificatePassword) : certificatePassword != null) {
        return false;
      }
      if (!keyStoreType.equals(keyStoreType)) {
        return false;
      }
      paramObject = action;
      localObject = action;
      if (paramObject != null) {
        bool = ((Integer)paramObject).equals(localObject);
      } else if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public Integer getAction()
  {
    return action;
  }
  
  public String getCertificatePassword()
  {
    return certificatePassword;
  }
  
  public String getCertificatePath()
  {
    return certificatePath;
  }
  
  public String getKeyStoreType()
  {
    return keyStoreType;
  }
  
  public int hashCode()
  {
    int i = certificatePath.hashCode();
    Object localObject = certificatePassword;
    int j = 0;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    i = j.e(keyStoreType, (i * 31 + k) * 31, 31);
    localObject = action;
    int k = j;
    if (localObject != null) {
      k = ((Integer)localObject).hashCode();
    }
    return i + k;
  }
  
  public void setAction(Integer paramInteger)
  {
    action = paramInteger;
  }
  
  public void setCertificatePassword(String paramString)
  {
    certificatePassword = paramString;
  }
  
  public void setCertificatePath(String paramString)
  {
    certificatePath = paramString;
  }
  
  public void setKeyStoreType(String paramString)
  {
    keyStoreType = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("ClientCertResponse{certificatePath='");
    j.s(localStringBuilder, certificatePath, '\'', ", certificatePassword='");
    j.s(localStringBuilder, certificatePassword, '\'', ", keyStoreType='");
    j.s(localStringBuilder, keyStoreType, '\'', ", action=");
    localStringBuilder.append(action);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */