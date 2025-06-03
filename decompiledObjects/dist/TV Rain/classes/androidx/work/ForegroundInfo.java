package androidx.work;

import android.app.Notification;
import androidx.annotation.NonNull;

public final class ForegroundInfo
{
  private final int mForegroundServiceType;
  private final Notification mNotification;
  private final int mNotificationId;
  
  public ForegroundInfo(int paramInt, @NonNull Notification paramNotification)
  {
    this(paramInt, paramNotification, 0);
  }
  
  public ForegroundInfo(int paramInt1, @NonNull Notification paramNotification, int paramInt2)
  {
    mNotificationId = paramInt1;
    mNotification = paramNotification;
    mForegroundServiceType = paramInt2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (ForegroundInfo.class == paramObject.getClass()))
    {
      paramObject = (ForegroundInfo)paramObject;
      if (mNotificationId != mNotificationId) {
        return false;
      }
      if (mForegroundServiceType != mForegroundServiceType) {
        return false;
      }
      return mNotification.equals(mNotification);
    }
    return false;
  }
  
  public int getForegroundServiceType()
  {
    return mForegroundServiceType;
  }
  
  @NonNull
  public Notification getNotification()
  {
    return mNotification;
  }
  
  public int getNotificationId()
  {
    return mNotificationId;
  }
  
  public int hashCode()
  {
    int i = mNotificationId;
    int j = mForegroundServiceType;
    return mNotification.hashCode() + (i * 31 + j) * 31;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ForegroundInfo{");
    localStringBuilder.append("mNotificationId=");
    localStringBuilder.append(mNotificationId);
    localStringBuilder.append(", mForegroundServiceType=");
    localStringBuilder.append(mForegroundServiceType);
    localStringBuilder.append(", mNotification=");
    localStringBuilder.append(mNotification);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.work.ForegroundInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */