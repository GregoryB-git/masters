package com.facebook.login;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Collection;

public class DeviceLoginManager
  extends LoginManager
{
  private static volatile DeviceLoginManager instance;
  @Nullable
  private String deviceAuthTargetUserId;
  private Uri deviceRedirectUri;
  
  public static DeviceLoginManager getInstance()
  {
    if (CrashShieldHandler.isObjectCrashing(DeviceLoginManager.class)) {
      return null;
    }
    try
    {
      if (instance == null) {
        try
        {
          if (instance == null)
          {
            DeviceLoginManager localDeviceLoginManager1 = new com/facebook/login/DeviceLoginManager;
            localDeviceLoginManager1.<init>();
            instance = localDeviceLoginManager1;
          }
        }
        finally {}
      }
      DeviceLoginManager localDeviceLoginManager2 = instance;
      return localDeviceLoginManager2;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, DeviceLoginManager.class);
    }
    return null;
  }
  
  public LoginClient.Request createLoginRequest(Collection<String> paramCollection)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      paramCollection = super.createLoginRequest(paramCollection);
      Object localObject = getDeviceRedirectUri();
      if (localObject != null) {
        paramCollection.setDeviceRedirectUriString(((Uri)localObject).toString());
      }
      localObject = getDeviceAuthTargetUserId();
      if (localObject != null) {
        paramCollection.setDeviceAuthTargetUserId((String)localObject);
      }
      return paramCollection;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramCollection, this);
    }
    return null;
  }
  
  @Nullable
  public String getDeviceAuthTargetUserId()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      String str = deviceAuthTargetUserId;
      return str;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public Uri getDeviceRedirectUri()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      Uri localUri = deviceRedirectUri;
      return localUri;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public void setDeviceAuthTargetUserId(@Nullable String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      deviceAuthTargetUserId = paramString;
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public void setDeviceRedirectUri(Uri paramUri)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      deviceRedirectUri = paramUri;
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramUri, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.DeviceLoginManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */