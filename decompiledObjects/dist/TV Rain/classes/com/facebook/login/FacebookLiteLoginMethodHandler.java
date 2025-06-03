package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.NativeProtocol;

class FacebookLiteLoginMethodHandler
  extends NativeAppLoginMethodHandler
{
  public static final Parcelable.Creator<FacebookLiteLoginMethodHandler> CREATOR = new Parcelable.Creator()
  {
    public FacebookLiteLoginMethodHandler createFromParcel(Parcel paramAnonymousParcel)
    {
      return new FacebookLiteLoginMethodHandler(paramAnonymousParcel);
    }
    
    public FacebookLiteLoginMethodHandler[] newArray(int paramAnonymousInt)
    {
      return new FacebookLiteLoginMethodHandler[paramAnonymousInt];
    }
  };
  
  public FacebookLiteLoginMethodHandler(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public FacebookLiteLoginMethodHandler(LoginClient paramLoginClient)
  {
    super(paramLoginClient);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getNameForLogging()
  {
    return "fb_lite_login";
  }
  
  public int tryAuthorize(LoginClient.Request paramRequest)
  {
    String str = LoginClient.getE2E();
    paramRequest = NativeProtocol.createFacebookLiteIntent(loginClient.getActivity(), paramRequest.getApplicationId(), paramRequest.getPermissions(), str, paramRequest.isRerequest(), paramRequest.hasPublishPermission(), paramRequest.getDefaultAudience(), getClientState(paramRequest.getAuthId()), paramRequest.getAuthType());
    addLoggingExtra("e2e", str);
    return tryIntent(paramRequest, LoginClient.getLoginRequestCode());
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.FacebookLiteLoginMethodHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */