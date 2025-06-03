package com.facebook.login;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class DeviceAuthMethodHandler
  extends LoginMethodHandler
{
  public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new Parcelable.Creator()
  {
    public DeviceAuthMethodHandler createFromParcel(Parcel paramAnonymousParcel)
    {
      return new DeviceAuthMethodHandler(paramAnonymousParcel);
    }
    
    public DeviceAuthMethodHandler[] newArray(int paramAnonymousInt)
    {
      return new DeviceAuthMethodHandler[paramAnonymousInt];
    }
  };
  private static ScheduledThreadPoolExecutor backgroundExecutor;
  
  public DeviceAuthMethodHandler(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public DeviceAuthMethodHandler(LoginClient paramLoginClient)
  {
    super(paramLoginClient);
  }
  
  public static ScheduledThreadPoolExecutor getBackgroundExecutor()
  {
    try
    {
      if (backgroundExecutor == null)
      {
        localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
        localScheduledThreadPoolExecutor.<init>(1);
        backgroundExecutor = localScheduledThreadPoolExecutor;
      }
      ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = backgroundExecutor;
      return localScheduledThreadPoolExecutor;
    }
    finally {}
  }
  
  private void showDialog(LoginClient.Request paramRequest)
  {
    FragmentActivity localFragmentActivity = loginClient.getActivity();
    if ((localFragmentActivity != null) && (!localFragmentActivity.isFinishing()))
    {
      DeviceAuthDialog localDeviceAuthDialog = createDeviceAuthDialog();
      localDeviceAuthDialog.show(localFragmentActivity.getSupportFragmentManager(), "login_with_facebook");
      localDeviceAuthDialog.startLogin(paramRequest);
    }
  }
  
  public DeviceAuthDialog createDeviceAuthDialog()
  {
    return new DeviceAuthDialog();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getNameForLogging()
  {
    return "device_auth";
  }
  
  public void onCancel()
  {
    LoginClient.Result localResult = LoginClient.Result.createCancelResult(loginClient.getPendingRequest(), "User canceled log in.");
    loginClient.completeAndValidate(localResult);
  }
  
  public void onError(Exception paramException)
  {
    paramException = LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), null, paramException.getMessage());
    loginClient.completeAndValidate(paramException);
  }
  
  public void onSuccess(String paramString1, String paramString2, String paramString3, Collection<String> paramCollection1, Collection<String> paramCollection2, Collection<String> paramCollection3, AccessTokenSource paramAccessTokenSource, Date paramDate1, Date paramDate2, Date paramDate3)
  {
    paramString1 = new AccessToken(paramString1, paramString2, paramString3, paramCollection1, paramCollection2, paramCollection3, paramAccessTokenSource, paramDate1, paramDate2, paramDate3);
    paramString1 = LoginClient.Result.createTokenResult(loginClient.getPendingRequest(), paramString1);
    loginClient.completeAndValidate(paramString1);
  }
  
  public int tryAuthorize(LoginClient.Request paramRequest)
  {
    showDialog(paramRequest);
    return 1;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.DeviceAuthMethodHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */