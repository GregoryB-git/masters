package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.Validate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LoginClient$Request
  implements Parcelable
{
  public static final Parcelable.Creator<Request> CREATOR = new Parcelable.Creator()
  {
    public LoginClient.Request createFromParcel(Parcel paramAnonymousParcel)
    {
      return new LoginClient.Request(paramAnonymousParcel, null);
    }
    
    public LoginClient.Request[] newArray(int paramAnonymousInt)
    {
      return new LoginClient.Request[paramAnonymousInt];
    }
  };
  private final String applicationId;
  private final String authId;
  private String authType;
  private final DefaultAudience defaultAudience;
  private String deviceAuthTargetUserId;
  private String deviceRedirectUriString;
  private boolean isRerequest;
  private final LoginBehavior loginBehavior;
  private Set<String> permissions;
  
  private LoginClient$Request(Parcel paramParcel)
  {
    boolean bool = false;
    isRerequest = false;
    Object localObject1 = paramParcel.readString();
    Object localObject2 = null;
    if (localObject1 != null) {
      localObject1 = LoginBehavior.valueOf((String)localObject1);
    } else {
      localObject1 = null;
    }
    loginBehavior = ((LoginBehavior)localObject1);
    localObject1 = new ArrayList();
    paramParcel.readStringList((List)localObject1);
    permissions = new HashSet((Collection)localObject1);
    String str = paramParcel.readString();
    localObject1 = localObject2;
    if (str != null) {
      localObject1 = DefaultAudience.valueOf(str);
    }
    defaultAudience = ((DefaultAudience)localObject1);
    applicationId = paramParcel.readString();
    authId = paramParcel.readString();
    if (paramParcel.readByte() != 0) {
      bool = true;
    }
    isRerequest = bool;
    deviceRedirectUriString = paramParcel.readString();
    authType = paramParcel.readString();
    deviceAuthTargetUserId = paramParcel.readString();
  }
  
  public LoginClient$Request(LoginBehavior paramLoginBehavior, Set<String> paramSet, DefaultAudience paramDefaultAudience, String paramString1, String paramString2, String paramString3)
  {
    isRerequest = false;
    loginBehavior = paramLoginBehavior;
    if (paramSet == null) {
      paramSet = new HashSet();
    }
    permissions = paramSet;
    defaultAudience = paramDefaultAudience;
    authType = paramString1;
    applicationId = paramString2;
    authId = paramString3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getApplicationId()
  {
    return applicationId;
  }
  
  public String getAuthId()
  {
    return authId;
  }
  
  public String getAuthType()
  {
    return authType;
  }
  
  public DefaultAudience getDefaultAudience()
  {
    return defaultAudience;
  }
  
  public String getDeviceAuthTargetUserId()
  {
    return deviceAuthTargetUserId;
  }
  
  public String getDeviceRedirectUriString()
  {
    return deviceRedirectUriString;
  }
  
  public LoginBehavior getLoginBehavior()
  {
    return loginBehavior;
  }
  
  public Set<String> getPermissions()
  {
    return permissions;
  }
  
  public boolean hasPublishPermission()
  {
    Iterator localIterator = permissions.iterator();
    while (localIterator.hasNext()) {
      if (LoginManager.isPublishPermission((String)localIterator.next())) {
        return true;
      }
    }
    return false;
  }
  
  public boolean isRerequest()
  {
    return isRerequest;
  }
  
  public void setAuthType(String paramString)
  {
    authType = paramString;
  }
  
  public void setDeviceAuthTargetUserId(String paramString)
  {
    deviceAuthTargetUserId = paramString;
  }
  
  public void setDeviceRedirectUriString(String paramString)
  {
    deviceRedirectUriString = paramString;
  }
  
  public void setPermissions(Set<String> paramSet)
  {
    Validate.notNull(paramSet, "permissions");
    permissions = paramSet;
  }
  
  public void setRerequest(boolean paramBoolean)
  {
    isRerequest = paramBoolean;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject1 = loginBehavior;
    Object localObject2 = null;
    if (localObject1 != null) {
      localObject1 = ((Enum)localObject1).name();
    } else {
      localObject1 = null;
    }
    paramParcel.writeString((String)localObject1);
    paramParcel.writeStringList(new ArrayList(permissions));
    DefaultAudience localDefaultAudience = defaultAudience;
    localObject1 = localObject2;
    if (localDefaultAudience != null) {
      localObject1 = localDefaultAudience.name();
    }
    paramParcel.writeString((String)localObject1);
    paramParcel.writeString(applicationId);
    paramParcel.writeString(authId);
    paramParcel.writeByte((byte)isRerequest);
    paramParcel.writeString(deviceRedirectUriString);
    paramParcel.writeString(authType);
    paramParcel.writeString(deviceAuthTargetUserId);
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.LoginClient.Request
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */