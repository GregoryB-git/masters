package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.FacebookSdk;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.NativeProtocol;
import java.util.List;

class KatanaProxyLoginMethodHandler
  extends NativeAppLoginMethodHandler
{
  public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new Parcelable.Creator()
  {
    public KatanaProxyLoginMethodHandler createFromParcel(Parcel paramAnonymousParcel)
    {
      return new KatanaProxyLoginMethodHandler(paramAnonymousParcel);
    }
    
    public KatanaProxyLoginMethodHandler[] newArray(int paramAnonymousInt)
    {
      return new KatanaProxyLoginMethodHandler[paramAnonymousInt];
    }
  };
  
  public KatanaProxyLoginMethodHandler(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public KatanaProxyLoginMethodHandler(LoginClient paramLoginClient)
  {
    super(paramLoginClient);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getNameForLogging()
  {
    return "katana_proxy_auth";
  }
  
  public boolean shouldKeepTrackOfMultipleIntents()
  {
    return true;
  }
  
  public int tryAuthorize(LoginClient.Request paramRequest)
  {
    Object localObject = paramRequest.getLoginBehavior();
    boolean bool;
    if ((FacebookSdk.ignoreAppSwitchToLoggedOut) && (CustomTabUtils.getChromePackage() != null) && (((LoginBehavior)localObject).allowsCustomTabAuth())) {
      bool = true;
    } else {
      bool = false;
    }
    localObject = LoginClient.getE2E();
    paramRequest = NativeProtocol.createProxyAuthIntents(loginClient.getActivity(), paramRequest.getApplicationId(), paramRequest.getPermissions(), (String)localObject, paramRequest.isRerequest(), paramRequest.hasPublishPermission(), paramRequest.getDefaultAudience(), getClientState(paramRequest.getAuthId()), paramRequest.getAuthType(), bool);
    addLoggingExtra("e2e", localObject);
    for (int i = 0; i < paramRequest.size(); i++) {
      if (tryIntent((Intent)paramRequest.get(i), LoginClient.getLoginRequestCode())) {
        return i + 1;
      }
    }
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.KatanaProxyLoginMethodHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */