package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;
import java.util.Locale;

class DeviceAuthDialog$RequestState
  implements Parcelable
{
  public static final Parcelable.Creator<RequestState> CREATOR = new Parcelable.Creator()
  {
    public DeviceAuthDialog.RequestState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new DeviceAuthDialog.RequestState(paramAnonymousParcel);
    }
    
    public DeviceAuthDialog.RequestState[] newArray(int paramAnonymousInt)
    {
      return new DeviceAuthDialog.RequestState[paramAnonymousInt];
    }
  };
  private String authorizationUri;
  private long interval;
  private long lastPoll;
  private String requestCode;
  private String userCode;
  
  public DeviceAuthDialog$RequestState() {}
  
  public DeviceAuthDialog$RequestState(Parcel paramParcel)
  {
    authorizationUri = paramParcel.readString();
    userCode = paramParcel.readString();
    requestCode = paramParcel.readString();
    interval = paramParcel.readLong();
    lastPoll = paramParcel.readLong();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAuthorizationUri()
  {
    return authorizationUri;
  }
  
  public long getInterval()
  {
    return interval;
  }
  
  public String getRequestCode()
  {
    return requestCode;
  }
  
  public String getUserCode()
  {
    return userCode;
  }
  
  public void setInterval(long paramLong)
  {
    interval = paramLong;
  }
  
  public void setLastPoll(long paramLong)
  {
    lastPoll = paramLong;
  }
  
  public void setRequestCode(String paramString)
  {
    requestCode = paramString;
  }
  
  public void setUserCode(String paramString)
  {
    userCode = paramString;
    authorizationUri = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[] { paramString });
  }
  
  public boolean withinLastRefreshWindow()
  {
    long l = lastPoll;
    boolean bool = false;
    if (l == 0L) {
      return false;
    }
    if (new Date().getTime() - lastPoll - interval * 1000L < 0L) {
      bool = true;
    }
    return bool;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(authorizationUri);
    paramParcel.writeString(userCode);
    paramParcel.writeString(requestCode);
    paramParcel.writeLong(interval);
    paramParcel.writeLong(lastPoll);
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.DeviceAuthDialog.RequestState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */